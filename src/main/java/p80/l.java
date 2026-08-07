package p80;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\n\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lp80/l;", "", "Lp80/n;", "warning", "<init>", "(Lp80/n;)V", "", "a", "()Z", "Lp80/n;", "b", "()Lp80/n;", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lp80/l$a;", "Lp80/l$b;", "Lp80/l$c;", "Lp80/l$d;", "Lp80/l$e;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Warning warning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lp80/l$b;", "Lp80/l;", "<init>", "()V", "", "a", "()Z", "c", "isEmulator", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f101961b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Warning f101962c = new Warning("SW02", "An emulator is being used to run the App.", Warning.b.HIGH);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp80/l$b$a;", "", "<init>", "()V", "Lp80/n;", "WARNING", "Lp80/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b() {
            super(f101962c, null);
        }

        private final boolean c() {
            String FINGERPRINT = Build.FINGERPRINT;
            s.j(FINGERPRINT, "FINGERPRINT");
            if (t.b0(FINGERPRINT, "generic", false, 2, null)) {
                return true;
            }
            s.j(FINGERPRINT, "FINGERPRINT");
            if (t.b0(FINGERPRINT, "unknown", false, 2, null)) {
                return true;
            }
            String MODEL = Build.MODEL;
            s.j(MODEL, "MODEL");
            if (t.h0(MODEL, "Emulator", false, 2, null)) {
                return true;
            }
            s.j(MODEL, "MODEL");
            if (t.h0(MODEL, "Android SDK built for x86", false, 2, null)) {
                return true;
            }
            s.j(MODEL, "MODEL");
            if (t.h0(MODEL, "google_sdk", false, 2, null)) {
                return true;
            }
            String MANUFACTURER = Build.MANUFACTURER;
            s.j(MANUFACTURER, "MANUFACTURER");
            if (t.h0(MANUFACTURER, "Genymotion", false, 2, null)) {
                return true;
            }
            String BRAND = Build.BRAND;
            s.j(BRAND, "BRAND");
            if (t.b0(BRAND, "generic", false, 2, null)) {
                String DEVICE = Build.DEVICE;
                s.j(DEVICE, "DEVICE");
                if (t.b0(DEVICE, "generic", false, 2, null)) {
                    return true;
                }
            }
            return s.f("google_sdk", Build.PRODUCT);
        }

        @Override // p80.l
        /* JADX INFO: renamed from: a */
        public boolean getIsDebuggerConnected() {
            return c();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lp80/l$c;", "Lp80/l;", "<init>", "()V", "", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "a", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f101963b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final List<String> f101964c = v.p("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Warning f101965d = new Warning("SW01", "The device is jailbroken.", Warning.b.HIGH);

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lp80/l$c$a;", "", "<init>", "()V", "", "", "BINARY_PATHS", "Ljava/util/List;", "Lp80/n;", "WARNING", "Lp80/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c() {
            super(f101965d, null);
        }

        private final boolean c() {
            List<String> list = f101964c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (new File(((String) it.next()) + "su").exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean d() {
            return new File(Environment.getRootDirectory().toString() + "/Superuser").isDirectory();
        }

        @Override // p80.l
        /* JADX INFO: renamed from: a */
        public boolean getIsDebuggerConnected() {
            return c() || d();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lp80/l$d;", "Lp80/l;", "<init>", "()V", "", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "a", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f101966b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Warning f101967c = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.b.HIGH);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp80/l$d$a;", "", "<init>", "()V", "Lp80/n;", "WARNING", "Lp80/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public d() {
            super(f101967c, null);
        }

        private final boolean c() {
            Field[] declaredFields = s80.b.class.getDeclaredFields();
            s.j(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (!field.isSynthetic()) {
                    arrayList.add(field);
                }
            }
            return arrayList.size() == 8;
        }

        private final boolean d() {
            Method[] declaredMethods = s80.b.class.getDeclaredMethods();
            s.j(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (!method.isSynthetic()) {
                    arrayList.add(method);
                }
            }
            return arrayList.size() == 5;
        }

        @Override // p80.l
        /* JADX INFO: renamed from: a */
        public boolean getIsDebuggerConnected() {
            return (c() && d()) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp80/l$e;", "Lp80/l;", "<init>", "()V", "", "a", "()Z", "b", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f101968b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Warning f101969c = new Warning("SW05", "The OS or the OS version is not supported.", Warning.b.HIGH);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp80/l$e$a;", "", "<init>", "()V", "Lp80/n;", "WARNING", "Lp80/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public e() {
            super(f101969c, null);
        }

        @Override // p80.l
        /* JADX INFO: renamed from: a */
        public boolean getIsDebuggerConnected() {
            return false;
        }
    }

    public /* synthetic */ l(Warning warning, DefaultConstructorMarker defaultConstructorMarker) {
        this(warning);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getIsDebuggerConnected();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Warning getWarning() {
        return this.warning;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lp80/l$a;", "Lp80/l;", "", "isDebuggerConnected", "<init>", "(Z)V", "a", "()Z", "b", "Z", "c", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C2157a f101958c = new C2157a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Warning f101959d = new Warning("SW04", "A debugger is attached to the App.", Warning.b.MEDIUM);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isDebuggerConnected;

        /* JADX INFO: renamed from: p80.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp80/l$a$a;", "", "<init>", "()V", "Lp80/n;", "WARNING", "Lp80/n;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C2157a {
            public /* synthetic */ C2157a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2157a() {
            }
        }

        public /* synthetic */ a(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Debug.isDebuggerConnected() : z11);
        }

        @Override // p80.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        public a(boolean z11) {
            super(f101959d, null);
            this.isDebuggerConnected = z11;
        }
    }

    private l(Warning warning) {
        this.warning = warning;
    }
}
