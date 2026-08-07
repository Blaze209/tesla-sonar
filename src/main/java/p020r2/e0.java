package p020r2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH&¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u00032\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00190\u0018H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H&¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\u0003H&¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u0003H&¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\u0003H&¢\u0006\u0004\b'\u0010#J5\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u00010\u00002\u0006\u0010+\u001a\u00020*2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017\u0082\u0001\u00010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Lr2/e0;", "Lr2/p;", "Lkotlin/Function0;", "Ljn0/h0;", "content", "u", "(Lwn0/p;)V", "", "", "values", "o", "(Ljava/util/Set;)V", "", "f", "(Ljava/util/Set;)Z", "block", IntegerTokenConverter.CONVERTER_KEY, "(Lwn0/a;)V", "value", "a", "(Ljava/lang/Object;)V", "r", "n", "()Z", "", "Lkotlin/Pair;", "Lr2/k1;", "references", "m", "(Ljava/util/List;)V", "Lr2/j1;", "state", "j", "(Lr2/j1;)V", "p", "()V", "k", "h", "t", "b", "R", "to", "", "groupIndex", "e", "(Lr2/e0;ILwn0/a;)Ljava/lang/Object;", "q", "isComposing", "Lr2/s;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface e0 extends p {
    void a(Object value);

    void b();

    <R> R e(e0 to2, int groupIndex, a<? extends R> block);

    boolean f(Set<? extends Object> values);

    void h();

    void i(a<h0> block);

    void j(j1 state);

    void k();

    void m(List<Pair<k1, k1>> references);

    boolean n();

    void o(Set<? extends Object> values);

    void p();

    boolean q();

    void r(Object value);

    void t();

    void u(p<? super l, ? super Integer, h0> content);
}
