package DreamHouse.Conchord.Interops;


public class StarfarerECSCommand
{
  static
  {
    System.loadLibrary("Java_pkg_Conchord_f__ILjava_lang_ecs_command");
  }

  native int conchord_ecs_cls(int argc, String[] argv);
}
