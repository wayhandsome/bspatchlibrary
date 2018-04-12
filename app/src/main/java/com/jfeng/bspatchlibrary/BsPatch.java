package com.jfeng.bspatchlibrary;

/**
 * Created by jfeng on 2018/3/24.
 */
public class BsPatch
{
    // Used to load the 'bspatch' library on application startup.
    static
    {
        System.loadLibrary("bspatch");
    }

    /**
     * 将旧apk和增量包patch 合并成新包apk<br>
     * ./bspatch old.apk new2.apk old-to-new.patch
     * @param  oldApk 旧的apk完整路径
     * @param  newApk 指定新生成的apk完整路径
     * @param  patch 补丁包完整路径
     */
    public static native int bspatch(String oldApk, String newApk, String patch);
}
