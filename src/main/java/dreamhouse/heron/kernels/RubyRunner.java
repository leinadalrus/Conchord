package dreamhouse.heron.kernels;

public class RubyRunner
{
  private final String[] runners;

  RubyRunner(String[] arguments)
  {
    this.runners = arguments;
  }

  String getRunner()
  {
    String successor = null;

    for (var i : runners)
    {
      successor = i;
      return i;
    }

    return null;
  }

  void setRunner(String runner)
  {
    for (var argument : this.runners)
      argument = runner;
  }
}
