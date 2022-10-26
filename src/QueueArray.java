public class QueueArray implements IQueue{
	public int sizeArray;
	public int start=0;
	public int end=0;
	
	 public Object QueueElements[];
	
	
	public QueueArray(int sizeArray) {
		this.QueueElements = new Object[sizeArray];
		this.sizeArray = sizeArray;
	}

	public void Enqueue(Object element) {
		// enfileirar
		if(sizeQueue() == sizeArray-1) {
			System.out.println("Fila cheia, hora de duplicar");
			this.duplicaArray(); //duplica quando chega no final sem ter adicionado um elemento q necessita da duplicação
		}
		this.QueueElements[end] = element;
		end = (end+1) % sizeArray;
		
	}


	public Object Denqueue() throws emptyQueueException {
		//desenfileirar
		if(isEmptyQueue()) {
			throw new emptyQueueException("Fila vazia");
		}
		// quando o chegar no último elemento ele precisa retornar para o começo pois é circular (os novos últimos elementos vão para lá)
		if(this.start == this.sizeArray)
			this.start = 0;

		QueueElements[start]=null;
		start +=1;
		return QueueElements;
	}


	public int sizeQueue() {		
		return (sizeArray - start + end) % sizeArray;
	}

	public boolean isEmptyQueue() {
		return (start==end);
	}
	
	public void showQueue() {
		
		for(int i=0;i< this.QueueElements.length;i++) {			
			System.out.print("["+ QueueElements[i] +"]");
		}
		System.out.println();
	}

	public void duplicaArray(){
		int novoArray = this.QueueElements.length * 2;
		this.sizeArray *= 2;
		Object arrayDuplicado[] = new Object[novoArray];
		int endProvisorio = 0;

		if(this.start != 0){
			for(int i = 0 ; this.start < this.QueueElements.length ; i++){
				arrayDuplicado[i] = this.QueueElements[this.start]; // colocar o elemento do inicio do array antigo no inicio [0] do novo array
				this.start += 1; // aumentando o inicio da fila
				endProvisorio += 1; // aumentando o final da fila
			}
			this.start = 0; // reseta o start

			for(int i = 0 ; i < this.end ; i++){
				arrayDuplicado[endProvisorio] = this.QueueElements[i];
				endProvisorio += 1;
			}

			this.end = endProvisorio;
			this.QueueElements = arrayDuplicado;
		} else {
			for(int i=0; i<this.end; i++){
				arrayDuplicado[i] = this.QueueElements[i];
			}
			this.QueueElements = arrayDuplicado;

		}


	}

//[12] [13] [14] [15] [16] [null] [null] [null] [10] [11]





//	public void duplicaArray(){
//		int novoSize = this.QueueElements.length * 2;
//		Object novoArray[] = new Object[novoSize];
//
//		// copiar elementos
//		for(int i=0; i<=this.end; i++){
//			novoArray[i] = this.QueueElements[i];
//		}
//		this.sizeArray *=2;
//		this.QueueElements = novoArray;
//		this.end = this.sizeQueue();
//
//	}

}
