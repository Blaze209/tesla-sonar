package org.godotengine.godot;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import org.godotengine.godot.input.GodotEditText;

/* JADX INFO: loaded from: classes10.dex */
public class GodotIO {
    protected static final String PREFS_DEVICE_ID = "device_id";
    protected static final String PREFS_FILE = "device_id.xml";
    public static final int SYSTEM_DIR_DCIM = 1;
    public static final int SYSTEM_DIR_DESKTOP = 0;
    public static final int SYSTEM_DIR_DOCUMENTS = 2;
    public static final int SYSTEM_DIR_DOWNLOADS = 3;
    public static final int SYSTEM_DIR_MOVIES = 4;
    public static final int SYSTEM_DIR_MUSIC = 5;
    public static final int SYSTEM_DIR_PICTURES = 6;
    public static final int SYSTEM_DIR_RINGTONES = 7;
    public static String unique_id = "";
    final Activity activity;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    AssetManager f99302am;
    private Object buf;
    GodotEditText edit;
    private Thread mAudioThread;
    private AudioTrack mAudioTrack;
    MediaPlayer mediaPlayer;
    final int SCREEN_LANDSCAPE = 0;
    final int SCREEN_PORTRAIT = 1;
    final int SCREEN_REVERSE_LANDSCAPE = 2;
    final int SCREEN_REVERSE_PORTRAIT = 3;
    final int SCREEN_SENSOR_LANDSCAPE = 4;
    final int SCREEN_SENSOR_PORTRAIT = 5;
    final int SCREEN_SENSOR = 6;
    public int last_file_id = 1;
    public int last_dir_id = 1;
    SparseArray<AssetData> streams = new SparseArray<>();
    SparseArray<AssetDir> dirs = new SparseArray<>();

    class AssetData {
        public boolean eof = false;

        /* JADX INFO: renamed from: is, reason: collision with root package name */
        public InputStream f99303is;
        public int len;
        public String path;
        public int pos;

        AssetData() {
        }
    }

    class AssetDir {
        public int current;
        public String[] files;
        public String path;

        AssetDir() {
        }
    }

    GodotIO(Activity activity) {
        this.f99302am = activity.getAssets();
        this.activity = activity;
    }

    public Object audioInit(int i11, int i12) {
        System.out.printf("audioInit: initializing audio:\n", new Object[0]);
        int iMax = Math.max(i12, (AudioTrack.getMinBufferSize(i11, 12, 2) + 3) / 4);
        this.mAudioTrack = new AudioTrack(3, i11, 12, 2, iMax * 4, 1);
        audioStartThread();
        short[] sArr = new short[iMax * 2];
        this.buf = sArr;
        return sArr;
    }

    public void audioPause(boolean z11) {
        if (z11) {
            this.mAudioTrack.pause();
        } else {
            this.mAudioTrack.play();
        }
    }

    public void audioQuit() {
        Thread thread = this.mAudioThread;
        if (thread != null) {
            try {
                thread.join();
            } catch (Exception e11) {
                Log.v("Godot", "Problem stopping audio thread: " + e11);
            }
            this.mAudioThread = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.mAudioTrack = null;
        }
    }

    public void audioStartThread() {
        Thread thread = new Thread(new Runnable() { // from class: org.godotengine.godot.GodotIO.1
            @Override // java.lang.Runnable
            public void run() {
                GodotIO.this.mAudioTrack.play();
                GodotLib.audio();
            }
        });
        this.mAudioThread = thread;
        thread.setPriority(10);
        this.mAudioThread.start();
    }

    public void audioWriteShortBuffer(short[] sArr) {
        int i11 = 0;
        while (i11 < sArr.length) {
            int iWrite = this.mAudioTrack.write(sArr, i11, sArr.length - i11);
            if (iWrite > 0) {
                i11 += iWrite;
            } else {
                if (iWrite != 0) {
                    Log.w("Godot", "Godot audio: error return from write(short)");
                    return;
                }
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void dir_close(int i11) {
        if (this.dirs.get(i11) == null) {
            System.out.printf("dir_close: invalid dir id: %d\n", Integer.valueOf(i11));
        } else {
            this.dirs.remove(i11);
        }
    }

    public boolean dir_is_dir(int i11) {
        if (this.dirs.get(i11) == null) {
            System.out.printf("dir_next: invalid dir id: %d\n", Integer.valueOf(i11));
            return false;
        }
        AssetDir assetDir = this.dirs.get(i11);
        int i12 = assetDir.current;
        if (i12 > 0) {
            i12--;
        }
        String[] strArr = assetDir.files;
        if (i12 >= strArr.length) {
            return false;
        }
        String str = strArr[i12];
        try {
            if (assetDir.path.equals("")) {
                this.f99302am.open(str);
            } else {
                this.f99302am.open(assetDir.path + "/" + str);
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public String dir_next(int i11) {
        if (this.dirs.get(i11) == null) {
            System.out.printf("dir_next: invalid dir id: %d\n", Integer.valueOf(i11));
            return "";
        }
        AssetDir assetDir = this.dirs.get(i11);
        int i12 = assetDir.current;
        String[] strArr = assetDir.files;
        if (i12 >= strArr.length) {
            assetDir.current = i12 + 1;
            return "";
        }
        String str = strArr[i12];
        assetDir.current = i12 + 1;
        return str;
    }

    public int dir_open(String str) {
        AssetDir assetDir = new AssetDir();
        assetDir.current = 0;
        assetDir.path = str;
        try {
            String[] list = this.f99302am.list(str);
            assetDir.files = list;
            if (list.length == 0) {
                return -1;
            }
            int i11 = this.last_dir_id + 1;
            this.last_dir_id = i11;
            this.dirs.put(i11, assetDir);
            return this.last_dir_id;
        } catch (IOException e11) {
            System.out.printf("Exception on dir_open: %s\n", e11);
            return -1;
        }
    }

    public void file_close(int i11) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_close: Can't close invalid file id: %d\n", Integer.valueOf(i11));
        } else {
            this.streams.remove(i11);
        }
    }

    public boolean file_eof(int i11) {
        if (this.streams.get(i11) != null) {
            return this.streams.get(i11).eof;
        }
        System.out.printf("file_read: Can't check eof for invalid file id: %d\n", Integer.valueOf(i11));
        return false;
    }

    public int file_get_size(int i11) {
        if (this.streams.get(i11) != null) {
            return this.streams.get(i11).len;
        }
        System.out.printf("file_get_size: Invalid file id: %d\n", Integer.valueOf(i11));
        return -1;
    }

    public int file_open(String str, boolean z11) {
        if (z11) {
            return -1;
        }
        AssetData assetData = new AssetData();
        try {
            InputStream inputStreamOpen = this.f99302am.open(str);
            assetData.f99303is = inputStreamOpen;
            try {
                assetData.len = inputStreamOpen.available();
                assetData.path = str;
                assetData.pos = 0;
                int i11 = this.last_file_id + 1;
                this.last_file_id = i11;
                this.streams.put(i11, assetData);
                return this.last_file_id;
            } catch (Exception unused) {
                System.out.printf("Exception availabling on file_open: %s\n", str);
                return -1;
            }
        } catch (Exception unused2) {
        }
    }

    public byte[] file_read(int i11, int i12) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_read: Can't read invalid file id: %d\n", Integer.valueOf(i11));
            return new byte[0];
        }
        AssetData assetData = this.streams.get(i11);
        int i13 = assetData.pos;
        int i14 = i13 + i12;
        int i15 = assetData.len;
        if (i14 > i15) {
            i12 = i15 - i13;
            assetData.eof = true;
        }
        if (i12 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i12];
        try {
            int i16 = assetData.f99303is.read(bArr);
            if (i16 == 0) {
                return new byte[0];
            }
            assetData.pos += i16;
            if (i16 >= i12) {
                return bArr;
            }
            byte[] bArr2 = new byte[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                bArr2[i17] = bArr[i17];
            }
            return bArr2;
        } catch (IOException e11) {
            System.out.printf("Exception on file_read: %s\n", e11);
            return new byte[i12];
        }
    }

    public void file_seek(int i11, int i12) {
        if (this.streams.get(i11) == null) {
            System.out.printf("file_get_size: Invalid file id: %d\n", Integer.valueOf(i11));
            return;
        }
        AssetData assetData = this.streams.get(i11);
        int i13 = assetData.len;
        if (i12 > i13) {
            i12 = i13;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        try {
            int i14 = assetData.pos;
            if (i12 > i14) {
                int iSkip = i12 - i14;
                while (iSkip > 0) {
                    long j11 = iSkip;
                    iSkip = (int) (j11 - assetData.f99303is.skip(j11));
                }
                assetData.pos = i12;
            } else if (i12 < i14) {
                assetData.f99303is = this.f99302am.open(assetData.path);
                assetData.pos = i12;
                while (i12 > 0) {
                    long j12 = i12;
                    i12 = (int) (j12 - assetData.f99303is.skip(j12));
                }
            }
            assetData.eof = false;
        } catch (IOException e11) {
            System.out.printf("Exception on file_seek: %s\n", e11);
        }
    }

    public int file_tell(int i11) {
        if (this.streams.get(i11) != null) {
            return this.streams.get(i11).pos;
        }
        System.out.printf("file_read: Can't tell eof for invalid file id: %d\n", Integer.valueOf(i11));
        return 0;
    }

    public String getDataDir() {
        return this.activity.getFilesDir().getAbsolutePath();
    }

    public String getLocale() {
        return Locale.getDefault().toString();
    }

    public String getModel() {
        return Build.MODEL;
    }

    public int getScreenDPI() {
        return (int) (this.activity.getApplicationContext().getResources().getDisplayMetrics().density * 160.0f);
    }

    public String getSystemDir(int i11) {
        String str;
        switch (i11) {
            case 0:
                str = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 1:
                str = Environment.DIRECTORY_DCIM;
                break;
            case 2:
                str = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 3:
                str = Environment.DIRECTORY_DOWNLOADS;
                break;
            case 4:
                str = Environment.DIRECTORY_MOVIES;
                break;
            case 5:
                str = Environment.DIRECTORY_MUSIC;
                break;
            case 6:
                str = Environment.DIRECTORY_PICTURES;
                break;
            case 7:
                str = Environment.DIRECTORY_RINGTONES;
                break;
            default:
                str = "";
                break;
        }
        return str.equals("") ? "" : Environment.getExternalStoragePublicDirectory(str).getAbsolutePath();
    }

    public String getUniqueID() {
        return unique_id;
    }

    public void hideKeyboard() {
        GodotEditText godotEditText = this.edit;
        if (godotEditText != null) {
            godotEditText.hideKeyboard();
        }
    }

    public boolean isVideoPlaying() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069 A[Catch: ActivityNotFoundException -> 0x007f, TryCatch #0 {ActivityNotFoundException -> 0x007f, blocks: (B:2:0x0000, B:5:0x0020, B:7:0x0039, B:9:0x0041, B:11:0x0049, B:17:0x0059, B:19:0x0069, B:21:0x0078, B:20:0x0071), top: B:26:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[Catch: ActivityNotFoundException -> 0x007f, TryCatch #0 {ActivityNotFoundException -> 0x007f, blocks: (B:2:0x0000, B:5:0x0020, B:7:0x0039, B:9:0x0041, B:11:0x0049, B:17:0x0059, B:19:0x0069, B:21:0x0078, B:20:0x0071), top: B:26:0x0000 }] */
    public int openURI(String str) {
        String str2;
        String str3;
        Intent intent;
        try {
            Log.v("MyApp", "TRYING TO OPEN URI: " + str);
            if (str.startsWith("/")) {
                str2 = "file://" + str;
                str3 = (str.endsWith(".png") || str.endsWith(".jpg") || str.endsWith(".gif") || str.endsWith(".webp")) ? "image/*" : "";
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (str3.equals("")) {
                    intent.setData(Uri.parse(str2));
                } else {
                    intent.setDataAndType(Uri.parse(str2), str3);
                }
                this.activity.startActivity(intent);
                return 0;
            }
            str2 = str;
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            if (str3.equals("")) {
                intent.setDataAndType(Uri.parse(str2), str3);
            } else {
                intent.setData(Uri.parse(str2));
            }
            this.activity.startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException unused) {
            return 1;
        }
    }

    public void pauseVideo() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void playVideo(String str) {
        Uri uri = Uri.parse(str);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        try {
            mediaPlayer.setAudioStreamType(3);
            this.mediaPlayer.setDataSource(this.activity.getApplicationContext(), uri);
            this.mediaPlayer.prepare();
            this.mediaPlayer.start();
        } catch (IOException unused) {
            System.out.println("IOError while playing video");
        }
    }

    public void setEdit(GodotEditText godotEditText) {
        this.edit = godotEditText;
    }

    public void setScreenOrientation(int i11) {
        switch (i11) {
            case 0:
                this.activity.setRequestedOrientation(0);
                break;
            case 1:
                this.activity.setRequestedOrientation(1);
                break;
            case 2:
                this.activity.setRequestedOrientation(8);
                break;
            case 3:
                this.activity.setRequestedOrientation(9);
                break;
            case 4:
                this.activity.setRequestedOrientation(6);
                break;
            case 5:
                this.activity.setRequestedOrientation(7);
                break;
            case 6:
                this.activity.setRequestedOrientation(10);
                break;
        }
    }

    public void showKeyboard(String str, int i11, int i12, int i13) {
        GodotEditText godotEditText = this.edit;
        if (godotEditText != null) {
            godotEditText.showKeyboard(str, i11, i12, i13);
        }
    }

    public void stopVideo() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }
}
