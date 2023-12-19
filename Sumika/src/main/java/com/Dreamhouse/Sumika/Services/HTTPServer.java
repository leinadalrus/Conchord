package com.Dreamhouse.Sumika.Services;

import java.net.ServerSocket;

// NOTE(Runnable): Runnable is an interface,
// hence the 'implements' keyword.
// Runnable is also a Command design-pattern model-
// -managing components/compositions...
public class HTTPServer implements Runnable
{
  private final int portNo = 3000;
  protected Thread mainThread;
  protected ServerSocket serverSocket = null;

  public HTTPServer(int _portNo)
  {
  }

  public void Execute()
  {
    synchronized (this)
    {
      this.mainThread = Thread.currentThread();
    }
  }

  @Override
  public void run()
  {
    
  }
}
