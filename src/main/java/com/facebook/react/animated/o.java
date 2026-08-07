package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public class o implements com.facebook.react.uimanager.events.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReactApplicationContext f22245e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<b> f22241a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<e> f22242b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<b> f22243c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<EventAnimationDriver> f22244d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22246f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<b> f22247g = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22248h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22249i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22250j = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f22251a;

        a(com.facebook.react.uimanager.events.d dVar) {
            this.f22251a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.n(this.f22251a);
        }
    }

    public o(ReactApplicationContext reactApplicationContext) {
        this.f22245e = reactApplicationContext;
    }

    private void C(List<b> list) {
        int i11 = this.f22246f;
        int i12 = i11 + 1;
        this.f22246f = i12;
        if (i12 == 0) {
            this.f22246f = i11 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i13 = 0;
        for (b bVar : list) {
            int i14 = bVar.BFSColor;
            int i15 = this.f22246f;
            if (i14 != i15) {
                bVar.BFSColor = i15;
                i13++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.children != null) {
                for (int i16 = 0; i16 < bVar2.children.size(); i16++) {
                    b bVar3 = bVar2.children.get(i16);
                    bVar3.activeIncomingNodes++;
                    int i17 = bVar3.BFSColor;
                    int i18 = this.f22246f;
                    if (i17 != i18) {
                        bVar3.BFSColor = i18;
                        i13++;
                        arrayDeque.add(bVar3);
                    }
                }
            }
        }
        int i19 = this.f22246f;
        int i21 = i19 + 1;
        this.f22246f = i21;
        if (i21 == 0) {
            this.f22246f = i19 + 2;
        }
        int i22 = 0;
        for (b bVar4 : list) {
            if (bVar4.activeIncomingNodes == 0) {
                int i23 = bVar4.BFSColor;
                int i24 = this.f22246f;
                if (i23 != i24) {
                    bVar4.BFSColor = i24;
                    i22++;
                    arrayDeque.add(bVar4);
                }
            }
        }
        int i25 = 0;
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            try {
                bVar5.h();
                if (bVar5 instanceof q) {
                    ((q) bVar5).m();
                }
            } catch (JSApplicationCausedNativeException e11) {
                qk.a.n("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e11);
            }
            if (bVar5 instanceof w) {
                ((w) bVar5).m();
            }
            if (bVar5.children != null) {
                for (int i26 = 0; i26 < bVar5.children.size(); i26++) {
                    b bVar6 = bVar5.children.get(i26);
                    int i27 = bVar6.activeIncomingNodes - 1;
                    bVar6.activeIncomingNodes = i27;
                    int i28 = bVar6.BFSColor;
                    int i29 = this.f22246f;
                    if (i28 != i29 && i27 == 0) {
                        bVar6.BFSColor = i29;
                        i22++;
                        arrayDeque.add(bVar6);
                    } else if (i28 == i29) {
                        i25++;
                    }
                }
            }
        }
        if (i13 == i22) {
            this.f22250j = false;
            return;
        }
        if (this.f22250j) {
            return;
        }
        this.f22250j = true;
        qk.a.m("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            qk.a.m("NativeAnimatedNodesManager", it.next().f());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i25 > 0 ? "cycles (" + i25 + ")" : "disconnected regions") + ", there are " + i13 + " but toposort visited only " + i22);
        boolean z11 = this.f22248h;
        if (z11 && i25 == 0) {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        } else {
            if (!z11) {
                throw illegalStateException;
            }
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.facebook.react.uimanager.events.d dVar) {
        if (this.f22244d.isEmpty()) {
            return;
        }
        com.facebook.react.uimanager.events.d.b eventAnimationDriverMatchSpec = dVar.getEventAnimationDriverMatchSpec();
        boolean z11 = false;
        for (EventAnimationDriver eventAnimationDriver : this.f22244d) {
            if (eventAnimationDriverMatchSpec.a(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                z(eventAnimationDriver.valueNode);
                dVar.dispatchModern(eventAnimationDriver);
                this.f22247g.add(eventAnimationDriver.valueNode);
                z11 = true;
            }
        }
        if (z11) {
            C(this.f22247g);
            this.f22247g.clear();
        }
    }

    private String q(String str) {
        if (!str.startsWith(DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            return str;
        }
        return "top" + str.substring(2);
    }

    private void z(b bVar) {
        WritableArray writableArrayCreateArray = null;
        int i11 = 0;
        while (i11 < this.f22242b.size()) {
            e eVarValueAt = this.f22242b.valueAt(i11);
            if (bVar.equals(eVarValueAt.animatedValue)) {
                if (eVarValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", eVarValueAt.animatedValue.nodeValue);
                    eVarValueAt.endCallback.invoke(writableMapCreateMap);
                } else if (this.f22245e != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", eVarValueAt.id);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", eVarValueAt.animatedValue.nodeValue);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.f22242b.removeAt(i11);
                i11--;
            }
            i11++;
        }
        if (writableArrayCreateArray != null) {
            this.f22245e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public void A(int i11) {
        b bVar = this.f22241a.get(i11);
        if (bVar != null && (bVar instanceof w)) {
            ((w) bVar).n(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void B(int i11, ReadableMap readableMap) {
        b bVar = this.f22241a.get(i11);
        if (bVar == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i11 + "] does not exist");
        }
        if (bVar instanceof d) {
            z(bVar);
            ((d) bVar).a(readableMap);
            this.f22243c.put(i11, bVar);
        }
    }

    public void b(int i11, String str, ReadableMap readableMap) {
        int i12 = readableMap.getInt("animatedValueTag");
        b bVar = this.f22241a.get(i12);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i12 + "] does not exist");
        }
        if (!(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i11 + "] connected to event handler (" + str + ") should be of type " + w.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i13 = 0; i13 < array.size(); i13++) {
            arrayList.add(array.getString(i13));
        }
        String strQ = q(str);
        this.f22244d.add(new EventAnimationDriver(strQ, i11, arrayList, (w) bVar));
        if (strQ.equals("topScroll")) {
            b(i11, "topScrollEnded", readableMap);
        }
    }

    public void c(int i11, int i12) {
        b bVar = this.f22241a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i11 + "] does not exist");
        }
        if (!(bVar instanceof q)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i12 + "] should be of type " + q.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.f22245e;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i12);
        }
        UIManager uIManagerI = b1.i(reactApplicationContext, i12);
        if (uIManagerI != null) {
            ((q) bVar).i(i12, uIManagerI);
            this.f22243c.put(i11, bVar);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i12));
        }
    }

    public void d(int i11, int i12) {
        b bVar = this.f22241a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i11 + "] does not exist");
        }
        b bVar2 = this.f22241a.get(i12);
        if (bVar2 != null) {
            bVar.b(bVar2);
            this.f22243c.put(i12, bVar2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i12 + "] does not exist");
        }
    }

    public void e(int i11, ReadableMap readableMap) {
        b pVar;
        if (this.f22241a.get(i11) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i11 + "] already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            pVar = new s(readableMap, this);
        } else if ("value".equals(string)) {
            pVar = new w(readableMap);
        } else if ("color".equals(string)) {
            pVar = new f(readableMap, this, this.f22245e);
        } else if ("props".equals(string)) {
            pVar = new q(readableMap, this);
        } else if ("interpolation".equals(string)) {
            pVar = new k(readableMap);
        } else if ("addition".equals(string)) {
            pVar = new com.facebook.react.animated.a(readableMap, this);
        } else if ("subtraction".equals(string)) {
            pVar = new t(readableMap, this);
        } else if ("division".equals(string)) {
            pVar = new i(readableMap, this);
        } else if ("multiplication".equals(string)) {
            pVar = new m(readableMap, this);
        } else if ("modulus".equals(string)) {
            pVar = new l(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            pVar = new h(readableMap, this);
        } else if ("transform".equals(string)) {
            pVar = new v(readableMap, this);
        } else if ("tracking".equals(string)) {
            pVar = new u(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            pVar = new p(readableMap, this);
        }
        pVar.tag = i11;
        this.f22241a.put(i11, pVar);
        this.f22243c.put(i11, pVar);
    }

    public void f(int i11, int i12) {
        b bVar = this.f22241a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i11 + "] does not exist");
        }
        if (bVar instanceof q) {
            ((q) bVar).j(i12);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i12 + "] should be of type " + q.class.getName());
    }

    public void g(int i11, int i12) {
        b bVar = this.f22241a.get(i11);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i11 + "] does not exist");
        }
        b bVar2 = this.f22241a.get(i12);
        if (bVar2 != null) {
            bVar.g(bVar2);
            this.f22243c.put(i12, bVar2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i12 + "] does not exist");
        }
    }

    public void h(int i11) {
        this.f22241a.remove(i11);
        this.f22243c.remove(i11);
    }

    public void i(int i11) {
        b bVar = this.f22241a.get(i11);
        if (bVar != null && (bVar instanceof w)) {
            ((w) bVar).i();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void j(int i11) {
        b bVar = this.f22241a.get(i11);
        if (bVar != null && (bVar instanceof w)) {
            ((w) bVar).j();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public b k(int i11) {
        return this.f22241a.get(i11);
    }

    Set<Integer> l(int i11, String str) {
        int i12;
        List<b> list;
        HashSet hashSet = new HashSet();
        ListIterator<EventAnimationDriver> listIterator = this.f22244d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (next != null && str.equals(next.eventName) && i11 == (i12 = next.viewTag)) {
                hashSet.add(Integer.valueOf(i12));
                w wVar = next.valueNode;
                if (wVar != null && (list = wVar.children) != null) {
                    Iterator<b> it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(it.next().tag));
                    }
                }
            }
        }
        return hashSet;
    }

    public void m(int i11, Callback callback) {
        b bVar = this.f22241a.get(i11);
        if (bVar == null || !(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i11 + "] does not exist or is not a 'value' node");
        }
        double dL = ((w) bVar).l();
        if (callback != null) {
            callback.invoke(Double.valueOf(dL));
        } else {
            if (this.f22245e == null) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", i11);
            writableMapCreateMap.putDouble("value", dL);
            this.f22245e.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
        }
    }

    public boolean o() {
        return this.f22242b.size() > 0 || this.f22243c.size() > 0;
    }

    @Override // com.facebook.react.uimanager.events.g
    public void onEventDispatch(com.facebook.react.uimanager.events.d dVar) {
        if (UiThreadUtil.isOnUiThread()) {
            n(dVar);
        } else {
            UiThreadUtil.runOnUiThread(new a(dVar));
        }
    }

    public void p(int i11) {
        if (i11 == 2) {
            if (this.f22248h) {
                return;
            }
        } else if (this.f22249i) {
            return;
        }
        UIManager uIManagerG = b1.g(this.f22245e, i11);
        if (uIManagerG != null) {
            uIManagerG.getEventDispatcher().g(this);
            if (i11 == 2) {
                this.f22248h = true;
            } else {
                this.f22249i = true;
            }
        }
    }

    public void r(int i11, String str, int i12) {
        String strQ = q(str);
        ListIterator<EventAnimationDriver> listIterator = this.f22244d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver next = listIterator.next();
            if (strQ.equals(next.eventName) && i11 == next.viewTag && i12 == next.valueNode.tag) {
                listIterator.remove();
                break;
            }
        }
        if (strQ.equals("topScroll")) {
            r(i11, "topScrollEnded", i12);
        }
    }

    public void s(int i11) {
        b bVar = this.f22241a.get(i11);
        if (bVar == null) {
            return;
        }
        if (bVar instanceof q) {
            ((q) bVar).l();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + q.class.getName());
    }

    public void t(long j11) {
        UiThreadUtil.assertOnUiThread();
        for (int i11 = 0; i11 < this.f22243c.size(); i11++) {
            this.f22247g.add(this.f22243c.valueAt(i11));
        }
        this.f22243c.clear();
        boolean z11 = false;
        for (int i12 = 0; i12 < this.f22242b.size(); i12++) {
            e eVarValueAt = this.f22242b.valueAt(i12);
            eVarValueAt.b(j11);
            this.f22247g.add(eVarValueAt.animatedValue);
            if (eVarValueAt.hasFinished) {
                z11 = true;
            }
        }
        C(this.f22247g);
        this.f22247g.clear();
        if (z11) {
            WritableArray writableArrayCreateArray = null;
            for (int size = this.f22242b.size() - 1; size >= 0; size--) {
                e eVarValueAt2 = this.f22242b.valueAt(size);
                if (eVarValueAt2.hasFinished) {
                    if (eVarValueAt2.endCallback != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        writableMapCreateMap.putDouble("value", eVarValueAt2.animatedValue.nodeValue);
                        eVarValueAt2.endCallback.invoke(writableMapCreateMap);
                    } else if (this.f22245e != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("animationId", eVarValueAt2.id);
                        writableMapCreateMap2.putBoolean("finished", true);
                        writableMapCreateMap2.putDouble("value", eVarValueAt2.animatedValue.nodeValue);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.f22242b.removeAt(size);
                }
            }
            if (writableArrayCreateArray != null) {
                this.f22245e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
            }
        }
    }

    public void u(int i11, double d11) {
        b bVar = this.f22241a.get(i11);
        if (bVar != null && (bVar instanceof w)) {
            ((w) bVar).offset = d11;
            this.f22243c.put(i11, bVar);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
        }
    }

    public void v(int i11, double d11) {
        b bVar = this.f22241a.get(i11);
        if (bVar != null && (bVar instanceof w)) {
            z(bVar);
            ((w) bVar).nodeValue = d11;
            this.f22243c.put(i11, bVar);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
        }
    }

    public void w(int i11, int i12, ReadableMap readableMap, Callback callback) {
        e gVar;
        b bVar = this.f22241a.get(i12);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i12 + "] does not exist");
        }
        if (!(bVar instanceof w)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i12 + "] should be of type " + w.class.getName());
        }
        e eVar = this.f22242b.get(i11);
        if (eVar != null) {
            eVar.a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            gVar = new j(readableMap);
        } else if ("spring".equals(string)) {
            gVar = new r(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i12 + "]: " + string);
            }
            gVar = new g(readableMap);
        }
        gVar.id = i11;
        gVar.endCallback = callback;
        gVar.animatedValue = (w) bVar;
        this.f22242b.put(i11, gVar);
    }

    public void x(int i11, c cVar) {
        b bVar = this.f22241a.get(i11);
        if (bVar != null && (bVar instanceof w)) {
            ((w) bVar).n(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void y(int i11) {
        WritableArray writableArrayCreateArray;
        int i12 = 0;
        while (true) {
            writableArrayCreateArray = null;
            if (i12 >= this.f22242b.size()) {
                break;
            }
            e eVarValueAt = this.f22242b.valueAt(i12);
            if (eVarValueAt.id == i11) {
                if (eVarValueAt.endCallback != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", eVarValueAt.animatedValue.nodeValue);
                    eVarValueAt.endCallback.invoke(writableMapCreateMap);
                } else if (this.f22245e != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", eVarValueAt.id);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", eVarValueAt.animatedValue.nodeValue);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.f22242b.removeAt(i12);
                break;
            }
            i12++;
        }
        if (writableArrayCreateArray != null) {
            this.f22245e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }
}
