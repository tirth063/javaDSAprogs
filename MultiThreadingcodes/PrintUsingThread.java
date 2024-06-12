package MultiThreadingcodes;

// A Class used to send a message
class Sender {
    public void send(int msg)
    {
        System.out.println("Sending\t" + msg);
        System.out.println(Thread.currentThread());
    }
}

// Class for send a message using Threads
class ThreadedSend extends Thread {
    private final int msg;
    final Sender sender;

    // Receives a message object and a string
    // message to be sent
    ThreadedSend(int m, Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized (sender)
        {
            // synchronizing the send object
            sender.send(msg);
        }
    }
}

// Driver class
class SyncDemo {
    public static void main(String args[]) {
        System.out.println(System.currentTimeMillis());
        Sender send = new Sender();
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0){
                ThreadedSend S1 = new ThreadedSend(i, send);
                S1.start();
                try{
                    S1.join();
                }catch (Exception e) {
                    System.out.println("Interrupted");
                }

            }else{
                try {
                    ThreadedSend S2 = new ThreadedSend(i, send);

                    // Start two threads of ThreadedSend type

                    S2.start();

                    // wait for threads to end
                    S2.join();
                }
                catch (Exception e) {
                    System.out.println("Interrupted");
                }
            }
        }
        System.out.println(System.currentTimeMillis());
    }
}
