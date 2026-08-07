package p007h2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010#\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lh2/y;", "", "Lkotlin/Function1;", "Lh2/l;", "Ljn0/h0;", "block", "k", "(Lwn0/l;)V", "other", "", "c", "(Lh2/y;)Z", "", "getSize", "()I", "size", "h", "startSlot", "j", "endSlot", "Lh2/e;", DateTokenConverter.CONVERTER_KEY, "()Lh2/e;", "crossStatus", "g", "()Lh2/l;", "startInfo", "f", "endInfo", "b", "currentInfo", IntegerTokenConverter.CONVERTER_KEY, "firstInfo", "a", "()Z", "isStartHandle", "Lh2/m;", "e", "()Lh2/m;", "previousSelection", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface y {
    boolean a();

    l b();

    boolean c(y other);

    e d();

    Selection e();

    l f();

    l g();

    int getSize();

    int h();

    l i();

    int j();

    void k(l<? super l, h0> block);
}
