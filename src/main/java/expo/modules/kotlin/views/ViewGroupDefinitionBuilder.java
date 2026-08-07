package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import expo.modules.kotlin.modules.DefinitionMarker;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u000f\u001a\u00020\r\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\t2 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\r2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0015\u001a\u00020\r\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\t2\u001c\b\u0004\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\r2\u001a\b\u0004\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J;\u0010\u0018\u001a\u00020\r\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\t2\u001a\b\b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016RH\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0004\u0018\u0001`\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001f\u0010\u0005\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0010RD\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0014j\u0004\u0018\u0001` 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b&\u0010\u0005\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0016R<\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011j\u0004\u0018\u0001`'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010\u0005\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0013RB\u0010/\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014j\u0004\u0018\u0001`.8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u0010\"\u0012\u0004\b2\u0010\u0005\u001a\u0004\b0\u0010$\"\u0004\b1\u0010\u0016RB\u00104\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014j\u0004\u0018\u0001`38\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b4\u0010\"\u0012\u0004\b7\u0010\u0005\u001a\u0004\b5\u0010$\"\u0004\b6\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"Lexpo/modules/kotlin/views/ViewGroupDefinitionBuilder;", "Landroid/view/ViewGroup;", "ParentType", "", "<init>", "()V", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "build", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "Landroid/view/View;", "ChildViewType", "Lkotlin/Function3;", "", "Ljn0/h0;", "body", "AddChildView", "(Lwn0/q;)V", "Lkotlin/Function1;", "GetChildCount", "(Lwn0/l;)V", "Lkotlin/Function2;", "GetChildViewAt", "(Lwn0/p;)V", "RemoveChildViewAt", "RemoveChildView", "Lexpo/modules/kotlin/views/AddViewAction;", "addViewAction", "Lwn0/q;", "getAddViewAction", "()Lwn0/q;", "setAddViewAction", "getAddViewAction$annotations", "Lexpo/modules/kotlin/views/GetChildAtAction;", "getChildAtAction", "Lwn0/p;", "getGetChildAtAction", "()Lwn0/p;", "setGetChildAtAction", "getGetChildAtAction$annotations", "Lexpo/modules/kotlin/views/GetChildCountAction;", "getChildCountAction", "Lwn0/l;", "getGetChildCountAction", "()Lwn0/l;", "setGetChildCountAction", "getGetChildCountAction$annotations", "Lexpo/modules/kotlin/views/RemoveViewAction;", "removeViewAction", "getRemoveViewAction", "setRemoveViewAction", "getRemoveViewAction$annotations", "Lexpo/modules/kotlin/views/RemoveViewAtAction;", "removeViewAtAction", "getRemoveViewAtAction", "setRemoveViewAtAction", "getRemoveViewAtAction$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DefinitionMarker
public final class ViewGroupDefinitionBuilder<ParentType extends ViewGroup> {
    private q<? super ViewGroup, ? super View, ? super Integer, h0> addViewAction;
    private p<? super ViewGroup, ? super Integer, ? extends View> getChildAtAction;
    private l<? super ViewGroup, Integer> getChildCountAction;
    private p<? super ViewGroup, ? super View, h0> removeViewAction;
    private p<? super ViewGroup, ? super Integer, h0> removeViewAtAction;

    public static /* synthetic */ void getAddViewAction$annotations() {
    }

    public static /* synthetic */ void getGetChildAtAction$annotations() {
    }

    public static /* synthetic */ void getGetChildCountAction$annotations() {
    }

    public static /* synthetic */ void getRemoveViewAction$annotations() {
    }

    public static /* synthetic */ void getRemoveViewAtAction$annotations() {
    }

    public final /* synthetic */ <ChildViewType extends View> void AddChildView(final q<? super ParentType, ? super ChildViewType, ? super Integer, h0> body) {
        s.k(body, "body");
        s.p();
        setAddViewAction(new q<ViewGroup, View, Integer, h0>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.AddChildView.1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(ViewGroup viewGroup, View view, Integer num) {
                invoke(viewGroup, view, num.intValue());
                return h0.f84049a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void invoke(ViewGroup parent, View child, int i11) {
                s.k(parent, "parent");
                s.k(child, "child");
                q<ParentType, ChildViewType, Integer, h0> qVar = body;
                s.q(1, "ChildViewType");
                qVar.invoke((ParentType) parent, (ChildViewType) child, Integer.valueOf(i11));
            }
        });
    }

    public final void GetChildCount(final l<? super ParentType, Integer> body) {
        s.k(body, "body");
        setGetChildCountAction(new l<ViewGroup, Integer>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.GetChildCount.1
            @Override // wn0.l
            public final Integer invoke(ViewGroup view) {
                s.k(view, "view");
                return body.invoke(view);
            }
        });
    }

    public final /* synthetic */ <ChildViewType extends View> void GetChildViewAt(final p<? super ParentType, ? super Integer, ? extends ChildViewType> body) {
        s.k(body, "body");
        s.p();
        setGetChildAtAction(new p<ViewGroup, Integer, ChildViewType>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.GetChildViewAt.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(ViewGroup viewGroup, Integer num) {
                return invoke(viewGroup, num.intValue());
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroid/view/ViewGroup;I)TChildViewType; */
            public final View invoke(ViewGroup view, int i11) {
                s.k(view, "view");
                return (View) body.invoke(view, Integer.valueOf(i11));
            }
        });
    }

    public final /* synthetic */ <ChildViewType extends View> void RemoveChildView(final p<? super ParentType, ? super ChildViewType, h0> body) {
        s.k(body, "body");
        s.p();
        setRemoveViewAction(new p<ViewGroup, View, h0>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.RemoveChildView.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(ViewGroup viewGroup, View view) {
                invoke2(viewGroup, view);
                return h0.f84049a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ViewGroup view, View child) {
                s.k(view, "view");
                s.k(child, "child");
                p<ParentType, ChildViewType, h0> pVar = body;
                s.q(1, "ChildViewType");
                pVar.invoke((ParentType) view, (ChildViewType) child);
            }
        });
    }

    public final void RemoveChildViewAt(final p<? super ParentType, ? super Integer, h0> body) {
        s.k(body, "body");
        setRemoveViewAtAction(new p<ViewGroup, Integer, h0>() { // from class: expo.modules.kotlin.views.ViewGroupDefinitionBuilder.RemoveChildViewAt.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(ViewGroup viewGroup, Integer num) {
                invoke(viewGroup, num.intValue());
                return h0.f84049a;
            }

            public final void invoke(ViewGroup view, int i11) {
                s.k(view, "view");
                body.invoke(view, Integer.valueOf(i11));
            }
        });
    }

    public final ViewGroupDefinition build() {
        return new ViewGroupDefinition(this.addViewAction, this.getChildAtAction, this.getChildCountAction, this.removeViewAction, this.removeViewAtAction);
    }

    public final q<ViewGroup, View, Integer, h0> getAddViewAction() {
        return this.addViewAction;
    }

    public final p<ViewGroup, Integer, View> getGetChildAtAction() {
        return this.getChildAtAction;
    }

    public final l<ViewGroup, Integer> getGetChildCountAction() {
        return this.getChildCountAction;
    }

    public final p<ViewGroup, View, h0> getRemoveViewAction() {
        return this.removeViewAction;
    }

    public final p<ViewGroup, Integer, h0> getRemoveViewAtAction() {
        return this.removeViewAtAction;
    }

    public final void setAddViewAction(q<? super ViewGroup, ? super View, ? super Integer, h0> qVar) {
        this.addViewAction = qVar;
    }

    public final void setGetChildAtAction(p<? super ViewGroup, ? super Integer, ? extends View> pVar) {
        this.getChildAtAction = pVar;
    }

    public final void setGetChildCountAction(l<? super ViewGroup, Integer> lVar) {
        this.getChildCountAction = lVar;
    }

    public final void setRemoveViewAction(p<? super ViewGroup, ? super View, h0> pVar) {
        this.removeViewAction = pVar;
    }

    public final void setRemoveViewAtAction(p<? super ViewGroup, ? super Integer, h0> pVar) {
        this.removeViewAtAction = pVar;
    }
}
