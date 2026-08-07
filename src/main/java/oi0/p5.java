package oi0;

import android.content.Context;
import android.view.LayoutInflater;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.LinkedList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00072\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Loi0/p5;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "Ljn0/h0;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/OnLayoutListener;", "cb", DateTokenConverter.CONVERTER_KEY, "(Lwn0/a;)V", "c", "()V", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "Landroid/view/LayoutInflater;", "b", "Landroid/view/LayoutInflater;", "()Landroid/view/LayoutInflater;", "layoutInflater", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "onLayoutListeners", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LayoutInflater layoutInflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LinkedList<wn0.a<jn0.h0>> onLayoutListeners;

    public p5(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        p013kotlin.jvm.internal.s.j(layoutInflaterFrom, "from(...)");
        this.layoutInflater = layoutInflaterFrom;
        this.onLayoutListeners = new LinkedList<>();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LayoutInflater getLayoutInflater() {
        return this.layoutInflater;
    }

    public final void c() {
        Iterator<wn0.a<jn0.h0>> it = this.onLayoutListeners.iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            wn0.a<jn0.h0> next = it.next();
            p013kotlin.jvm.internal.s.j(next, "next(...)");
            next.invoke();
        }
    }

    public final void d(wn0.a<jn0.h0> cb2) {
        p013kotlin.jvm.internal.s.k(cb2, "cb");
        this.onLayoutListeners.add(cb2);
    }
}
