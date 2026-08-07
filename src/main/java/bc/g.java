package bc;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f16960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<Uri> f16961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f16962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f16964e;

    public g(ReadableArray readableArray, ArrayList<String> arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f16963d = str;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return d.d(this.f16960a, uri, this.f16964e);
    }

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String strSubstring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f16963d;
        if (str == null) {
            this.f16963d = strSubstring;
            return true;
        }
        if (!str.equalsIgnoreCase(strSubstring) && this.f16963d.split("/")[0].equalsIgnoreCase(strSubstring.split("/")[0])) {
            this.f16963d = this.f16963d.split("/")[0].concat("/*");
            return true;
        }
        if (this.f16963d.equalsIgnoreCase(strSubstring)) {
            return true;
        }
        this.f16963d = "*/*";
        return true;
    }

    private boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !Action.FILE_ATTRIBUTE.equals(uri.getScheme())) {
            return false;
        }
        String strA = a(uri.toString());
        if (strA == null) {
            strA = a(b(uri));
        }
        if (strA == null) {
            strA = "*/*";
        }
        String str = this.f16963d;
        if (str == null) {
            this.f16963d = strA;
            return true;
        }
        if (!str.equalsIgnoreCase(strA) && this.f16963d.split("/")[0].equalsIgnoreCase(strA.split("/")[0])) {
            this.f16963d = this.f16963d.split("/")[0].concat("/*");
            return true;
        }
        if (this.f16963d.equalsIgnoreCase(strA)) {
            return true;
        }
        this.f16963d = "*/*";
        return true;
    }

    public String c() {
        String str = this.f16963d;
        return str == null ? "*/*" : str;
    }

    public ArrayList<Uri> d() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < this.f16961b.size(); i11++) {
            Uri uri = this.f16961b.get(i11);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String strSubstring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f16962c.size() >= i11 + 1 ? this.f16962c.get(i11) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file = new File(this.f16964e.booleanValue() ? this.f16960a.getCacheDir() : this.f16960a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(strSubstring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(d.a(this.f16960a, file2));
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f16962c.size() >= i11 + 1) {
                    arrayList.add(d.a(this.f16960a, new File(uri.getPath(), this.f16962c.get(i11))));
                } else {
                    arrayList.add(d.a(this.f16960a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean f() {
        boolean z11 = true;
        for (Uri uri : this.f16961b) {
            z11 = e(uri) || g(uri);
            if (!z11) {
                break;
            }
        }
        return z11;
    }

    public g(ReadableArray readableArray, ArrayList<String> arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f16961b = new ArrayList<>();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (string != null) {
                this.f16961b.add(Uri.parse(string));
            }
        }
        this.f16962c = arrayList;
        this.f16964e = bool;
        this.f16960a = reactApplicationContext;
    }
}
