package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010\u001fJ\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000fH\u0087\u0002¢\u0006\u0004\b)\u0010\u001fJ\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b*\u0010(J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010(J'\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050-0,H\u0016¢\u0006\u0004\b.\u0010/J+\u00104\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000fH\u0007¢\u0006\u0004\b7\u0010\u001fR\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/a;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativepagerview/a;", "host", "Landroid/view/View;", "child", "", "index", "Ljn0/h0;", "addView", "(Lcom/reactnativepagerview/a;Landroid/view/View;I)V", "parent", "getChildCount", "(Lcom/reactnativepagerview/a;)I", "getChildAt", "(Lcom/reactnativepagerview/a;I)Landroid/view/View;", "view", "removeView", "(Lcom/reactnativepagerview/a;Landroid/view/View;)V", "removeAllViews", "(Lcom/reactnativepagerview/a;)V", "removeViewAt", "(Lcom/reactnativepagerview/a;I)V", "", "needsCustomLayoutForChildren", "()Z", "value", "setScrollEnabled", "(Lcom/reactnativepagerview/a;Z)V", "setInitialPage", "setOrientation", "(Lcom/reactnativepagerview/a;Ljava/lang/String;)V", "set", "setOverScrollMode", "setLayoutDirection", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/reactnativepagerview/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "margin", "setPageMargin", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Companion", "a", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagerViewViewManager extends ViewGroupManager<a> {
    private static final String COMMAND_SET_PAGE = "setPage";
    private static final String COMMAND_SET_PAGE_WITHOUT_ANIMATION = "setPageWithoutAnimation";
    private static final String COMMAND_SET_SCROLL_ENABLED = "setScrollEnabledImperatively";
    private EventDispatcher eventDispatcher;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"com/reactnativepagerview/PagerViewViewManager$b", "Landroidx/viewpager2/widget/f$i;", "", "position", "", "positionOffset", "positionOffsetPixels", "Ljn0/h0;", "b", "(IFI)V", "c", "(I)V", "state", "a", "react-native-pager-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends androidx.viewpager2.widget.f.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f48678b;

        b(a aVar) {
            this.f48678b = aVar;
        }

        @Override // androidx.viewpager2.widget.f.i
        public void a(int state) {
            String str;
            super.a(state);
            if (state == 0) {
                str = "idle";
            } else if (state == 1) {
                str = "dragging";
            } else {
                if (state != 2) {
                    throw new IllegalStateException("Unsupported pageScrollState");
                }
                str = "settling";
            }
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                s.B("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.h(new q10.b(this.f48678b.getId(), str));
        }

        @Override // androidx.viewpager2.widget.f.i
        public void b(int position, float positionOffset, int positionOffsetPixels) {
            super.b(position, positionOffset, positionOffsetPixels);
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                s.B("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.h(new q10.a(this.f48678b.getId(), position, positionOffset));
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int position) {
            super.c(position);
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                s.B("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.h(new q10.c(this.f48678b.getId(), position));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(androidx.viewpager2.widget.f fVar, PagerViewViewManager pagerViewViewManager, a aVar) {
        fVar.g(pagerViewViewManager.new b(aVar));
        EventDispatcher eventDispatcher = pagerViewViewManager.eventDispatcher;
        if (eventDispatcher == null) {
            s.B("eventDispatcher");
            eventDispatcher = null;
        }
        eventDispatcher.h(new q10.c(aVar.getId(), fVar.getCurrentItem()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> mapF = jn.c.f("topPageScroll", jn.c.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", jn.c.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", jn.c.d("registrationName", "onPageSelected"));
        s.j(mapF, "of(...)");
        return mapF;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        return h.f48692a.i();
    }

    @no.a(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(a host, int value) {
        s.k(host, "host");
        h.f48692a.t(host, value);
    }

    @no.a(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(a host, int value) throws ClassNotFoundException {
        s.k(host, "host");
        h.f48692a.q(host, value);
    }

    @no.a(name = "layoutDirection")
    public final void setLayoutDirection(a host, String value) throws ClassNotFoundException {
        s.k(host, "host");
        s.k(value, "value");
        h.f48692a.s(host, value);
    }

    @no.a(name = "orientation")
    public final void setOrientation(a host, String value) {
        s.k(host, "host");
        s.k(value, "value");
        h.f48692a.u(host, value);
    }

    @no.a(name = "overScrollMode")
    public final void setOverScrollMode(a host, String value) {
        s.k(host, "host");
        s.k(value, "value");
        h.f48692a.v(host, value);
    }

    @no.a(defaultInt = 0, name = "pageMargin")
    public final void setPageMargin(a host, int margin) throws ClassNotFoundException {
        s.k(host, "host");
        h.f48692a.w(host, margin);
    }

    @no.a(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(a host, boolean value) {
        s.k(host, "host");
        h.f48692a.y(host, value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        final a aVar = new a(reactContext);
        aVar.setId(View.generateViewId());
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.setSaveEnabled(false);
        final androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(reactContext);
        fVar.setAdapter(new i());
        fVar.setSaveEnabled(false);
        NativeModule nativeModule = reactContext.getNativeModule((Class<NativeModule>) UIManagerModule.class);
        s.h(nativeModule);
        this.eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        fVar.post(new Runnable() { // from class: com.reactnativepagerview.c
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(fVar, this, aVar);
            }
        });
        aVar.addView(fVar);
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE_WITHOUT_ANIMATION) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        p013kotlin.jvm.internal.s.h(r9);
        r9 = r9.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r1 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r1.intValue() <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r9 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r9 >= r1.intValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        r0.p(r7, r9, p013kotlin.jvm.internal.s.f(r8, com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiveCommand(com.reactnativepagerview.a r7, java.lang.String r8, com.facebook.react.bridge.ReadableArray r9) throws java.lang.ClassNotFoundException {
        /*
            r6 = this;
            java.lang.String r0 = "root"
            p013kotlin.jvm.internal.s.k(r7, r0)
            super.receiveCommand(r7, r8, r9)
            com.reactnativepagerview.h r0 = com.reactnativepagerview.h.f48692a
            androidx.viewpager2.widget.f r7 = r0.h(r7)
            gn.a.c(r7)
            gn.a.c(r9)
            androidx.recyclerview.widget.RecyclerView$h r1 = r7.getAdapter()
            if (r1 == 0) goto L23
            int r1 = r1.getItemCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L24
        L23:
            r1 = 0
        L24:
            if (r8 == 0) goto L7d
            int r2 = r8.hashCode()
            r3 = -445763635(0xffffffffe56e2fcd, float:-7.030031E22)
            r4 = 0
            java.lang.String r5 = "setPage"
            if (r2 == r3) goto L56
            r3 = 1747675147(0x682b680b, float:3.2377757E24)
            if (r2 == r3) goto L43
            r3 = 1984860689(0x764e9211, float:1.0474372E33)
            if (r2 != r3) goto L7d
            boolean r2 = r8.equals(r5)
            if (r2 == 0) goto L7d
            goto L5e
        L43:
            java.lang.String r0 = "setScrollEnabledImperatively"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L7d
            p013kotlin.jvm.internal.s.h(r9)
            boolean r8 = r9.getBoolean(r4)
            r7.setUserInputEnabled(r8)
            return
        L56:
            java.lang.String r2 = "setPageWithoutAnimation"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L7d
        L5e:
            p013kotlin.jvm.internal.s.h(r9)
            int r9 = r9.getInt(r4)
            if (r1 == 0) goto L7c
            int r2 = r1.intValue()
            if (r2 <= 0) goto L7c
            if (r9 < 0) goto L7c
            int r1 = r1.intValue()
            if (r9 >= r1) goto L7c
            boolean r8 = p013kotlin.jvm.internal.s.f(r8, r5)
            r0.p(r7, r9, r8)
        L7c:
            return
        L7d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            kotlin.jvm.internal.t0 r9 = p013kotlin.jvm.internal.t0.f86535a
            java.lang.Class<com.reactnativepagerview.PagerViewViewManager> r9 = com.reactnativepagerview.PagerViewViewManager.class
            java.lang.String r9 = r9.getSimpleName()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            r9 = 2
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "Unsupported command %d received by %s."
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.String r9 = "format(...)"
            p013kotlin.jvm.internal.s.j(r8, r9)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.PagerViewViewManager.receiveCommand(com.reactnativepagerview.a, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public void removeAllViews(a parent) throws ClassNotFoundException {
        s.k(parent, "parent");
        h.f48692a.l(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(a parent, View view) throws ClassNotFoundException {
        s.k(parent, "parent");
        s.k(view, "view");
        h.f48692a.m(parent, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(a host, View child, int index) throws ClassNotFoundException {
        s.k(host, "host");
        s.k(child, "child");
        h.f48692a.e(host, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(a parent, int index) {
        s.k(parent, "parent");
        return h.f48692a.f(parent, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(a parent) {
        s.k(parent, "parent");
        return h.f48692a.g(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(a parent, int index) throws ClassNotFoundException {
        s.k(parent, "parent");
        h.f48692a.n(parent, index);
    }
}
