package com.soft.volume;

import android.content.Context;
import android.media.AudioManager;

import static android.content.Context.AUDIO_SERVICE;

public class SystemUtils {


    /**
     * 设置系统音量,并保存
     * @param context
     * @param volumeRate
     */
    public static void setVolume(Context context, int volumeRate){
        AudioManager manager = (AudioManager) context.getSystemService(AUDIO_SERVICE);
        int volume = (int) (getMaxVolume(context) / 100D * volumeRate);
        manager.setStreamVolume(AudioManager.STREAM_MUSIC, volume, 0);
        int currentVolume = SystemUtils.getCurrentVolume(context);
    }

    public static int getMaxVolume(Context context){
        AudioManager manager=(AudioManager) context.getSystemService(AUDIO_SERVICE);
        return manager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
    }


    public static int getCurrentVolume(Context context){
        AudioManager manager=(AudioManager) context.getSystemService(AUDIO_SERVICE);
        return manager.getStreamVolume(AudioManager.STREAM_MUSIC);
    }

}
