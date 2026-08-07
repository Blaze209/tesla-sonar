package p024x1;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import wn0.l;
import x1.o.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lx1/o;", "Lx1/o$a;", "Interval", "", "<init>", "()V", "", "index", "j", "(I)Ljava/lang/Object;", "g", "Lx1/d;", "h", "()Lx1/d;", "intervals", IntegerTokenConverter.CONVERTER_KEY, "()I", "itemCount", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class o<Interval extends a> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lx1/o$a;", "", "Lkotlin/Function1;", "", "getKey", "()Lwn0/l;", Action.KEY_ATTRIBUTE, "getType", "type", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: x1.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx1/o$a;", "Interval", "", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
        static final class C2637a extends u implements l {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2637a f122643c = new C2637a();

            C2637a() {
                super(1);
            }

            public final Void a(int i11) {
                return null;
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        default l<Integer, Object> getKey() {
            return null;
        }

        default l<Integer, Object> getType() {
            return C2637a.f122643c;
        }
    }

    public final Object g(int index) {
        d.a<Interval> aVar = h().get(index);
        return aVar.c().getType().invoke(Integer.valueOf(index - aVar.getStartIndex()));
    }

    public abstract d<Interval> h();

    public final int i() {
        return h().getSize();
    }

    public final Object j(int index) {
        Object objInvoke;
        d.a<Interval> aVar = h().get(index);
        int startIndex = index - aVar.getStartIndex();
        l<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? i0.a(index) : objInvoke;
    }
}
