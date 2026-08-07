package bc;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f16954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f16956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f16958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f16959f;

    public f(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f16957d = str2;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return d.d(this.f16954a, uri, this.f16959f);
    }

    private boolean e() {
        if (this.f16956c.getScheme() == null || !this.f16956c.getScheme().equals("data")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c11 : this.f16956c.toString().substring(5).toCharArray()) {
            if (c11 == ';') {
                break;
            }
            sb2.append(c11);
        }
        this.f16957d = sb2.toString();
        return true;
    }

    private boolean g() {
        if (this.f16956c.getScheme() == null || !(this.f16956c.getScheme().equals("content") || this.f16956c.getScheme().equals(Action.FILE_ATTRIBUTE))) {
            return false;
        }
        if (this.f16957d != null) {
            return true;
        }
        String strA = a(this.f16956c.toString());
        this.f16957d = strA;
        if (strA == null) {
            String strB = b(this.f16956c);
            if (strB == null) {
                return false;
            }
            this.f16957d = a(strB);
        }
        if (this.f16957d == null) {
            this.f16957d = "*/*";
        }
        return true;
    }

    public String c() {
        String str = this.f16957d;
        return str == null ? "*/*" : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String strSubstring = this.f16956c.toString().substring(this.f16957d.length() + 13);
            String str = this.f16958e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(this.f16959f.booleanValue() ? this.f16954a.getCacheDir() : this.f16954a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(strSubstring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return d.a(this.f16954a, file2);
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else if (g()) {
            Uri uri = Uri.parse(this.f16955b);
            if (uri.getPath() == null) {
                return null;
            }
            return d.a(this.f16954a, new File(uri.getPath()));
        }
        return null;
    }

    public boolean f() {
        return e() || g();
    }

    public f(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f16955b = str;
        this.f16956c = Uri.parse(str);
        this.f16958e = str2;
        this.f16959f = bool;
        this.f16954a = reactApplicationContext;
    }
}
