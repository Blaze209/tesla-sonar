package rf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lrf0/c;", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lrf0/c$a;", "Lrf0/c$d;", "Lrf0/c$b;", "Lrf0/c$c;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public abstract class c {

    /* JADX INFO: renamed from: rf0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrf0/c$a;", "Lrf0/c;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class BluetoothHeadset extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public BluetoothHeadset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof BluetoothHeadset) && s.f(getName(), ((BluetoothHeadset) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "BluetoothHeadset(name=" + getName() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BluetoothHeadset(String name) {
            super(null);
            s.k(name, "name");
            this.name = name;
        }

        public /* synthetic */ BluetoothHeadset(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Bluetooth" : str);
        }
    }

    /* JADX INFO: renamed from: rf0.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrf0/c$b;", "Lrf0/c;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Earpiece extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Earpiece() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof Earpiece) && s.f(getName(), ((Earpiece) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Earpiece(name=" + getName() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Earpiece(String name) {
            super(null);
            s.k(name, "name");
            this.name = name;
        }

        public /* synthetic */ Earpiece(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Earpiece" : str);
        }
    }

    /* JADX INFO: renamed from: rf0.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrf0/c$c;", "Lrf0/c;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Speakerphone extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Speakerphone() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof Speakerphone) && s.f(getName(), ((Speakerphone) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Speakerphone(name=" + getName() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Speakerphone(String name) {
            super(null);
            s.k(name, "name");
            this.name = name;
        }

        public /* synthetic */ Speakerphone(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Speakerphone" : str);
        }
    }

    /* JADX INFO: renamed from: rf0.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lrf0/c$d;", "Lrf0/c;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class WiredHeadset extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public WiredHeadset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof WiredHeadset) && s.f(getName(), ((WiredHeadset) other).getName());
            }
            return true;
        }

        public int hashCode() {
            String name = getName();
            if (name != null) {
                return name.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WiredHeadset(name=" + getName() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WiredHeadset(String name) {
            super(null);
            s.k(name, "name");
            this.name = name;
        }

        public /* synthetic */ WiredHeadset(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "Wired Headset" : str);
        }
    }

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
