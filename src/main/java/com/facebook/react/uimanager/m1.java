package com.facebook.react.uimanager;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u001a\u0014\u001e\u0005'!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J/\u0010\u000b\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0018\u0010\u0010\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u00030\u000e0\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u001a\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00028\u00000\u0019\"\b\b\u0000\u0010\u0017*\u00020\u00162\u0018\u0010\u0018\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000e0\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b!\u0010\"R,\u0010%\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00190#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R(\u0010&\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$¨\u0006("}, d2 = {"Lcom/facebook/react/uimanager/m1;", "", "<init>", "()V", "Ljn0/h0;", "b", "Lcom/facebook/react/uimanager/i0;", "T", "node", "Lcom/facebook/react/uimanager/k0;", "props", "g", "(Lcom/facebook/react/uimanager/i0;Lcom/facebook/react/uimanager/k0;)V", "Ljava/lang/Class;", "Lcom/facebook/react/uimanager/ViewManager;", "", "viewManagerTopClass", "shadowNodeTopClass", "", "", "f", "(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Map;", "Landroid/view/View;", "V", "managerClass", "Lcom/facebook/react/uimanager/m1$f;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;)Lcom/facebook/react/uimanager/m1$f;", "nodeClass", "Lcom/facebook/react/uimanager/m1$e;", "e", "(Ljava/lang/Class;)Lcom/facebook/react/uimanager/m1$e;", "cls", "c", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "Ljava/util/Map;", "VIEW_MANAGER_SETTER_MAP", "SHADOW_NODE_SETTER_MAP", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f23336a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, f<?, ?>> VIEW_MANAGER_SETTER_MAP = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, e<?>> SHADOW_NODE_SETTER_MAP = new HashMap();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/uimanager/m1$a;", "Lcom/facebook/react/uimanager/m1$e;", "Lcom/facebook/react/uimanager/i0;", "Ljava/lang/Class;", "", "shadowNodeClass", "<init>", "(Ljava/lang/Class;)V", "node", "", "name", "", "value", "Ljn0/h0;", "c", "(Lcom/facebook/react/uimanager/i0;Ljava/lang/String;Ljava/lang/Object;)V", "", "props", "a", "(Ljava/util/Map;)V", "", "Lcom/facebook/react/uimanager/s1$m;", "Ljava/util/Map;", "propSetters", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements e<i0<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, s1.m> propSetters;

        public a(Class shadowNodeClass) {
            p013kotlin.jvm.internal.s.k(shadowNodeClass, "shadowNodeClass");
            Map<String, s1.m> mapH = s1.h(shadowNodeClass);
            p013kotlin.jvm.internal.s.j(mapH, "getNativePropSettersForShadowNodeClass(...)");
            this.propSetters = mapH;
        }

        @Override // com.facebook.react.uimanager.m1.d
        public void a(Map<String, String> props) {
            p013kotlin.jvm.internal.s.k(props, "props");
            for (s1.m mVar : this.propSetters.values()) {
                props.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.m1.e
        public void c(i0<?> node, String name, Object value) {
            p013kotlin.jvm.internal.s.k(node, "node");
            p013kotlin.jvm.internal.s.k(name, "name");
            s1.m mVar = this.propSetters.get(name);
            if (mVar != null) {
                mVar.d(node, value);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/uimanager/m1$b;", "Landroid/view/View;", "V", "Lcom/facebook/react/uimanager/m1$f;", "Lcom/facebook/react/uimanager/ViewManager;", "Ljava/lang/Class;", "viewManagerClass", "<init>", "(Ljava/lang/Class;)V", "manager", "view", "", "name", "", "value", "Ljn0/h0;", "b", "(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "", "props", "a", "(Ljava/util/Map;)V", "", "Lcom/facebook/react/uimanager/s1$m;", "Ljava/util/Map;", "mPropSetters", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b<V extends View> implements f<ViewManager<V, ?>, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, s1.m> mPropSetters;

        public b(Class<? extends ViewManager<V, ?>> viewManagerClass) {
            p013kotlin.jvm.internal.s.k(viewManagerClass, "viewManagerClass");
            Map<String, s1.m> mapI = s1.i(viewManagerClass);
            p013kotlin.jvm.internal.s.j(mapI, "getNativePropSettersForViewManagerClass(...)");
            this.mPropSetters = mapI;
        }

        @Override // com.facebook.react.uimanager.m1.d
        public void a(Map<String, String> props) {
            p013kotlin.jvm.internal.s.k(props, "props");
            for (s1.m mVar : this.mPropSetters.values()) {
                props.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.m1.f
        public void b(ViewManager<V, ?> manager, V view, String name, Object value) {
            p013kotlin.jvm.internal.s.k(manager, "manager");
            p013kotlin.jvm.internal.s.k(view, "view");
            p013kotlin.jvm.internal.s.k(name, "name");
            s1.m mVar = this.mPropSetters.get(name);
            if (mVar != null) {
                mVar.e(manager, view, value);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R*\u0010\u0019\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/uimanager/m1$c;", "Landroid/view/View;", "T", "Lcom/facebook/react/uimanager/l1;", "Lcom/facebook/react/uimanager/ViewManager;", "manager", "<init>", "(Lcom/facebook/react/uimanager/ViewManager;)V", "view", "", "propName", "", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "a", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/uimanager/ViewManager;", "Lcom/facebook/react/uimanager/m1$f;", "b", "Lcom/facebook/react/uimanager/m1$f;", "setter", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c<T extends View> implements l1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ViewManager<T, ?> manager;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final f<ViewManager<T, ?>, T> setter;

        public c(ViewManager<T, ?> manager) {
            p013kotlin.jvm.internal.s.k(manager, "manager");
            this.manager = manager;
            this.setter = m1.f23336a.d(manager.getClass());
        }

        @Override // com.facebook.react.uimanager.l1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void c(T view, String commandName, ReadableArray args) {
            p013kotlin.jvm.internal.s.k(view, "view");
            p013kotlin.jvm.internal.s.k(commandName, "commandName");
        }

        @Override // com.facebook.react.uimanager.l1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(T view, String propName, Object value) {
            p013kotlin.jvm.internal.s.k(view, "view");
            p013kotlin.jvm.internal.s.k(propName, "propName");
            this.setter.b(this.manager, view, propName, value);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/m1$d;", "", "", "", "props", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface d {
        void a(Map<String, String> props);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002 \u0000*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/m1$e;", "Lcom/facebook/react/uimanager/i0;", "T", "Lcom/facebook/react/uimanager/m1$d;", "node", "", "name", "", "value", "Ljn0/h0;", "c", "(Lcom/facebook/react/uimanager/i0;Ljava/lang/String;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface e<T extends i0<?>> extends d {
        void c(T node, String name, Object value);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/m1$f;", "Lcom/facebook/react/uimanager/ViewManager;", "T", "Landroid/view/View;", "V", "Lcom/facebook/react/uimanager/m1$d;", "manager", "view", "", "name", "", "value", "Ljn0/h0;", "b", "(Lcom/facebook/react/uimanager/ViewManager;Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface f<T extends ViewManager<V, ?>, V extends View> extends d {
        void b(T manager, V view, String name, Object value);
    }

    private m1() {
    }

    public static final void b() {
        s1.b();
        VIEW_MANAGER_SETTER_MAP.clear();
        SHADOW_NODE_SETTER_MAP.clear();
    }

    private final <T> T c(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            qk.a.I("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <V extends View> f<ViewManager<V, ?>, V> d(Class<? extends ViewManager<V, ?>> managerClass) {
        Map<Class<?>, f<?, ?>> map = VIEW_MANAGER_SETTER_MAP;
        f<ViewManager<V, ?>, V> bVar = (f) map.get(managerClass);
        if (bVar == null) {
            bVar = (f) c(managerClass);
            if (bVar == null) {
                bVar = new b<>(managerClass);
            }
            map.put(managerClass, bVar);
        }
        return bVar;
    }

    private final <T extends i0<T>> e<T> e(Class<? extends T> nodeClass) {
        Map<Class<?>, e<?>> map = SHADOW_NODE_SETTER_MAP;
        e<T> aVar = (e) map.get(nodeClass);
        if (aVar == null) {
            aVar = (e) c(nodeClass);
            if (aVar == null) {
                p013kotlin.jvm.internal.s.i(nodeClass, "null cannot be cast to non-null type java.lang.Class<kotlin.Nothing>");
                aVar = new a(nodeClass);
            }
            map.put(nodeClass, (e<?>) aVar);
        }
        return aVar;
    }

    public static final Map<String, String> f(Class<? extends ViewManager> viewManagerTopClass, Class shadowNodeTopClass) {
        p013kotlin.jvm.internal.s.k(viewManagerTopClass, "viewManagerTopClass");
        p013kotlin.jvm.internal.s.k(shadowNodeTopClass, "shadowNodeTopClass");
        HashMap map = new HashMap();
        m1 m1Var = f23336a;
        m1Var.d(viewManagerTopClass).a(map);
        m1Var.e(shadowNodeTopClass).a(map);
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends i0<T>> void g(T node, k0 props) {
        p013kotlin.jvm.internal.s.k(node, "node");
        p013kotlin.jvm.internal.s.k(props, "props");
        e eVarE = f23336a.e(node.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = props.f23326a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            eVarE.c(node, next.getKey(), next.getValue());
        }
    }
}
