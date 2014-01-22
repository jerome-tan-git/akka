import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;


public class TestAkkaLocal extends UntypedActor{
	 public static void main( String[] args )
	 {
		 ActorSystem system = ActorSystem.create("MySystem");
		 ActorRef actor = system.actorOf(Props.create(TestAkkaLocal.class), "greeter");
		 actor.tell("Charlie Parker", ActorRef.noSender());
		 System.out.println("a1");

	 }
	@Override
	public void onReceive(Object arg0) throws Exception {
		Thread.sleep(5000);
		System.out.println(arg0+" | "+this.getSender());
		
		
	}

}
