extern "C"
int Java_pkg_Conchord_f__ILjava_lang_ecs_command(
  JNIEnv *env,    // Interface pointer.
  jobject obj,    // "this" pointer.
  jint argc,      // `argument : 1`
  jstring argv    // `argument : 2`
)
{
  const char *str_slice = env->GetStringUTFChars(argv, 0);
  env->ReleaseStringUTFChars(argv, str_slice);
  return 0;
}