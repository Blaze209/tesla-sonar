package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes6.dex */
public class l implements ActivityEventListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final d f48633g = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f48634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DownloadManager.Request f48635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ValueCallback<Uri> f48636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueCallback<Uri[]> f48637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f48638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f48639f;

    class a implements co.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48641b;

        a(String str, String str2) {
            this.f48640a = str;
            this.f48641b = str2;
        }

        @Override // co.g
        public boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
            if (i11 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(l.this.f48634a, this.f48641b, 1).show();
            } else if (l.this.f48635b != null) {
                l.this.h(this.f48640a);
            }
            return true;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48643a;

        static {
            int[] iArr = new int[c.values().length];
            f48643a = iArr;
            try {
                iArr[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48643a[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);

        private final String value;

        c(String str) {
            this.value = str;
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f48644a = 1.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap<Double, AtomicReference<a>> f48645b = new HashMap<>();

        protected enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected d() {
        }

        public synchronized AtomicReference<a> a(Double d11) {
            return this.f48645b.get(d11);
        }

        public synchronized u5.d<Double, AtomicReference<a>> b() {
            double d11;
            AtomicReference<a> atomicReference;
            d11 = this.f48644a;
            this.f48644a = 1.0d + d11;
            atomicReference = new AtomicReference<>(a.UNDECIDED);
            this.f48645b.put(Double.valueOf(d11), atomicReference);
            return new u5.d<>(Double.valueOf(d11), atomicReference);
        }

        public synchronized void c(Double d11) {
            this.f48645b.remove(d11);
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f48634a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean c(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.value));
    }

    private Boolean d(String[] strArr) {
        String[] strArrI = i(strArr);
        return Boolean.valueOf(g(strArrI, c.DEFAULT.value).booleanValue() || g(strArrI, c.IMAGE.value).booleanValue());
    }

    private Boolean e(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.VIDEO.value));
    }

    private Boolean f(String[] strArr) {
        String[] strArrI = i(strArr);
        return Boolean.valueOf(g(strArrI, c.DEFAULT.value).booleanValue() || g(strArrI, c.VIDEO.value).booleanValue());
    }

    private Boolean g(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] i(String[] strArr) {
        if (w(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.value};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            if (str.matches("\\.\\w+")) {
                String strM = m(str.replace(".", ""));
                if (strM != null) {
                    strArr2[i11] = strM;
                } else {
                    strArr2[i11] = str;
                }
            } else {
                strArr2[i11] = str;
            }
        }
        return strArr2;
    }

    private Intent k(String str) {
        String strM = str.isEmpty() ? c.DEFAULT.value : str;
        if (str.matches("\\.\\w+")) {
            strM = m(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(strM);
        return intent;
    }

    private Intent l(String[] strArr, boolean z11) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.value);
        intent.putExtra("android.intent.extra.MIME_TYPES", i(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z11);
        return intent;
    }

    private String m(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private co.f o() {
        ComponentCallbacks2 currentActivity = this.f48634a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof co.f) {
            return (co.f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private co.g s(String str, String str2) {
        return new a(str, str2);
    }

    private Boolean w(String[] strArr) {
        String str;
        boolean z11 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public boolean A(String[] strArr, boolean z11, ValueCallback<Uri[]> valueCallback, boolean z12) {
        Intent intentR;
        this.f48637d = valueCallback;
        Activity currentActivity = this.f48634a.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent intentP = null;
        if (!v()) {
            if (d(strArr).booleanValue() && (intentP = p()) != null) {
                arrayList.add(intentP);
            }
            if (f(strArr).booleanValue() && (intentR = r()) != null) {
                arrayList.add(intentR);
            }
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        if (!z12) {
            intent.putExtra("android.intent.extra.INTENT", l(strArr, z11));
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intentP = intent;
        }
        if (intentP == null) {
            Log.w("RNCWebViewModule", "there is no Camera permission");
        } else if (intentP.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentP, 1);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
        return true;
    }

    public void h(String str) {
        try {
            ((DownloadManager) this.f48634a.getSystemService("download")).enqueue(this.f48635b);
            Toast.makeText(this.f48634a, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e11) {
            Log.w("RNCWebViewModule", "Unsupported URI, aborting download", e11);
        }
    }

    public File j(c cVar) {
        String str;
        String str2;
        int i11 = b.f48643a[cVar.ordinal()];
        if (i11 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i11 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(str2);
        return File.createTempFile(str, str2, this.f48634a.getExternalFilesDir(null));
    }

    public Uri n(File file) {
        String packageName = this.f48634a.getPackageName();
        return FileProvider.getUriForFile(this.f48634a, packageName + ".fileprovider", file);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (this.f48637d == null && this.f48636c == null) {
            return;
        }
        File file = this.f48638e;
        boolean z11 = false;
        boolean z12 = file != null && file.length() > 0;
        File file2 = this.f48639f;
        if (file2 != null && file2.length() > 0) {
            z11 = true;
        }
        if (i11 != 1) {
            if (i11 == 3) {
                if (i12 != -1) {
                    this.f48636c.onReceiveValue(null);
                } else if (z12) {
                    this.f48636c.onReceiveValue(n(this.f48638e));
                } else if (z11) {
                    this.f48636c.onReceiveValue(n(this.f48639f));
                } else {
                    this.f48636c.onReceiveValue(intent.getData());
                }
            }
        } else if (i12 != -1) {
            ValueCallback<Uri[]> valueCallback = this.f48637d;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z12) {
            this.f48637d.onReceiveValue(new Uri[]{n(this.f48638e)});
        } else if (z11) {
            this.f48637d.onReceiveValue(new Uri[]{n(this.f48639f)});
        } else {
            this.f48637d.onReceiveValue(q(intent, i12));
        }
        File file3 = this.f48638e;
        if (file3 != null && !z12) {
            file3.delete();
        }
        File file4 = this.f48639f;
        if (file4 != null && !z11) {
            file4.delete();
        }
        this.f48637d = null;
        this.f48636c = null;
        this.f48638e = null;
        this.f48639f = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public Intent p() {
        Intent intent;
        Throwable e11;
        try {
            File fileJ = j(c.IMAGE);
            this.f48638e = fileJ;
            Uri uriN = n(fileJ);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", uriN);
                return intent;
            } catch (IOException e12) {
                e11 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e13) {
                e11 = e13;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e14) {
            intent = null;
            e11 = e14;
        }
    }

    public Uri[] q(Intent intent, int i11) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i11 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i11, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i12 = 0; i12 < itemCount; i12++) {
            uriArr[i12] = intent.getClipData().getItemAt(i12).getUri();
        }
        return uriArr;
    }

    public Intent r() {
        Intent intent;
        Throwable e11;
        try {
            File fileJ = j(c.VIDEO);
            this.f48639f = fileJ;
            Uri uriN = n(fileJ);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", uriN);
                return intent;
            } catch (IOException e12) {
                e11 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e13) {
                e11 = e13;
                Log.e("CREATE FILE", "Error occurred while creating the File", e11);
                e11.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e14) {
            intent = null;
            e11 = e14;
        }
    }

    public boolean t(String str, String str2) {
        Activity currentActivity = this.f48634a.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z11 = androidx.core.content.b.checkSelfPermission(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z11) {
            o().a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, s(str, str2));
        }
        return z11;
    }

    public boolean u() {
        return true;
    }

    protected boolean v() {
        Activity currentActivity = this.f48634a.getCurrentActivity();
        try {
            return Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") && androidx.core.content.b.checkSelfPermission(currentActivity, "android.permission.CAMERA") != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public void x(DownloadManager.Request request) {
        this.f48635b = request;
    }

    public void y(boolean z11, double d11) {
        AtomicReference<d.a> atomicReferenceA = f48633g.a(Double.valueOf(d11));
        if (atomicReferenceA != null) {
            synchronized (atomicReferenceA) {
                try {
                    atomicReferenceA.set(z11 ? d.a.DO_NOT_OVERRIDE : d.a.SHOULD_OVERRIDE);
                    atomicReferenceA.notify();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void z(String str, ValueCallback<Uri> valueCallback) {
        Intent intentR;
        Intent intentP;
        this.f48636c = valueCallback;
        Activity currentActivity = this.f48634a.getCurrentActivity();
        Intent intentCreateChooser = Intent.createChooser(k(str), "");
        ArrayList arrayList = new ArrayList();
        if (c(str).booleanValue() && (intentP = p()) != null) {
            arrayList.add(intentP);
        }
        if (e(str).booleanValue() && (intentR = r()) != null) {
            arrayList.add(intentR);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }
}
