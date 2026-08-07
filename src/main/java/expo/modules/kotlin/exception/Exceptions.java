package expo.modules.kotlin.exception;

import co0.d;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.permissions.Permissions;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions;", "", "<init>", "()V", "ViewNotFound", "AppContextLost", "ReactContextLost", "ModuleNotFound", "PermissionsModuleNotFound", "FileSystemModuleNotFound", "SimulatorNotSupported", "MissingPermissions", "MissingActivity", "IncorrectThreadException", "MissingRootView", "IllegalArgument", "IllegalStateException", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Exceptions {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$AppContextLost;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppContextLost extends CodedException {
        public AppContextLost() {
            super("The app context has been lost", null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$FileSystemModuleNotFound;", "Lexpo/modules/kotlin/exception/Exceptions$ModuleNotFound;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FileSystemModuleNotFound extends ModuleNotFound {
        public FileSystemModuleNotFound() {
            super(o0.b(FilePermissionModuleInterface.class));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$IllegalArgument;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IllegalArgument extends CodedException {
        public /* synthetic */ IllegalArgument(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalArgument(String message, Throwable th2) {
            super(message, th2);
            s.k(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$IllegalStateException;", "Lexpo/modules/kotlin/exception/CodedException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IllegalStateException extends CodedException {
        public /* synthetic */ IllegalStateException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalStateException(String message, Throwable th2) {
            super(message, th2);
            s.k(message, "message");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$IncorrectThreadException;", "Lexpo/modules/kotlin/exception/CodedException;", "currentThreadName", "", "expectedThreadName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IncorrectThreadException extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectThreadException(String currentThreadName, String expectedThreadName) {
            super("Expected to run on " + expectedThreadName + " thread, but was run on " + currentThreadName, null, 2, null);
            s.k(currentThreadName, "currentThreadName");
            s.k(expectedThreadName, "expectedThreadName");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$MissingActivity;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingActivity extends CodedException {
        public MissingActivity() {
            super("The current activity is no longer available", null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$MissingPermissions;", "Lexpo/modules/kotlin/exception/CodedException;", "permissions", "", "", "<init>", "([Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingPermissions extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingPermissions(String... permissions) {
            super("Missing permissions: " + n.T0(permissions, ", ", null, null, 0, null, null, 62, null), null, 2, null);
            s.k(permissions, "permissions");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$MissingRootView;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MissingRootView extends CodedException {
        public MissingRootView() {
            super("The root view is missing", null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$ModuleNotFound;", "Lexpo/modules/kotlin/exception/CodedException;", "Lco0/d;", "clazz", "<init>", "(Lco0/d;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class ModuleNotFound extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModuleNotFound(d<?> clazz) {
            super(clazz + " module not found, make sure that everything is linked correctly", null, 2, null);
            s.k(clazz, "clazz");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$PermissionsModuleNotFound;", "Lexpo/modules/kotlin/exception/Exceptions$ModuleNotFound;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissionsModuleNotFound extends ModuleNotFound {
        public PermissionsModuleNotFound() {
            super(o0.b(Permissions.class));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReactContextLost extends CodedException {
        public ReactContextLost() {
            super("The react context has been lost", null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$SimulatorNotSupported;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SimulatorNotSupported extends CodedException {
        public SimulatorNotSupported() {
            super("This operation is not supported on the simulator", null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/Exceptions$ViewNotFound;", "Lexpo/modules/kotlin/exception/CodedException;", "Lco0/d;", "viewType", "", "viewTag", "<init>", "(Lco0/d;I)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewNotFound extends CodedException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewNotFound(d<?> viewType, int i11) {
            super("Unable to find the " + viewType + " view with tag " + i11, null, 2, null);
            s.k(viewType, "viewType");
        }
    }
}
