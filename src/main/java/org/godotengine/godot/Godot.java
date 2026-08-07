package org.godotengine.godot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import javax.microedition.khronos.opengles.GL10;
import ku.a;
import ku.b;
import ku.c;
import ku.d;
import ku.e;
import ku.g;
import org.godotengine.godot.input.GodotEditText;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.GodotPluginRegistry;
import org.godotengine.godot.utils.GodotNetUtils;
import org.godotengine.godot.utils.PermissionsUtil;
import org.godotengine.godot.xr.XRMode;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes10.dex */
public class Godot extends Fragment implements e {
    static final int MAX_SINGLETONS = 64;

    /* JADX INFO: renamed from: io, reason: collision with root package name */
    public static GodotIO f99301io;
    private static Intent mCurrentIntent;
    public static GodotNetUtils netUtils;
    static int singleton_count;
    static SingletonBase[] singletons = new SingletonBase[64];
    private boolean activityResumed;
    private String[] command_line;
    private ViewGroup containerLayout;
    String expansion_pack_path;
    private TextView mAverageSpeed;
    private View mCellMessage;
    private ClipboardManager mClipboard;
    private View mDashboard;
    private g mDownloaderClientStub;
    private ProgressBar mPB;
    private Button mPauseButton;
    private TextView mProgressFraction;
    private TextView mProgressPercent;
    private int mState;
    private boolean mStatePaused;
    private TextView mStatusText;
    private TextView mTimeRemaining;
    public GodotView mView;
    private Button mWiFiSettingsButton;
    private GodotPluginRegistry pluginRegistry;
    public ResultCallback result_callback;
    private boolean use_apk_expansion;
    private XRMode xrMode = XRMode.REGULAR;
    private boolean use_32_bits = false;
    private boolean use_immersive = false;
    private boolean use_debug_opengl = false;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private boolean godot_initialized = false;

    public interface ResultCallback {
        void callback(int i11, int i12, Intent intent);
    }

    public static class SingletonBase {
        protected void onGLDrawFrame(GL10 gl10) {
        }

        protected void onGLSurfaceChanged(GL10 gl10, int i11, int i12) {
        }

        protected void onMainActivityResult(int i11, int i12, Intent intent) {
        }

        protected boolean onMainBackPressed() {
            return false;
        }

        protected View onMainCreateView(Activity activity) {
            return null;
        }

        protected void onMainDestroy() {
        }

        protected void onMainPause() {
        }

        protected void onMainRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        }

        protected void onMainResume() {
        }

        protected void registerClass(String str, String[] strArr) {
            GodotPlugin.nativeRegisterSingleton(str, this);
            for (Method method : getClass().getDeclaredMethods()) {
                for (String str2 : strArr) {
                    if (str2.equals(method.getName())) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> cls : method.getParameterTypes()) {
                            arrayList.add(cls.getName());
                        }
                        String[] strArr2 = new String[arrayList.size()];
                        arrayList.toArray(strArr2);
                        GodotPlugin.nativeRegisterMethod(str, method.getName(), method.getReturnType().getName(), strArr2);
                        break;
                    }
                }
            }
            SingletonBase[] singletonBaseArr = Godot.singletons;
            int i11 = Godot.singleton_count;
            Godot.singleton_count = i11 + 1;
            singletonBaseArr[i11] = this;
        }

        public void registerMethods() {
        }
    }

    private void forceQuit() {
        System.exit(0);
    }

    public static Intent getCurrentIntent() {
        return mCurrentIntent;
    }

    @Keep
    private String getInputFallbackMapping() {
        return this.xrMode.inputFallbackMapping;
    }

    @Keep
    private Surface getSurface() {
        return this.mView.getHolder().getSurface();
    }

    private void initializeGodot() {
        String[] strArr;
        if (this.expansion_pack_path != null) {
            String[] strArr2 = this.command_line;
            int i11 = 0;
            if (strArr2 != null) {
                strArr = new String[strArr2.length + 2];
                int length = strArr2.length;
                while (true) {
                    String[] strArr3 = this.command_line;
                    if (i11 >= strArr3.length) {
                        break;
                    }
                    strArr[i11] = strArr3[i11];
                    i11++;
                }
                i11 = length;
            } else {
                strArr = new String[2];
            }
            strArr[i11] = "--main-pack";
            strArr[i11 + 1] = this.expansion_pack_path;
            this.command_line = strArr;
        }
        u activity = getActivity();
        f99301io = new GodotIO(activity);
        GodotIO.unique_id = Settings.Secure.getString(activity.getContentResolver(), "android_id");
        GodotLib.f99304io = f99301io;
        netUtils = new GodotNetUtils(activity);
        GodotLib.initialize(activity, this, activity.getAssets(), this.use_apk_expansion);
        this.result_callback = null;
        this.godot_initialized = true;
    }

    @Keep
    private boolean isActivityResumed() {
        return this.activityResumed;
    }

    private boolean obbIsCorrupted(String str, String str2) {
        int i11;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[16384];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            do {
                i11 = fileInputStream.read(bArr);
                if (i11 > 0) {
                    messageDigest.update(bArr, 0, i11);
                }
            } while (i11 != -1);
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b11 : bArrDigest) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    hexString = WebrtcBuildVersion.maint_version + hexString;
                }
                stringBuffer.append(hexString);
            }
            return !stringBuffer.toString().equals(str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    @Keep
    private void onVideoInit() {
        boolean z11 = getGLESVersionCode() >= 196608;
        final u activity = getActivity();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.containerLayout = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        GodotEditText godotEditText = new GodotEditText(activity);
        godotEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) getResources().getDimension(R.dimen.text_edit_height)));
        godotEditText.setBackgroundColor(0);
        this.containerLayout.addView(godotEditText);
        GodotView godotView = new GodotView(activity, this, this.xrMode, z11, this.use_32_bits, this.use_debug_opengl);
        this.mView = godotView;
        this.containerLayout.addView(godotView, new ViewGroup.LayoutParams(-1, -1));
        godotEditText.setView(this.mView);
        f99301io.setEdit(godotEditText);
        this.mView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.godotengine.godot.Godot.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Point point = new Point();
                activity.getWindowManager().getDefaultDisplay().getSize(point);
                Rect rect = new Rect();
                Godot.this.mView.getWindowVisibleDisplayFrame(rect);
                GodotLib.setVirtualKeyboardHeight(point.y - rect.bottom);
            }
        });
        final String[] strArr = this.command_line;
        this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.2
            @Override // java.lang.Runnable
            public void run() {
                GodotLib.setup(strArr);
                Iterator<GodotPlugin> it = Godot.this.pluginRegistry.getAllPlugins().iterator();
                while (it.hasNext()) {
                    it.next().onRegisterPluginWithGodotNative();
                }
                Godot.this.setKeepScreenOn("True".equals(GodotLib.getGlobal("display/window/energy_saving/keep_screen_on")));
                Godot.this.mainThreadHandler.post(new Runnable() { // from class: org.godotengine.godot.Godot.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        for (int i11 = 0; i11 < Godot.singleton_count; i11++) {
                            View viewOnMainCreateView = Godot.singletons[i11].onMainCreateView(activity);
                            if (viewOnMainCreateView != null) {
                                Godot.this.containerLayout.addView(viewOnMainCreateView);
                            }
                        }
                    }
                });
            }
        });
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            View viewOnMainCreate = it.next().onMainCreate(activity);
            if (viewOnMainCreate != null) {
                this.containerLayout.addView(viewOnMainCreate);
            }
        }
    }

    private void setButtonPausedState(boolean z11) {
        this.mStatePaused = z11;
        this.mPauseButton.setText(z11 ? R.string.text_button_resume : R.string.text_button_pause);
    }

    private void setState(int i11) {
        if (this.mState != i11) {
            this.mState = i11;
            this.mStatusText.setText(d.e(i11));
        }
    }

    @Keep
    @SuppressLint({"MissingPermission"})
    private void vibrate(int i11) {
        Vibrator vibrator;
        if (!requestPermission("VIBRATE") || (vibrator = (Vibrator) getContext().getSystemService("vibrator")) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(i11, -1));
        } else {
            vibrator.vibrate(i11);
        }
    }

    public void UiChangeListener() {
        final View decorView = getActivity().getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: org.godotengine.godot.Godot.5
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i11) {
                if ((i11 & 4) == 0) {
                    decorView.setSystemUiVisibility(5894);
                }
            }
        });
    }

    public void alert(final String str, final String str2) {
        final u activity = getActivity();
        runOnUiThread(new Runnable() { // from class: org.godotengine.godot.Godot.4
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(str).setTitle(str2);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: org.godotengine.godot.Godot.4.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i11) {
                        dialogInterface.cancel();
                    }
                });
                builder.create().show();
            }
        });
    }

    public String getClipboard() {
        return this.mClipboard.getPrimaryClip() != null ? this.mClipboard.getPrimaryClip().getItemAt(0).getText().toString() : "";
    }

    protected String[] getCommandLine() {
        try {
            InputStream inputStreamOpen = getActivity().getAssets().open("_cl_");
            byte[] bArr = new byte[4];
            if (inputStreamOpen.read(bArr) < 4) {
                return new String[0];
            }
            int i11 = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
            String[] strArr = new String[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                if (inputStreamOpen.read(bArr) < 4) {
                    return new String[0];
                }
                int i13 = ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[0] & 255);
                if (i13 > 65535) {
                    return new String[0];
                }
                byte[] bArr2 = new byte[i13];
                if (inputStreamOpen.read(bArr2) == i13) {
                    strArr[i12] = new String(bArr2, "UTF-8");
                }
            }
            return strArr;
        } catch (Exception e11) {
            e11.printStackTrace();
            return new String[0];
        }
    }

    public int getGLESVersionCode() {
        return ((ActivityManager) getContext().getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
    }

    public String[] getGrantedPermissions() {
        return PermissionsUtil.getGrantedPermissions(getActivity());
    }

    public boolean gotTouchEvent(MotionEvent motionEvent) {
        final int pointerCount = motionEvent.getPointerCount();
        if (pointerCount != 0 && this.mView != null) {
            final int[] iArr = new int[motionEvent.getPointerCount() * 3];
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                int i12 = i11 * 3;
                iArr[i12] = motionEvent.getPointerId(i11);
                iArr[i12 + 1] = (int) motionEvent.getX(i11);
                iArr[i12 + 2] = (int) motionEvent.getY(i11);
            }
            final int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            final int action = motionEvent.getAction() & 255;
            this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.7
                @Override // java.lang.Runnable
                public void run() {
                    int i13 = action;
                    if (i13 == 0) {
                        GodotLib.touch(0, 0, pointerCount, iArr);
                        return;
                    }
                    if (i13 != 1) {
                        if (i13 == 2) {
                            GodotLib.touch(1, 0, pointerCount, iArr);
                            return;
                        }
                        if (i13 != 3) {
                            if (i13 == 5) {
                                GodotLib.touch(3, pointerId, pointerCount, iArr);
                                return;
                            } else {
                                if (i13 != 6) {
                                    return;
                                }
                                GodotLib.touch(4, pointerId, pointerCount, iArr);
                                return;
                            }
                        }
                    }
                    GodotLib.touch(2, 0, pointerCount, iArr);
                }
            });
        }
        return true;
    }

    public void initInputDevices() {
        this.mView.initInputDevices();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        ResultCallback resultCallback = this.result_callback;
        if (resultCallback != null) {
            resultCallback.callback(i11, i12, intent);
            this.result_callback = null;
        }
        for (int i13 = 0; i13 < singleton_count; i13++) {
            singletons[i13].onMainActivityResult(i11, i12, intent);
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onMainActivityResult(i11, i12, intent);
        }
    }

    public void onBackPressed() {
        GodotView godotView;
        boolean z11 = true;
        for (int i11 = 0; i11 < singleton_count; i11++) {
            if (singletons[i11].onMainBackPressed()) {
                z11 = false;
            }
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            if (it.next().onMainBackPressed()) {
                z11 = false;
            }
        }
        if (!z11 || (godotView = this.mView) == null) {
            return;
        }
        godotView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.6
            @Override // java.lang.Runnable
            public void run() {
                GodotLib.back();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01a1 A[Catch: NameNotFoundException -> 0x0210, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0210, blocks: (B:59:0x0197, B:61:0x01a1), top: B:67:0x0197 }] */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intent intent;
        u activity = getActivity();
        Window window = activity.getWindow();
        window.addFlags(PKIFailureInfo.badSenderNonce);
        this.mClipboard = (ClipboardManager) activity.getSystemService("clipboard");
        this.pluginRegistry = GodotPluginRegistry.initializePluginRegistry(this);
        this.command_line = getCommandLine();
        LinkedList linkedList = new LinkedList();
        String str = null;
        String str2 = null;
        int i11 = 0;
        while (true) {
            String[] strArr = this.command_line;
            if (i11 >= strArr.length) {
                break;
            }
            boolean z11 = i11 < strArr.length - 1;
            String str3 = strArr[i11];
            XRMode xRMode = XRMode.REGULAR;
            if (str3.equals(xRMode.cmdLineArg)) {
                this.xrMode = xRMode;
            } else {
                String str4 = this.command_line[i11];
                XRMode xRMode2 = XRMode.OVR;
                if (str4.equals(xRMode2.cmdLineArg)) {
                    this.xrMode = xRMode2;
                } else if (this.command_line[i11].equals("--use_depth_32")) {
                    this.use_32_bits = true;
                } else if (this.command_line[i11].equals("--debug_opengl")) {
                    this.use_debug_opengl = true;
                } else if (this.command_line[i11].equals("--use_immersive")) {
                    this.use_immersive = true;
                    window.getDecorView().setSystemUiVisibility(5894);
                    UiChangeListener();
                } else if (this.command_line[i11].equals("--use_apk_expansion")) {
                    this.use_apk_expansion = true;
                } else if (z11 && this.command_line[i11].equals("--apk_expansion_md5")) {
                    i11++;
                    str = this.command_line[i11];
                } else if (z11 && this.command_line[i11].equals("--apk_expansion_key")) {
                    i11++;
                    str2 = this.command_line[i11];
                    SharedPreferences.Editor editorEdit = activity.getSharedPreferences("app_data_keys", 0).edit();
                    editorEdit.putString("store_public_key", str2);
                    editorEdit.apply();
                } else if (this.command_line[i11].trim().length() != 0) {
                    linkedList.add(this.command_line[i11]);
                }
            }
            i11++;
        }
        if (linkedList.isEmpty()) {
            this.command_line = null;
        } else {
            this.command_line = (String[]) linkedList.toArray(new String[linkedList.size()]);
        }
        if (this.use_apk_expansion && str != null && str2 != null) {
            Environment.getExternalStorageState().equals("mounted");
            try {
                this.expansion_pack_path = d.g(getContext());
                this.expansion_pack_path += "/main." + activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionCode + "." + activity.getPackageName() + ".obb";
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            File file = new File(this.expansion_pack_path);
            if (!file.exists()) {
                intent = new Intent(activity, activity.getClass());
                intent.setFlags(335544320);
                if (b.c(getContext(), PendingIntent.getActivity(activity, 0, intent, 134217728), GodotDownloaderService.class) != 0) {
                    this.mDownloaderClientStub = b.b(this, GodotDownloaderService.class);
                    View viewInflate = layoutInflater.inflate(R.layout.downloading_expansion, viewGroup, false);
                    this.mPB = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
                    this.mStatusText = (TextView) viewInflate.findViewById(R.id.statusText);
                    this.mProgressFraction = (TextView) viewInflate.findViewById(R.id.progressAsFraction);
                    this.mProgressPercent = (TextView) viewInflate.findViewById(R.id.progressAsPercentage);
                    this.mAverageSpeed = (TextView) viewInflate.findViewById(R.id.progressAverageSpeed);
                    this.mTimeRemaining = (TextView) viewInflate.findViewById(R.id.progressTimeRemaining);
                    this.mDashboard = viewInflate.findViewById(R.id.downloaderDashboard);
                    this.mCellMessage = viewInflate.findViewById(R.id.approveCellular);
                    this.mPauseButton = (Button) viewInflate.findViewById(R.id.pauseButton);
                    this.mWiFiSettingsButton = (Button) viewInflate.findViewById(R.id.wifiSettingsButton);
                    return viewInflate;
                }
            } else if (obbIsCorrupted(this.expansion_pack_path, str)) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                intent = new Intent(activity, activity.getClass());
                intent.setFlags(335544320);
                try {
                    if (b.c(getContext(), PendingIntent.getActivity(activity, 0, intent, 134217728), GodotDownloaderService.class) != 0) {
                        this.mDownloaderClientStub = b.b(this, GodotDownloaderService.class);
                        View viewInflate2 = layoutInflater.inflate(R.layout.downloading_expansion, viewGroup, false);
                        this.mPB = (ProgressBar) viewInflate2.findViewById(R.id.progressBar);
                        this.mStatusText = (TextView) viewInflate2.findViewById(R.id.statusText);
                        this.mProgressFraction = (TextView) viewInflate2.findViewById(R.id.progressAsFraction);
                        this.mProgressPercent = (TextView) viewInflate2.findViewById(R.id.progressAsPercentage);
                        this.mAverageSpeed = (TextView) viewInflate2.findViewById(R.id.progressAverageSpeed);
                        this.mTimeRemaining = (TextView) viewInflate2.findViewById(R.id.progressTimeRemaining);
                        this.mDashboard = viewInflate2.findViewById(R.id.downloaderDashboard);
                        this.mCellMessage = viewInflate2.findViewById(R.id.approveCellular);
                        this.mPauseButton = (Button) viewInflate2.findViewById(R.id.pauseButton);
                        this.mWiFiSettingsButton = (Button) viewInflate2.findViewById(R.id.wifiSettingsButton);
                        return viewInflate2;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        }
        mCurrentIntent = activity.getIntent();
        initializeGodot();
        return this.containerLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        for (int i11 = 0; i11 < singleton_count; i11++) {
            singletons[i11].onMainDestroy();
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onMainDestroy();
        }
        GodotLib.ondestroy();
        super.onDestroy();
        forceQuit();
    }

    @Override // ku.e
    public void onDownloadProgress(a aVar) {
        this.mAverageSpeed.setText(getString(R.string.kilobytes_per_second, d.h(aVar.f89388d)));
        this.mTimeRemaining.setText(getString(R.string.time_remaining, d.i(aVar.f89387c)));
        this.mPB.setMax((int) (aVar.f89385a >> 8));
        this.mPB.setProgress((int) (aVar.f89386b >> 8));
        this.mProgressPercent.setText(String.format(Locale.ENGLISH, "%d %%", Long.valueOf((aVar.f89386b * 100) / aVar.f89385a)));
        this.mProgressFraction.setText(d.d(aVar.f89386b, aVar.f89385a));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    @Override // ku.e
    public void onDownloadStateChanged(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        setState(i11);
        boolean z14 = true;
        switch (i11) {
            case 1:
            case 2:
            case 3:
                z11 = true;
                z12 = false;
                z13 = false;
                if (z14) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.mDashboard.getVisibility() != i12) {
                    this.mDashboard.setVisibility(i12);
                }
                i13 = z12 ? 0 : 8;
                if (this.mCellMessage.getVisibility() != i13) {
                    this.mCellMessage.setVisibility(i13);
                }
                this.mPB.setIndeterminate(z11);
                setButtonPausedState(z13);
                break;
            case 4:
                z12 = false;
                z13 = false;
                z11 = false;
                if (z14) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.mDashboard.getVisibility() != i12) {
                    this.mDashboard.setVisibility(i12);
                }
                if (z12) {
                }
                if (this.mCellMessage.getVisibility() != i13) {
                    this.mCellMessage.setVisibility(i13);
                }
                this.mPB.setIndeterminate(z11);
                setButtonPausedState(z13);
                break;
            case 5:
                initializeGodot();
                break;
            case 6:
            case 10:
            case 11:
            case 13:
            case 17:
            default:
                z13 = true;
                z11 = true;
                z12 = false;
                if (z14) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.mDashboard.getVisibility() != i12) {
                    this.mDashboard.setVisibility(i12);
                }
                if (z12) {
                }
                if (this.mCellMessage.getVisibility() != i13) {
                    this.mCellMessage.setVisibility(i13);
                }
                this.mPB.setIndeterminate(z11);
                setButtonPausedState(z13);
                break;
            case 7:
            case 12:
            case 14:
                z13 = true;
                z12 = false;
                z11 = false;
                if (z14) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.mDashboard.getVisibility() != i12) {
                    this.mDashboard.setVisibility(i12);
                }
                if (z12) {
                }
                if (this.mCellMessage.getVisibility() != i13) {
                    this.mCellMessage.setVisibility(i13);
                }
                this.mPB.setIndeterminate(z11);
                setButtonPausedState(z13);
                break;
            case 8:
            case 9:
                z12 = true;
                z13 = true;
                z14 = false;
                z11 = z14;
                if (z14) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.mDashboard.getVisibility() != i12) {
                    this.mDashboard.setVisibility(i12);
                }
                if (z12) {
                }
                if (this.mCellMessage.getVisibility() != i13) {
                    this.mCellMessage.setVisibility(i13);
                }
                this.mPB.setIndeterminate(z11);
                setButtonPausedState(z13);
                break;
            case 15:
            case 16:
            case 18:
            case 19:
                z13 = true;
                z12 = false;
                z14 = false;
                z11 = z14;
                if (z14) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                if (this.mDashboard.getVisibility() != i12) {
                    this.mDashboard.setVisibility(i12);
                }
                if (z12) {
                }
                if (this.mCellMessage.getVisibility() != i13) {
                    this.mCellMessage.setVisibility(i13);
                }
                this.mPB.setIndeterminate(z11);
                setButtonPausedState(z13);
                break;
        }
    }

    protected void onGodotMainLoopStarted() {
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onGodotMainLoopStarted();
        }
    }

    public boolean onKeyMultiple(int i11, int i12, KeyEvent keyEvent) {
        String characters = keyEvent.getCharacters();
        if (characters == null || characters.length() == 0) {
            return false;
        }
        final char[] charArray = characters.toCharArray();
        int length = charArray.length;
        int i13 = 0;
        while (true) {
            length--;
            int i14 = 1;
            if (length < 0) {
                break;
            }
            if (charArray[length] == 0) {
                i14 = 0;
            }
            i13 += i14;
        }
        if (i13 == 0) {
            return false;
        }
        this.mView.queueEvent(new Runnable() { // from class: org.godotengine.godot.Godot.8
            @Override // java.lang.Runnable
            public void run() {
                int length2 = charArray.length;
                for (int i15 = 0; i15 < length2; i15++) {
                    char c11 = charArray[i15];
                    if (c11 != 0) {
                        GodotLib.key(0, c11, true);
                        GodotLib.key(0, c11, false);
                    }
                }
            }
        });
        return true;
    }

    public void onNewIntent(Intent intent) {
        mCurrentIntent = intent;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.activityResumed = false;
        if (!this.godot_initialized) {
            g gVar = this.mDownloaderClientStub;
            if (gVar != null) {
                gVar.c(getActivity());
                return;
            }
            return;
        }
        this.mView.onPause();
        for (int i11 = 0; i11 < singleton_count; i11++) {
            singletons[i11].onMainPause();
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onMainPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        for (int i12 = 0; i12 < singleton_count; i12++) {
            singletons[i12].onMainRequestPermissionsResult(i11, strArr, iArr);
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onMainRequestPermissionsResult(i11, strArr, iArr);
        }
        for (int i13 = 0; i13 < strArr.length; i13++) {
            GodotLib.requestPermissionResult(strArr[i13], iArr[i13] == 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.activityResumed = true;
        if (!this.godot_initialized) {
            g gVar = this.mDownloaderClientStub;
            if (gVar != null) {
                gVar.a(getActivity());
                return;
            }
            return;
        }
        this.mView.onResume();
        if (this.use_immersive) {
            getActivity().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        for (int i11 = 0; i11 < singleton_count; i11++) {
            singletons[i11].onMainResume();
        }
        Iterator<GodotPlugin> it = this.pluginRegistry.getAllPlugins().iterator();
        while (it.hasNext()) {
            it.next().onMainResume();
        }
    }

    @Override // ku.e
    public void onServiceConnected(Messenger messenger) {
        c.a(messenger).onClientUpdated(this.mDownloaderClientStub.b());
    }

    public boolean requestPermission(String str) {
        return PermissionsUtil.requestPermission(str, getActivity());
    }

    public boolean requestPermissions() {
        return PermissionsUtil.requestManifestPermissions(getActivity());
    }

    public void restart() {
        u activity = getActivity();
        if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(AnalyticsAttribute.Intent, mCurrentIntent);
            activity.startInstrumentation(new ComponentName(activity, (Class<?>) GodotInstrumentation.class), null, bundle);
        }
    }

    public final void runOnRenderThread(@NonNull Runnable runnable) {
        GodotView godotView = this.mView;
        if (godotView != null) {
            godotView.queueEvent(runnable);
        }
    }

    public final void runOnUiThread(@NonNull Runnable runnable) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(runnable);
        }
    }

    public void setClipboard(String str) {
        this.mClipboard.setPrimaryClip(ClipData.newPlainText("myLabel", str));
    }

    public void setKeepScreenOn(final boolean z11) {
        runOnUiThread(new Runnable() { // from class: org.godotengine.godot.Godot.3
            @Override // java.lang.Runnable
            public void run() {
                if (z11) {
                    Godot.this.getActivity().getWindow().addFlags(128);
                } else {
                    Godot.this.getActivity().getWindow().clearFlags(128);
                }
            }
        });
    }
}
