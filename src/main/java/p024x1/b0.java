package p024x1;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.n3;
import p020r2.p1;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Lx1/b0;", "Lr2/y3;", "Lbo0/j;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "Ljn0/h0;", "o", "(I)V", "a", "I", "b", "<set-?>", "c", "Lr2/p1;", "k", "()Lbo0/j;", "n", "(Lbo0/j;)V", "value", DateTokenConverter.CONVERTER_KEY, "lastFirstVisibleItem", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 implements y3<j> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f122533e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int slidingWindowSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int extraItemCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 value;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastFirstVisibleItem;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lx1/b0$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Lbo0/j;", "b", "(III)Lbo0/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j b(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i11 = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return n.w(Math.max(i11 - extraItemCount, 0), i11 + slidingWindowSize + extraItemCount);
        }

        private a() {
        }
    }

    public b0(int i11, int i12, int i13) {
        this.slidingWindowSize = i12;
        this.extraItemCount = i13;
        this.value = n3.h(f122533e.b(i11, i12, i13), n3.q());
        this.lastFirstVisibleItem = i11;
    }

    private void n(j jVar) {
        this.value.setValue(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p020r2.y3
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public j getValue() {
        return (j) this.value.getValue();
    }

    public final void o(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            n(f122533e.b(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }
}
