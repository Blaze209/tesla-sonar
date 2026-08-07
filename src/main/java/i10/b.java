package i10;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import c10.f;
import c10.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.events.g;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.modal.ReactModalHostView;
import com.facebook.react.views.view.e;
import f10.KeyboardAnimationCallbackConfig;
import f10.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Li10/b;", "Lcom/facebook/react/uimanager/events/g;", "Lcom/facebook/react/views/view/e;", "view", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lf10/l;", "config", "Lkotlin/Function0;", "Lf10/k;", "callback", "<init>", "(Lcom/facebook/react/views/view/e;Lcom/facebook/react/uimanager/v0;Lf10/l;Lwn0/a;)V", "Lcom/facebook/react/uimanager/events/d;", "event", "Ljn0/h0;", "onEventDispatch", "(Lcom/facebook/react/uimanager/events/d;)V", "c", "()V", "b", "a", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/v0;", "Lf10/l;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "Lcom/facebook/react/bridge/UIManager;", "e", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "f", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "g", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KeyboardAnimationCallbackConfig config;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<k> callback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final UIManager uiManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final EventDispatcher eventDispatcher;

    public b(e view, v0 reactContext, KeyboardAnimationCallbackConfig config, wn0.a<k> callback) {
        s.k(view, "view");
        s.k(reactContext, "reactContext");
        s.k(config, "config");
        s.k(callback, "callback");
        this.view = view;
        this.reactContext = reactContext;
        this.config = config;
        this.callback = callback;
        this.uiManager = f.d(reactContext);
        this.eventDispatcher = f.b(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k kVar, e eVar, b bVar, DialogInterface dialogInterface) {
        k.p(kVar, null, null, 3, null);
        kVar.d();
        h.a(eVar);
        k kVarInvoke = bVar.callback.invoke();
        if (kVarInvoke != null) {
            kVarInvoke.n(false);
        }
    }

    public final void b() {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.c(this);
        }
    }

    public final void c() {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.g(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.g
    public void onEventDispatch(d<?> event) {
        ReactModalHostView reactModalHostView;
        View decorView;
        s.k(event, "event");
        if (s.f(event.getEventName(), "topShow")) {
            View rootView = null;
            try {
                UIManager uIManager = this.uiManager;
                View viewResolveView = uIManager != null ? uIManager.resolveView(event.getViewTag()) : null;
                reactModalHostView = viewResolveView instanceof ReactModalHostView ? (ReactModalHostView) viewResolveView : null;
            } catch (Exception e11) {
                g10.a.f67023a.c(c.f74070a, "Can not resolve view for Modal#" + event.getViewTag(), e11);
            }
            if (reactModalHostView == null) {
                return;
            }
            Dialog dialog = reactModalHostView.getDialog();
            Window window = dialog != null ? dialog.getWindow() : null;
            if (window != null && (decorView = window.getDecorView()) != null) {
                rootView = decorView.getRootView();
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                final e eVar = new e(this.reactContext);
                eVar.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                final k kVar = new k(this.view, viewGroup, this.reactContext, this.config);
                viewGroup.addView(eVar);
                if (c.f74071b) {
                    k kVarInvoke = this.callback.invoke();
                    if (kVarInvoke != null) {
                        kVarInvoke.n(true);
                    }
                    ViewCompat.L0(viewGroup, kVar);
                    ViewCompat.E0(eVar, kVar);
                    kVar.o(Double.valueOf(0.0d), Boolean.FALSE);
                }
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: i10.a
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            b.d(kVar, eVar, this, dialogInterface);
                        }
                    });
                }
                if (window != null) {
                    window.setSoftInputMode(48);
                }
            }
        }
    }
}
