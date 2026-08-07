package expo.modules.filesystem.next;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.interfaces.filesystem.Permission;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemDirectory;", "Lexpo/modules/filesystem/next/FileSystemPath;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "<init>", "(Ljava/io/File;)V", "Ljn0/h0;", "validatePath", "()V", "validateType", "Lexpo/modules/filesystem/next/CreateOptions;", "options", "create", "(Lexpo/modules/filesystem/next/CreateOptions;)V", "", "", "", "", "listAsRecords", "()Ljava/util/List;", "asString", "()Ljava/lang/String;", "", "getExists", "()Z", "exists", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(File file) {
        super(file);
        s.k(file, "file");
    }

    public static /* synthetic */ void create$default(FileSystemDirectory fileSystemDirectory, CreateOptions createOptions, int i11, Object obj) throws UnableToCreateException, InvalidTypeFolderException {
        if ((i11 & 1) != 0) {
            createOptions = new CreateOptions(false, false, 3, null);
        }
        fileSystemDirectory.create(createOptions);
    }

    public final String asString() {
        String string = Uri.fromFile(getFile()).toString();
        s.j(string, "toString(...)");
        if (t.L(string, "/", false, 2, null)) {
            return string;
        }
        return string + "/";
    }

    public final void create(CreateOptions options) throws UnableToCreateException, InvalidTypeFolderException {
        s.k(options, "options");
        validateType();
        validatePermission(Permission.WRITE);
        validateCanCreate(options);
        if (options.getOverwrite() && getFile().exists()) {
            getFile().delete();
        }
        if (!(options.getIntermediates() ? getFile().mkdirs() : getFile().mkdir())) {
            throw new UnableToCreateException("directory already exists or could not be created");
        }
    }

    public final boolean getExists() {
        validatePermission(Permission.READ);
        return getFile().isDirectory();
    }

    public final List<Map<String, Object>> listAsRecords() throws InvalidTypeFolderException {
        validateType();
        validatePermission(Permission.READ);
        File[] fileArrListFiles = getFile().listFiles();
        if (fileArrListFiles == null) {
            return v.m();
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            String string = Uri.fromFile(file).toString();
            s.j(string, "toString(...)");
            Pair pairA = x.a("isDirectory", Boolean.valueOf(file.isDirectory()));
            if (!t.L(string, "/", false, 2, null)) {
                string = string + "/";
            }
            arrayList.add(v0.m(pairA, x.a("uri", string)));
        }
        return arrayList;
    }

    public final void validatePath() {
    }

    @Override // expo.modules.filesystem.next.FileSystemPath
    public void validateType() throws InvalidTypeFolderException {
        if (getFile().exists() && !getFile().isDirectory()) {
            throw new InvalidTypeFolderException();
        }
    }
}
