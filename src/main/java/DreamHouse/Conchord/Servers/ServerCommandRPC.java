package DreamHouse.Conchord.Servers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class ServerCommandRPC
{
  private class SessionmapTuple
  {
    public float x, y, z, w;
  }

  @RabbitListener(queues = "conchord.rpc.requests")
  public int TuplesW(SessionmapTuple sessionmapTuple)
  {
    return 0;
  }
}
