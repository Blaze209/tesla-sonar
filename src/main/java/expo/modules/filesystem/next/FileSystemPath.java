package expo.modules.filesystem.next;

import android.os.Build;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.filesystem.Permission;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005¨\u0006\u001f"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "<init>", "(Ljava/io/File;)V", "fileOrDirectory", "Ljn0/h0;", "delete", "validateType", "()V", "destination", "getMoveOrCopyPath", "(Lexpo/modules/filesystem/next/FileSystemPath;)Ljava/io/File;", "Lexpo/modules/interfaces/filesystem/Permission;", "permission", "", "validatePermission", "(Lexpo/modules/interfaces/filesystem/Permission;)Z", "Lexpo/modules/filesystem/next/CreateOptions;", "options", "validateCanCreate", "(Lexpo/modules/filesystem/next/CreateOptions;)V", "to", "copy", "(Lexpo/modules/filesystem/next/FileSystemPath;)V", "move", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FileSystemPath extends SharedObject {
    private File file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(File file) {
        super(null, 1, null);
        s.k(file, "file");
        this.file = file;
    }

    public static /* synthetic */ void delete$default(FileSystemPath fileSystemPath, File file, int i11, Object obj) throws UnableToDeleteException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i11 & 1) != 0) {
            file = fileSystemPath.file;
        }
        fileSystemPath.delete(file);
    }

    public final void copy(FileSystemPath to2) {
        s.k(to2, "to");
        validateType();
        to2.validateType();
        validatePermission(Permission.READ);
        to2.validatePermission(Permission.WRITE);
        h.x(this.file, getMoveOrCopyPath(to2), false, null, 6, null);
    }

    public final void delete(File fileOrDirectory) throws UnableToDeleteException {
        File[] fileArrListFiles;
        s.k(fileOrDirectory, "fileOrDirectory");
        if (!fileOrDirectory.exists()) {
            throw new UnableToDeleteException("path '" + fileOrDirectory.getPath() + "' does not exist");
        }
        if (fileOrDirectory.isDirectory() && (fileArrListFiles = fileOrDirectory.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    s.h(file);
                    delete(file);
                } else if (!file.delete()) {
                    throw new UnableToDeleteException("failed to delete '" + file.getPath() + "'");
                }
            }
        }
        if (fileOrDirectory.delete()) {
            return;
        }
        throw new UnableToDeleteException("failed to delete '" + fileOrDirectory.getPath() + "'");
    }

    public final File getFile() {
        return this.file;
    }

    public final File getMoveOrCopyPath(FileSystemPath destination) throws DestinationDoesNotExistException, CopyOrMoveDirectoryToFileException {
        s.k(destination, "destination");
        if (!(destination instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new CopyOrMoveDirectoryToFileException();
            }
            File parentFile = destination.file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new DestinationDoesNotExistException();
            }
            return destination.file;
        }
        if (this instanceof FileSystemFile) {
            if (((FileSystemDirectory) destination).getExists()) {
                return new File(destination.file, this.file.getName());
            }
            throw new DestinationDoesNotExistException();
        }
        if (((FileSystemDirectory) destination).getExists()) {
            return new File(destination.file, this.file.getName());
        }
        File parentFile2 = destination.file.getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new DestinationDoesNotExistException();
        }
        return destination.file;
    }

    public final void move(FileSystemPath to2) throws DestinationDoesNotExistException, CopyOrMoveDirectoryToFileException {
        s.k(to2, "to");
        validateType();
        to2.validateType();
        Permission permission = Permission.WRITE;
        validatePermission(permission);
        to2.validatePermission(permission);
        if (Build.VERSION.SDK_INT < 26) {
            h.A(this.file, getMoveOrCopyPath(to2), false, 0, 6, null);
            this.file.delete();
            this.file = getMoveOrCopyPath(to2);
            return;
        }
        File moveOrCopyPath = getMoveOrCopyPath(to2);
        Path path = this.file.toPath();
        s.j(path, "toPath(...)");
        Path path2 = moveOrCopyPath.toPath();
        s.j(path2, "toPath(...)");
        s.j(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
        this.file = moveOrCopyPath;
    }

    public final void setFile(File file) {
        s.k(file, "<set-?>");
        this.file = file;
    }

    public final void validateCanCreate(CreateOptions options) {
        s.k(options, "options");
        if (!options.getOverwrite() && this.file.exists()) {
            throw new UnableToCreateException("it already exists");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public final boolean validatePermission(Permission permission) {
        EnumSet<Permission> enumSetNoneOf;
        FilePermissionModuleInterface filePermission;
        s.k(permission, "permission");
        AppContext appContext = getAppContext();
        if (appContext == null || (filePermission = appContext.getFilePermission()) == null) {
            enumSetNoneOf = EnumSet.noneOf(Permission.class);
        } else {
            AppContext appContext2 = getAppContext();
            enumSetNoneOf = filePermission.getPathPermissions(appContext2 != null ? appContext2.getReactContext() : null, this.file.getPath());
            if (enumSetNoneOf == null) {
                enumSetNoneOf = EnumSet.noneOf(Permission.class);
            }
        }
        if (enumSetNoneOf.contains(permission)) {
            return true;
        }
        throw new InvalidPermissionException(permission);
    }

    public abstract void validateType();
}
