package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R8\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Lg3/c;", "Lkotlin/Function3;", "Lg3/h;", "Lj3/m;", "Lkotlin/Function1;", "Lm3/f;", "Ljn0/h0;", "", "startDrag", "<init>", "(Lwn0/q;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "Lg3/d;", "node", "b", "(Lg3/d;)V", "a", "(Lg3/d;)Z", "Lwn0/q;", "Lg3/e;", "Lg3/e;", "rootDragAndDropNode", "Landroidx/collection/b;", "c", "Landroidx/collection/b;", "interestedNodes", "Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DragAndDropModifierOnDragListener implements View.OnDragListener, g3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.q<g3.h, j3.m, wn0.l<? super m3.f, jn0.h0>, Boolean> startDrag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g3.e rootDragAndDropNode = new g3.e(a.f5629c);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.collection.b<g3.d> interestedNodes = new androidx.collection.b<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d modifier = new b4.s0<g3.e>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f5630b.rootDragAndDropNode.hashCode();
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public g3.e i() {
            return this.f5630b.rootDragAndDropNode;
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void m(g3.e node) {
        }
    };

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/b;", "it", "Lg3/g;", "a", "(Lg3/b;)Lg3/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<g3.b, g3.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5629c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g3.g invoke(g3.b bVar) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(wn0.q<? super g3.h, ? super j3.m, ? super wn0.l<? super m3.f, jn0.h0>, Boolean> qVar) {
        this.startDrag = qVar;
    }

    @Override // g3.c
    public boolean a(g3.d node) {
        return this.interestedNodes.contains(node);
    }

    @Override // g3.c
    public void b(g3.d node) {
        this.interestedNodes.add(node);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public androidx.compose.ui.d getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent event) {
        g3.b bVar = new g3.b(event);
        switch (event.getAction()) {
            case 1:
                boolean zX2 = this.rootDragAndDropNode.x2(bVar);
                Iterator<g3.d> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().H0(bVar);
                }
                return zX2;
            case 2:
                this.rootDragAndDropNode.P1(bVar);
                return false;
            case 3:
                return this.rootDragAndDropNode.G1(bVar);
            case 4:
                this.rootDragAndDropNode.u1(bVar);
                return false;
            case 5:
                this.rootDragAndDropNode.m0(bVar);
                return false;
            case 6:
                this.rootDragAndDropNode.U0(bVar);
                return false;
            default:
                return false;
        }
    }
}
