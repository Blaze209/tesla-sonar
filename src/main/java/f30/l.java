package f30;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0007\u0006\n\u000b\b\f\r\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lf30/l;", "", "Lf30/l$d;", "stripe3ds2Config", "<init>", "(Lf30/l$d;)V", "a", "Lf30/l$d;", DateTokenConverter.CONVERTER_KEY, "()Lf30/l$d;", "b", "c", "e", "f", "g", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l f64132d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Stripe3ds2Config stripe3ds2Config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64131c = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l f64133e = new a().b(new Stripe3ds2Config.a().a()).a();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lf30/l$a;", "", "<init>", "()V", "Lf30/l$d;", "stripe3ds2Config", "b", "(Lf30/l$d;)Lf30/l$a;", "Lf30/l;", "a", "()Lf30/l;", "Lf30/l$d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Stripe3ds2Config stripe3ds2Config;

        public final l a() {
            Stripe3ds2Config stripe3ds2Config = this.stripe3ds2Config;
            if (stripe3ds2Config != null) {
                return new l(stripe3ds2Config, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public final a b(Stripe3ds2Config stripe3ds2Config) {
            p013kotlin.jvm.internal.s.k(stripe3ds2Config, "stripe3ds2Config");
            this.stripe3ds2Config = stripe3ds2Config;
            return this;
        }
    }

    /* JADX INFO: renamed from: f30.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lf30/l$b;", "", "<init>", "()V", "Lf30/l;", "config", "Ljn0/h0;", "b", "(Lf30/l;)V", "a", "()Lf30/l;", "DEFAULT", "Lf30/l;", "instance", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a() {
            l lVar = l.f64132d;
            return lVar == null ? l.f64133e : lVar;
        }

        public final void b(l config) {
            p013kotlin.jvm.internal.s.k(config, "config");
            l.f64132d = config;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: f30.l$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf30/l$c;", "", "Lq80/b;", "buttonCustomization", "<init>", "(Lq80/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq80/b;", "()Lq80/b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2ButtonCustomization {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q80.b buttonCustomization;

        /* JADX INFO: renamed from: f30.l$c$a */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lf30/l$c$a;", "", "<init>", "()V", "", "hexColor", "b", "(Ljava/lang/String;)Lf30/l$c$a;", "", "cornerRadius", "c", "(I)Lf30/l$c$a;", DateTokenConverter.CONVERTER_KEY, OrcaFlavourKeys.FONT_SIZE, "e", "Lf30/l$c;", "a", "()Lf30/l$c;", "Lq80/b;", "Lq80/b;", "buttonCustomization", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final q80.b buttonCustomization = new q80.e();

            public final Stripe3ds2ButtonCustomization a() {
                return new Stripe3ds2ButtonCustomization(this.buttonCustomization);
            }

            public final a b(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.buttonCustomization.c(hexColor);
                return this;
            }

            public final a c(int cornerRadius) {
                this.buttonCustomization.d(cornerRadius);
                return this;
            }

            public final a d(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.buttonCustomization.setTextColor(hexColor);
                return this;
            }

            public final a e(int fontSize) {
                this.buttonCustomization.z(fontSize);
                return this;
            }
        }

        public Stripe3ds2ButtonCustomization(q80.b buttonCustomization) {
            p013kotlin.jvm.internal.s.k(buttonCustomization, "buttonCustomization");
            this.buttonCustomization = buttonCustomization;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q80.b getButtonCustomization() {
            return this.buttonCustomization;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2ButtonCustomization) && p013kotlin.jvm.internal.s.f(this.buttonCustomization, ((Stripe3ds2ButtonCustomization) other).buttonCustomization);
        }

        public int hashCode() {
            return this.buttonCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2ButtonCustomization(buttonCustomization=" + this.buttonCustomization + ")";
        }
    }

    /* JADX INFO: renamed from: f30.l$d, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\t\u001cB\u001b\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lf30/l$d;", "Landroid/os/Parcelable;", "", "timeout", "Lf30/l$g;", "uiCustomization", "<init>", "(ILf30/l$g;)V", "Ljn0/h0;", "a", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "b", "Lf30/l$g;", "c", "()Lf30/l$g;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2Config implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int timeout;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Stripe3ds2UiCustomization uiCustomization;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f64139d = 8;
        public static final Parcelable.Creator<Stripe3ds2Config> CREATOR = new c();

        /* JADX INFO: renamed from: f30.l$d$a */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lf30/l$d$a;", "", "<init>", "()V", "", "timeout", "b", "(I)Lf30/l$d$a;", "Lf30/l$g;", "uiCustomization", "c", "(Lf30/l$g;)Lf30/l$d$a;", "Lf30/l$d;", "a", "()Lf30/l$d;", "I", "Lf30/l$g;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int timeout = 5;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private Stripe3ds2UiCustomization uiCustomization = new Stripe3ds2UiCustomization.a().a();

            public final Stripe3ds2Config a() {
                return new Stripe3ds2Config(this.timeout, this.uiCustomization);
            }

            public final a b(int timeout) {
                this.timeout = timeout;
                return this;
            }

            public final a c(Stripe3ds2UiCustomization uiCustomization) {
                p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
                this.uiCustomization = uiCustomization;
                return this;
            }
        }

        /* JADX INFO: renamed from: f30.l$d$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Stripe3ds2Config> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Stripe3ds2Config createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Stripe3ds2Config(parcel.readInt(), Stripe3ds2UiCustomization.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Stripe3ds2Config[] newArray(int i11) {
                return new Stripe3ds2Config[i11];
            }
        }

        public Stripe3ds2Config(int i11, Stripe3ds2UiCustomization uiCustomization) {
            p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
            this.timeout = i11;
            this.uiCustomization = uiCustomization;
            a(i11);
        }

        private final void a(int timeout) {
            if (timeout < 5 || timeout > 99) {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive");
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTimeout() {
            return this.timeout;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Stripe3ds2UiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stripe3ds2Config)) {
                return false;
            }
            Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) other;
            return this.timeout == stripe3ds2Config.timeout && p013kotlin.jvm.internal.s.f(this.uiCustomization, stripe3ds2Config.uiCustomization);
        }

        public int hashCode() {
            return (Integer.hashCode(this.timeout) * 31) + this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.timeout + ", uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.timeout);
            this.uiCustomization.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: f30.l$e, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf30/l$e;", "", "Lq80/d;", "labelCustomization", "<init>", "(Lq80/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq80/d;", "()Lq80/d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2LabelCustomization {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q80.d labelCustomization;

        /* JADX INFO: renamed from: f30.l$e$a */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lf30/l$e$a;", "", "<init>", "()V", "", "hexColor", "b", "(Ljava/lang/String;)Lf30/l$e$a;", "", OrcaFlavourKeys.FONT_SIZE, "c", "(I)Lf30/l$e$a;", DateTokenConverter.CONVERTER_KEY, "e", "Lf30/l$e;", "a", "()Lf30/l$e;", "Lq80/d;", "Lq80/d;", "labelCustomization", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final q80.d labelCustomization = new q80.g();

            public final Stripe3ds2LabelCustomization a() {
                return new Stripe3ds2LabelCustomization(this.labelCustomization);
            }

            public final a b(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.labelCustomization.y(hexColor);
                return this;
            }

            public final a c(int fontSize) {
                this.labelCustomization.u(fontSize);
                return this;
            }

            public final a d(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.labelCustomization.setTextColor(hexColor);
                return this;
            }

            public final a e(int fontSize) {
                this.labelCustomization.z(fontSize);
                return this;
            }
        }

        public Stripe3ds2LabelCustomization(q80.d labelCustomization) {
            p013kotlin.jvm.internal.s.k(labelCustomization, "labelCustomization");
            this.labelCustomization = labelCustomization;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q80.d getLabelCustomization() {
            return this.labelCustomization;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2LabelCustomization) && p013kotlin.jvm.internal.s.f(this.labelCustomization, ((Stripe3ds2LabelCustomization) other).labelCustomization);
        }

        public int hashCode() {
            return this.labelCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2LabelCustomization(labelCustomization=" + this.labelCustomization + ")";
        }
    }

    /* JADX INFO: renamed from: f30.l$f, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf30/l$f;", "", "Lq80/p;", "toolbarCustomization", "<init>", "(Lq80/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq80/p;", "()Lq80/p;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2ToolbarCustomization {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q80.p toolbarCustomization;

        /* JADX INFO: renamed from: f30.l$f$a */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lf30/l$f$a;", "", "<init>", "()V", "", "hexColor", "b", "(Ljava/lang/String;)Lf30/l$f$a;", "e", "headerText", DateTokenConverter.CONVERTER_KEY, "buttonText", "c", "f", "", OrcaFlavourKeys.FONT_SIZE, "g", "(I)Lf30/l$f$a;", "Lf30/l$f;", "a", "()Lf30/l$f;", "Lq80/p;", "Lq80/p;", "toolbarCustomization", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final q80.p toolbarCustomization = new q80.k();

            public final Stripe3ds2ToolbarCustomization a() {
                return new Stripe3ds2ToolbarCustomization(this.toolbarCustomization);
            }

            public final a b(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.toolbarCustomization.c(hexColor);
                return this;
            }

            public final a c(String buttonText) {
                p013kotlin.jvm.internal.s.k(buttonText, "buttonText");
                this.toolbarCustomization.x(buttonText);
                return this;
            }

            public final a d(String headerText) {
                p013kotlin.jvm.internal.s.k(headerText, "headerText");
                this.toolbarCustomization.k(headerText);
                return this;
            }

            public final a e(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.toolbarCustomization.w(hexColor);
                return this;
            }

            public final a f(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.toolbarCustomization.setTextColor(hexColor);
                return this;
            }

            public final a g(int fontSize) {
                this.toolbarCustomization.z(fontSize);
                return this;
            }
        }

        public Stripe3ds2ToolbarCustomization(q80.p toolbarCustomization) {
            p013kotlin.jvm.internal.s.k(toolbarCustomization, "toolbarCustomization");
            this.toolbarCustomization = toolbarCustomization;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q80.p getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2ToolbarCustomization) && p013kotlin.jvm.internal.s.f(this.toolbarCustomization, ((Stripe3ds2ToolbarCustomization) other).toolbarCustomization);
        }

        public int hashCode() {
            return this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2ToolbarCustomization(toolbarCustomization=" + this.toolbarCustomization + ")";
        }
    }

    /* JADX INFO: renamed from: f30.l$g, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lf30/l$g;", "Landroid/os/Parcelable;", "Lq80/m;", "uiCustomization", "<init>", "(Lq80/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lq80/m;", "()Lq80/m;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stripe3ds2UiCustomization implements Parcelable {
        public static final Parcelable.Creator<Stripe3ds2UiCustomization> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q80.m uiCustomization;

        /* JADX INFO: renamed from: f30.l$g$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lf30/l$g$b;", "", "<init>", "(Ljava/lang/String;I)V", "SUBMIT", "CONTINUE", "NEXT", "CANCEL", "RESEND", "SELECT", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum b {
            SUBMIT,
            CONTINUE,
            NEXT,
            CANCEL,
            RESEND,
            SELECT;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: f30.l$g$c */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<Stripe3ds2UiCustomization> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Stripe3ds2UiCustomization createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Stripe3ds2UiCustomization((q80.m) parcel.readParcelable(Stripe3ds2UiCustomization.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Stripe3ds2UiCustomization[] newArray(int i11) {
                return new Stripe3ds2UiCustomization[i11];
            }
        }

        public Stripe3ds2UiCustomization(q80.m uiCustomization) {
            p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q80.m getUiCustomization() {
            return this.uiCustomization;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe3ds2UiCustomization) && p013kotlin.jvm.internal.s.f(this.uiCustomization, ((Stripe3ds2UiCustomization) other).uiCustomization);
        }

        public int hashCode() {
            return this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.uiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.uiCustomization, flags);
        }

        /* JADX INFO: renamed from: f30.l$g$a */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lf30/l$g$a;", "", "Lq80/m;", "uiCustomization", "<init>", "(Lq80/m;)V", "()V", "Lf30/l$g$b;", "buttonType", "Lq80/q$a;", "b", "(Lf30/l$g$b;)Lq80/q$a;", "Lf30/l$c;", "buttonCustomization", DateTokenConverter.CONVERTER_KEY, "(Lf30/l$c;Lf30/l$g$b;)Lf30/l$g$a;", "Lf30/l$f;", "toolbarCustomization", "f", "(Lf30/l$f;)Lf30/l$g$a;", "Lf30/l$e;", "labelCustomization", "e", "(Lf30/l$e;)Lf30/l$g$a;", "", "hexColor", "c", "(Ljava/lang/String;)Lf30/l$g$a;", "Lf30/l$g;", "a", "()Lf30/l$g;", "Lq80/m;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f64150c = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final q80.m uiCustomization;

            /* JADX INFO: renamed from: f30.l$g$a$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f64152a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.SUBMIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.CONTINUE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.NEXT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.CANCEL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.RESEND.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[b.SELECT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    f64152a = iArr;
                }
            }

            private a(q80.m mVar) {
                this.uiCustomization = mVar;
            }

            private final q80.q.a b(b buttonType) {
                switch (b.f64152a[buttonType.ordinal()]) {
                    case 1:
                        return q80.q.a.SUBMIT;
                    case 2:
                        return q80.q.a.CONTINUE;
                    case 3:
                        return q80.q.a.NEXT;
                    case 4:
                        return q80.q.a.CANCEL;
                    case 5:
                        return q80.q.a.RESEND;
                    case 6:
                        return q80.q.a.SELECT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public final Stripe3ds2UiCustomization a() {
                return new Stripe3ds2UiCustomization(this.uiCustomization);
            }

            public final a c(String hexColor) {
                p013kotlin.jvm.internal.s.k(hexColor, "hexColor");
                this.uiCustomization.f(hexColor);
                return this;
            }

            public final a d(Stripe3ds2ButtonCustomization buttonCustomization, b buttonType) {
                p013kotlin.jvm.internal.s.k(buttonCustomization, "buttonCustomization");
                p013kotlin.jvm.internal.s.k(buttonType, "buttonType");
                this.uiCustomization.g(buttonCustomization.getButtonCustomization(), b(buttonType));
                return this;
            }

            public final a e(Stripe3ds2LabelCustomization labelCustomization) {
                p013kotlin.jvm.internal.s.k(labelCustomization, "labelCustomization");
                this.uiCustomization.h(labelCustomization.getLabelCustomization());
                return this;
            }

            public final a f(Stripe3ds2ToolbarCustomization toolbarCustomization) {
                p013kotlin.jvm.internal.s.k(toolbarCustomization, "toolbarCustomization");
                this.uiCustomization.i(toolbarCustomization.getToolbarCustomization());
                return this;
            }

            public a() {
                this(new q80.m());
            }
        }
    }

    public /* synthetic */ l(Stripe3ds2Config stripe3ds2Config, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe3ds2Config);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Stripe3ds2Config getStripe3ds2Config() {
        return this.stripe3ds2Config;
    }

    private l(Stripe3ds2Config stripe3ds2Config) {
        this.stripe3ds2Config = stripe3ds2Config;
    }
}
