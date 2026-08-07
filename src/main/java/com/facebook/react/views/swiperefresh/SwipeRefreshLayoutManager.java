package com.facebook.react.views.swiperefresh;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo.e;
import vo.f;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = SwipeRefreshLayoutManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001;B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020 H\u0007¢\u0006\u0004\b\u001c\u0010!J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u000eH\u0017¢\u0006\u0004\b#\u0010\u0012J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b4\u00103J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0014¢\u0006\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/swiperefresh/a;", "Lvo/f;", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/swiperefresh/a;", "", "getName", "()Ljava/lang/String;", "view", "", "enabled", "Ljn0/h0;", "setEnabled", "(Lcom/facebook/react/views/swiperefresh/a;Z)V", "Lcom/facebook/react/bridge/ReadableArray;", "colors", "setColors", "(Lcom/facebook/react/views/swiperefresh/a;Lcom/facebook/react/bridge/ReadableArray;)V", "", "color", "setProgressBackgroundColor", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/Integer;)V", "value", "setSize", "(Lcom/facebook/react/views/swiperefresh/a;I)V", "size", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/Dynamic;", "(Lcom/facebook/react/views/swiperefresh/a;Lcom/facebook/react/bridge/Dynamic;)V", "refreshing", "setRefreshing", "", "offset", "setProgressViewOffset", "(Lcom/facebook/react/views/swiperefresh/a;F)V", "setNativeRefreshing", "addEventEmitters", "(Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/views/swiperefresh/a;)V", "root", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/swiperefresh/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SwipeRefreshLayoutManager extends ViewGroupManager<a> implements f<a> {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final l1<a> delegate = new e(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(v0 v0Var, a aVar) {
        EventDispatcher eventDispatcherC = b1.c(v0Var, aVar.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new b(b1.f(aVar), aVar.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(p013kotlin.collections.v0.o(x.a("topRefresh", p013kotlin.collections.v0.o(x.a("registrationName", "onRefresh")))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return p013kotlin.collections.v0.o(x.a("SIZE", p013kotlin.collections.v0.o(x.a("DEFAULT", 1), x.a("LARGE", 0))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final v0 reactContext, final a view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        view.setOnRefreshListener(new androidx.swiperefreshlayout.widget.c.j() { // from class: com.facebook.react.views.swiperefresh.c
            @Override // androidx.swiperefreshlayout.widget.c.j
            public final void a() {
                SwipeRefreshLayoutManager.addEventEmitters$lambda$0(reactContext, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new a(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(a root, String commandId, ReadableArray args) {
        s.k(root, "root");
        s.k(commandId, "commandId");
        if (!s.f(commandId, "setNativeRefreshing") || args == null) {
            return;
        }
        setRefreshing(root, args.getBoolean(0));
    }

    @Override // vo.f
    @no.a(customType = "ColorArray", name = "colors")
    public void setColors(a view, ReadableArray colors) {
        s.k(view, "view");
        if (colors == null) {
            view.setColorSchemeColors(new int[0]);
            return;
        }
        int size = colors.size();
        int[] iArr = new int[size];
        int size2 = colors.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (colors.getType(i11) == ReadableType.Map) {
                Integer color = ColorPropConverter.getColor(colors.getMap(i11), view.getContext());
                s.j(color, "getColor(...)");
                iArr[i11] = color.intValue();
            } else {
                iArr[i11] = colors.getInt(i11);
            }
        }
        view.setColorSchemeColors(Arrays.copyOf(iArr, size));
    }

    @Override // vo.f
    @no.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(a view, boolean enabled) {
        s.k(view, "view");
        view.setEnabled(enabled);
    }

    @Override // vo.f
    public void setNativeRefreshing(a view, boolean value) {
        s.k(view, "view");
        setRefreshing(view, value);
    }

    @Override // vo.f
    @no.a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(a view, Integer color) {
        s.k(view, "view");
        view.setProgressBackgroundColorSchemeColor(color != null ? color.intValue() : 0);
    }

    @Override // vo.f
    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "progressViewOffset")
    public void setProgressViewOffset(a view, float offset) {
        s.k(view, "view");
        view.setProgressViewOffset(offset);
    }

    @Override // vo.f
    @no.a(name = "refreshing")
    public void setRefreshing(a view, boolean refreshing) {
        s.k(view, "view");
        view.setRefreshing(refreshing);
    }

    public final void setSize(a view, int value) {
        s.k(view, "view");
        view.setSize(value);
    }

    @Override // vo.f
    public void setSize(a view, String size) {
        s.k(view, "view");
        if (size != null && !size.equals("default")) {
            if (size.equals("large")) {
                view.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + size);
        }
        view.setSize(1);
    }

    @no.a(name = "size")
    public final void setSize(a view, Dynamic size) {
        s.k(view, "view");
        s.k(size, "size");
        if (size.isNull()) {
            view.setSize(1);
        } else if (size.getType() == ReadableType.Number) {
            view.setSize(size.asInt());
        } else {
            if (size.getType() != ReadableType.String) {
                throw new IllegalArgumentException("Size must be 'default' or 'large'");
            }
            setSize(view, size.asString());
        }
    }
}
