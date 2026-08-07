package f10;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import b10.FocusedInputLayoutChangedEventData;
import b10.FocusedInputSelectionChangedEventData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.v0;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010%R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00103\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R>\u00108\u001a,\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:¨\u0006<"}, d2 = {"Lf10/g;", "", "Landroid/view/View;", "view", "Lcom/facebook/react/views/view/e;", "eventPropagationView", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/view/View;Lcom/facebook/react/views/view/e;Lcom/facebook/react/uimanager/v0;)V", "Lb10/b;", "event", "Ljn0/h0;", "g", "(Lb10/b;)V", "l", "()V", "f", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Lcom/facebook/react/views/view/e;", "c", "Lcom/facebook/react/uimanager/v0;", "", DateTokenConverter.CONVERTER_KEY, "I", "surfaceId", "Landroid/widget/EditText;", "e", "Landroid/widget/EditText;", "lastFocusedInput", "Lb10/b;", "lastEventDispatched", "Landroid/text/TextWatcher;", "Landroid/text/TextWatcher;", "textWatcher", "Lkotlin/Function0;", "h", "Lwn0/a;", "selectionSubscription", "Landroid/view/View$OnLayoutChangeListener;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/view/View$OnLayoutChangeListener;", "layoutListener", "Lkotlin/Function1;", "", "j", "Lwn0/l;", "textListener", "Lkotlin/Function6;", "", "k", "Lwn0/t;", "selectionListener", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "focusListener", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.react.views.view.e eventPropagationView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int surfaceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private EditText lastFocusedInput;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private FocusedInputLayoutChangedEventData lastEventDispatched;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextWatcher textWatcher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> selectionSubscription;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final View.OnLayoutChangeListener layoutListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<String, h0> textListener;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<Integer, Integer, Double, Double, Double, Double, h0> selectionListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnGlobalFocusChangeListener focusListener;

    public g(View view, com.facebook.react.views.view.e eventPropagationView, v0 v0Var) {
        s.k(view, "view");
        s.k(eventPropagationView, "eventPropagationView");
        this.view = view;
        this.eventPropagationView = eventPropagationView;
        this.context = v0Var;
        this.surfaceId = b1.f(view);
        this.lastEventDispatched = h.a();
        this.layoutListener = new View.OnLayoutChangeListener() { // from class: f10.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                g.j(this.f63797a, view2, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.textListener = new wn0.l() { // from class: f10.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.m(this.f63798a, (String) obj);
            }
        };
        this.selectionListener = new t() { // from class: f10.d
            @Override // wn0.t
            public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return g.k(this.f63799a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Double) obj3).doubleValue(), ((Double) obj4).doubleValue(), ((Double) obj5).doubleValue(), ((Double) obj6).doubleValue());
            }
        };
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: f10.e
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view2, View view3) {
                g.h(this.f63800a, view2, view3);
            }
        };
        this.focusListener = onGlobalFocusChangeListener;
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    private final void g(FocusedInputLayoutChangedEventData event) {
        if (s.f(event, this.lastEventDispatched)) {
            return;
        }
        this.lastEventDispatched = event;
        c10.g.a(this.context, this.eventPropagationView.getId(), new b10.a(this.surfaceId, this.eventPropagationView.getId(), event));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(g gVar, View view, View view2) {
        View viewC = null;
        if (view2 == null || view != null) {
            EditText editText = gVar.lastFocusedInput;
            if (editText != null) {
                editText.removeOnLayoutChangeListener(gVar.layoutListener);
            }
            final EditText editText2 = gVar.lastFocusedInput;
            if (editText2 != null) {
                final TextWatcher textWatcher = gVar.textWatcher;
                editText2.post(new Runnable() { // from class: f10.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.i(editText2, textWatcher);
                    }
                });
            }
            wn0.a<h0> aVar = gVar.selectionSubscription;
            if (aVar != null) {
                aVar.invoke();
            }
            gVar.lastFocusedInput = null;
        }
        if (view2 instanceof EditText) {
            EditText editText3 = (EditText) view2;
            gVar.lastFocusedInput = editText3;
            editText3.addOnLayoutChangeListener(gVar.layoutListener);
            gVar.l();
            gVar.textWatcher = c10.c.d(editText3, gVar.textListener);
            gVar.selectionSubscription = c10.c.b(editText3, gVar.selectionListener);
            l10.a.f89487a.c(editText3);
            l10.c cVar = l10.c.f89490a;
            m10.i iVarE = cVar.e(view2);
            if (iVarE != null) {
                viewC = iVarE;
            } else {
                v0 v0Var = gVar.context;
                if (v0Var != null) {
                    viewC = c10.f.c(v0Var);
                }
            }
            List<EditText> listH = cVar.h(viewC);
            int iIndexOf = listH.indexOf(view2);
            v0 v0Var2 = gVar.context;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("current", iIndexOf);
            writableMapCreateMap.putInt("count", listH.size());
            h0 h0Var = h0.f84049a;
            s.j(writableMapCreateMap, "apply(...)");
            c10.g.b(v0Var2, "KeyboardController::focusDidSet", writableMapCreateMap);
        }
        if (view2 == null) {
            gVar.g(h.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditText editText, TextWatcher textWatcher) {
        editText.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g gVar, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        gVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 k(g gVar, int i11, int i12, double d11, double d12, double d13, double d14) {
        EditText editText = gVar.lastFocusedInput;
        if (editText == null) {
            return h0.f84049a;
        }
        gVar.l();
        c10.g.a(gVar.context, gVar.eventPropagationView.getId(), new b10.c(gVar.surfaceId, gVar.eventPropagationView.getId(), new FocusedInputSelectionChangedEventData(editText.getId(), d11, d12, d13, d14, i11, i12)));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 m(g gVar, String text) {
        s.k(text, "text");
        gVar.l();
        c10.g.a(gVar.context, gVar.eventPropagationView.getId(), new b10.e(gVar.surfaceId, gVar.eventPropagationView.getId(), text));
        return h0.f84049a;
    }

    public final void f() {
        this.view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusListener);
    }

    public final void l() {
        EditText editText = this.lastFocusedInput;
        if (editText == null) {
            return;
        }
        int[] iArrB = c10.i.b(editText);
        g(new FocusedInputLayoutChangedEventData(c10.d.a(editText.getX()), c10.d.a(editText.getY()), c10.d.a(editText.getWidth()), c10.d.a(editText.getHeight()), c10.d.a(iArrB[0]), c10.d.a(iArrB[1]), editText.getId(), c10.c.g(editText)));
    }
}
