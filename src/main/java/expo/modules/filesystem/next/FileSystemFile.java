package expo.modules.filesystem.next;

import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.kotlin.typedarray.TypedArray;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import p013kotlin.text.g;
import p013kotlin.text.t;
import sn0.b;
import sn0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015¨\u0006("}, d2 = {"Lexpo/modules/filesystem/next/FileSystemFile;", "Lexpo/modules/filesystem/next/FileSystemPath;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "<init>", "(Ljava/io/File;)V", "Ljn0/h0;", "validatePath", "()V", "validateType", "Lexpo/modules/filesystem/next/CreateOptions;", "options", "create", "(Lexpo/modules/filesystem/next/CreateOptions;)V", "", "content", "write", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/typedarray/TypedArray;", "(Lexpo/modules/kotlin/typedarray/TypedArray;)V", "asString", "()Ljava/lang/String;", "text", "base64", "", "bytes", "()[B", "getMd5", "getMd5$annotations", "md5", "", "getExists", "()Z", "exists", "", "getSize", "()Ljava/lang/Long;", "size", "getType", "type", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemFile extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFile(File file) {
        super(file);
        s.k(file, "file");
    }

    public static /* synthetic */ void create$default(FileSystemFile fileSystemFile, CreateOptions createOptions, int i11, Object obj) throws UnableToCreateException, InvalidTypeFileException {
        if ((i11 & 1) != 0) {
            createOptions = new CreateOptions(false, false, 3, null);
        }
        fileSystemFile.create(createOptions);
    }

    public static /* synthetic */ void getMd5$annotations() {
    }

    public final String asString() {
        String string = Uri.fromFile(getFile()).toString();
        s.j(string, "toString(...)");
        return t.L(string, "/", false, 2, null) ? t.N1(string, 1) : string;
    }

    public final String base64() throws InvalidTypeFileException {
        validateType();
        validatePermission(Permission.READ);
        String strEncodeToString = Base64.encodeToString(h.i(getFile()), 2);
        s.j(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final byte[] bytes() throws InvalidTypeFileException {
        validateType();
        validatePermission(Permission.READ);
        return h.i(getFile());
    }

    public final void create(CreateOptions options) throws UnableToCreateException, InvalidTypeFileException {
        File parentFile;
        s.k(options, "options");
        validateType();
        validatePermission(Permission.WRITE);
        validateCanCreate(options);
        if (options.getOverwrite() && getFile().exists()) {
            getFile().delete();
        }
        if (options.getIntermediates() && (parentFile = getFile().getParentFile()) != null) {
            parentFile.mkdirs();
        }
        if (!getFile().createNewFile()) {
            throw new UnableToCreateException("file already exists or could not be created");
        }
    }

    public final boolean getExists() {
        validatePermission(Permission.READ);
        return getFile().isFile();
    }

    public final String getMd5() {
        validatePermission(Permission.READ);
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(h.i(getFile()));
        s.h(bArrDigest);
        return g.u(bArrDigest, null, 1, null);
    }

    public final Long getSize() {
        if (getFile().exists()) {
            return Long.valueOf(getFile().length());
        }
        return null;
    }

    public final String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getFile().getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    public final String text() throws InvalidTypeFileException {
        validateType();
        validatePermission(Permission.READ);
        return h.n(getFile(), null, 1, null);
    }

    public final void validatePath() {
    }

    @Override // expo.modules.filesystem.next.FileSystemPath
    public void validateType() throws InvalidTypeFileException {
        validatePermission(Permission.READ);
        if (getFile().exists() && getFile().isDirectory()) {
            throw new InvalidTypeFileException();
        }
    }

    public final void write(String content) throws UnableToCreateException, InvalidTypeFileException {
        s.k(content, "content");
        validateType();
        validatePermission(Permission.WRITE);
        if (!getExists()) {
            create$default(this, null, 1, null);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(getFile());
        try {
            byte[] bytes = content.getBytes(d.UTF_8);
            s.j(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            h0 h0Var = h0.f84049a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public final void write(TypedArray content) throws UnableToCreateException, InvalidTypeFileException {
        s.k(content, "content");
        validateType();
        validatePermission(Permission.WRITE);
        if (!getExists()) {
            create$default(this, null, 1, null);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(getFile());
        try {
            fileOutputStream.getChannel().write(content.toDirectBuffer());
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }
}
