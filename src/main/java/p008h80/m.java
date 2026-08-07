package p008h80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lh80/m;", "", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lh80/m$a;", "Lh80/m$b;", "Lh80/m$c;", "Lh80/m$d;", "Lh80/m$e;", "Lh80/m$f;", "Lh80/m$g;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface m {

    /* JADX INFO: renamed from: h80.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh80/m$a;", "Lh80/m;", "Lh80/o$a;", "choice", "<init>", "(Lh80/o$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh80/o$a;", "()Lh80/o$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBrandChoiceChanged implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EditPaymentMethodViewState.CardBrandChoice choice;

        public OnBrandChoiceChanged(EditPaymentMethodViewState.CardBrandChoice choice) {
            s.k(choice, "choice");
            this.choice = choice;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EditPaymentMethodViewState.CardBrandChoice getChoice() {
            return this.choice;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnBrandChoiceChanged) && s.f(this.choice, ((OnBrandChoiceChanged) other).choice);
        }

        public int hashCode() {
            return this.choice.hashCode();
        }

        public String toString() {
            return "OnBrandChoiceChanged(choice=" + this.choice + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/m$b;", "Lh80/m;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f71262a = new b();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/m$c;", "Lh80/m;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f71263a = new c();

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/m$d;", "Lh80/m;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f71264a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/m$e;", "Lh80/m;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f71265a = new e();

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/m$f;", "Lh80/m;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f71266a = new f();

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh80/m$g;", "Lh80/m;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f71267a = new g();

        private g() {
        }
    }
}
