public class QueueTest {

	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(5);
		
		newQueue.Enqueue("0");
		newQueue.Enqueue("1");
		newQueue.Enqueue("2");
		newQueue.Enqueue("3");
		newQueue.Denqueue();
		newQueue.Denqueue();
		newQueue.showQueue();
		newQueue.Enqueue("4");
		newQueue.Enqueue("5");

		newQueue.showQueue();

		newQueue.Enqueue("6");
		newQueue.showQueue();
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//
//		newQueue.showQueue();
//
//		newQueue.Enqueue("7");
//		newQueue.Enqueue("8");
//		newQueue.Enqueue("9");
//		newQueue.Enqueue("10");
//		newQueue.Enqueue("11");
//
//		newQueue.showQueue();
//
//		newQueue.Enqueue("12");
//
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//
//		newQueue.Enqueue("13");
//		newQueue.Enqueue("14");
//		newQueue.Enqueue("15");
//		newQueue.Enqueue("16");
//
//		newQueue.showQueue();
//
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//
//
//		newQueue.showQueue();

//		newQueue.Enqueue("4");
//		newQueue.showQueue();
//		newQueue.Enqueue("5");
//		newQueue.Enqueue("6");
//		newQueue.Enqueue("7");
//		newQueue.Enqueue("8");


//		newQueue.Enqueue("9");
//		newQueue.Denqueue();
//		newQueue.Denqueue();
//		newQueue.showQueue();
//		newQueue.Enqueue("10");
//		newQueue.Enqueue("11");
//		newQueue.showQueue();
//		newQueue.Enqueue("12");
//		newQueue.Enqueue("13");
//		newQueue.showQueue();
//		newQueue.Enqueue("teste penultima");
//		newQueue.showQueue();
//		System.out.println();
//		newQueue.Enqueue("Última");
//		newQueue.Enqueue("tabacolesos");
//		newQueue.showQueue();
	}

}
