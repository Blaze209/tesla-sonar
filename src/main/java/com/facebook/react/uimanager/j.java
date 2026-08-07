package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f23307j = {0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, List<w0.b>> f23308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, float[]> f23309b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f23316i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<Integer> f23311d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23312e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23313f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23314g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23315h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, List<w0.b>> f23310c = new HashMap();

    public j(ViewGroup viewGroup) {
        this.f23316i = viewGroup;
    }

    private MotionEvent a(View view, MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr = new int[2];
        this.f23316i.getLocationOnScreen(iArr);
        motionEventObtain.setLocation(motionEvent.getRawX() - iArr[0], motionEvent.getRawY() - iArr[1]);
        return motionEventObtain;
    }

    private com.facebook.react.uimanager.events.n.b b(int i11, MotionEvent motionEvent) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
            float[] fArr = new float[2];
            float[] fArr2 = {motionEvent.getX(i12), motionEvent.getY(i12)};
            List<w0.b> listB = w0.b(fArr2[0], fArr2[1], this.f23316i, fArr);
            int pointerId = motionEvent.getPointerId(i12);
            map.put(Integer.valueOf(pointerId), fArr);
            map2.put(Integer.valueOf(pointerId), listB);
            map3.put(Integer.valueOf(pointerId), fArr2);
            map4.put(Integer.valueOf(pointerId), e(fArr2));
        }
        return new com.facebook.react.uimanager.events.n.b(this.f23313f, i11, this.f23315h, b1.f(this.f23316i), map, map2, map3, map4, this.f23311d);
    }

    private void c(View view, com.facebook.react.uimanager.events.n.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        gn.a.b(this.f23312e == -1, "Expected to not have already sent a cancel for this gesture");
        List<w0.b> list = bVar.d().get(Integer.valueOf(bVar.b()));
        if (list.isEmpty() || view == null) {
            return;
        }
        if (m(list, com.facebook.react.uimanager.events.o.a.CANCEL, com.facebook.react.uimanager.events.o.a.CANCEL_CAPTURE)) {
            int iB = list.get(0).b();
            int[] iArrH = h(view);
            ((EventDispatcher) gn.a.c(eventDispatcher)).h(com.facebook.react.uimanager.events.n.i("topPointerCancel", iB, n(bVar, iArrH[0], iArrH[1]), motionEvent));
        }
        l();
        this.f23313f = -1;
    }

    private static void d(String str, com.facebook.react.uimanager.events.n.b bVar, MotionEvent motionEvent, List<w0.b> list, EventDispatcher eventDispatcher) {
        Iterator<w0.b> it = list.iterator();
        while (it.hasNext()) {
            eventDispatcher.h(com.facebook.react.uimanager.events.n.i(str, it.next().b(), bVar, motionEvent));
        }
    }

    private float[] e(float[] fArr) {
        ViewGroup viewGroup = this.f23316i;
        int[] iArr = f23307j;
        viewGroup.getLocationOnScreen(iArr);
        return new float[]{fArr[0] + iArr[0], fArr[1] + iArr[1]};
    }

    private static List<w0.b> f(List<w0.b> list, com.facebook.react.uimanager.events.o.a aVar, com.facebook.react.uimanager.events.o.a aVar2, boolean z11) {
        ArrayList arrayList = new ArrayList(list);
        if (!z11) {
            boolean z12 = false;
            for (int size = list.size() - 1; size >= 0; size--) {
                View viewA = list.get(size).a();
                if (!z12 && !com.facebook.react.uimanager.events.o.h(viewA, aVar2) && !com.facebook.react.uimanager.events.o.h(viewA, aVar)) {
                    arrayList.remove(size);
                } else if (!z12 && com.facebook.react.uimanager.events.o.h(viewA, aVar2)) {
                    z12 = true;
                }
            }
        }
        return arrayList;
    }

    private static List<w0.b> g(List<w0.b> list, List<w0.b> list2) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list2.isEmpty()) {
            return new ArrayList();
        }
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        for (w0.b bVar : list2) {
            if (hashSet.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private int[] h(View view) {
        Rect rect = new Rect(0, 0, 1, 1);
        this.f23316i.offsetDescendantRectToMyCoords(view, rect);
        return new int[]{rect.top, rect.left};
    }

    private short i() {
        return (short) (65535 & this.f23314g);
    }

    private void j(int i11, com.facebook.react.uimanager.events.n.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int iB = bVar.b();
        List<w0.b> arrayList = i11 != -1 ? bVar.d().get(Integer.valueOf(iB)) : new ArrayList<>();
        Map<Integer, List<w0.b>> map = this.f23308a;
        List<w0.b> arrayList2 = (map == null || !map.containsKey(Integer.valueOf(iB))) ? new ArrayList<>() : this.f23308a.get(Integer.valueOf(iB));
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i12 < Math.min(arrayList.size(), arrayList2.size()) && arrayList.get((arrayList.size() - 1) - i12).equals(arrayList2.get((arrayList2.size() - 1) - i12))) {
            View viewA = arrayList.get((arrayList.size() - 1) - i12).a();
            if (!z11 && com.facebook.react.uimanager.events.o.h(viewA, com.facebook.react.uimanager.events.o.a.ENTER_CAPTURE)) {
                z11 = true;
            }
            if (!z12 && com.facebook.react.uimanager.events.o.h(viewA, com.facebook.react.uimanager.events.o.a.LEAVE_CAPTURE)) {
                z12 = true;
            }
            i12++;
        }
        if (i12 < Math.max(arrayList.size(), arrayList2.size())) {
            l();
            if (arrayList2.size() > 0) {
                int iB2 = arrayList2.get(0).b();
                if (m(arrayList2, com.facebook.react.uimanager.events.o.a.OUT, com.facebook.react.uimanager.events.o.a.OUT_CAPTURE)) {
                    eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topPointerOut", iB2, bVar, motionEvent));
                }
                List<w0.b> listF = f(arrayList2.subList(0, arrayList2.size() - i12), com.facebook.react.uimanager.events.o.a.LEAVE, com.facebook.react.uimanager.events.o.a.LEAVE_CAPTURE, z12);
                if (listF.size() > 0) {
                    d("topPointerLeave", bVar, motionEvent, listF, eventDispatcher);
                }
            }
            if (m(arrayList, com.facebook.react.uimanager.events.o.a.OVER, com.facebook.react.uimanager.events.o.a.OVER_CAPTURE)) {
                eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topPointerOver", i11, bVar, motionEvent));
            }
            List<w0.b> listF2 = f(arrayList.subList(0, arrayList.size() - i12), com.facebook.react.uimanager.events.o.a.ENTER, com.facebook.react.uimanager.events.o.a.ENTER_CAPTURE, z11);
            if (listF2.size() > 0) {
                Collections.reverse(listF2);
                d("topPointerEnter", bVar, motionEvent, listF2, eventDispatcher);
            }
        }
        HashMap map2 = new HashMap(bVar.d());
        if (i11 == -1) {
            map2.remove(Integer.valueOf(iB));
        }
        this.f23308a = map2;
    }

    private void l() {
        this.f23314g = (this.f23314g + 1) % Integer.MAX_VALUE;
    }

    private static boolean m(List<w0.b> list, com.facebook.react.uimanager.events.o.a aVar, com.facebook.react.uimanager.events.o.a aVar2) {
        for (w0.b bVar : list) {
            if (com.facebook.react.uimanager.events.o.h(bVar.a(), aVar) || com.facebook.react.uimanager.events.o.h(bVar.a(), aVar2)) {
                return true;
            }
        }
        return false;
    }

    private com.facebook.react.uimanager.events.n.b n(com.facebook.react.uimanager.events.n.b bVar, float f11, float f12) {
        HashMap map = new HashMap(bVar.h());
        HashMap map2 = new HashMap(bVar.c());
        HashMap map3 = new HashMap(bVar.j());
        float[] fArr = {f11, f12};
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((Map.Entry) it.next()).setValue(fArr);
        }
        float[] fArr2 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        Iterator it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).setValue(fArr2);
        }
        float[] fArrE = e(fArr);
        Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            ((Map.Entry) it3.next()).setValue(fArrE);
        }
        return new com.facebook.react.uimanager.events.n.b(bVar.i(), bVar.b(), bVar.g(), bVar.k(), map, new HashMap(bVar.d()), map2, map3, new HashSet(bVar.f()));
    }

    private void q(int i11, com.facebook.react.uimanager.events.n.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List<w0.b> list = bVar.d().get(Integer.valueOf(bVar.b()));
        l();
        if (!this.f23311d.contains(Integer.valueOf(bVar.b()))) {
            if (m(list, com.facebook.react.uimanager.events.o.a.OVER, com.facebook.react.uimanager.events.o.a.OVER_CAPTURE)) {
                eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topPointerOver", i11, bVar, motionEvent));
            }
            List<w0.b> listF = f(list, com.facebook.react.uimanager.events.o.a.ENTER, com.facebook.react.uimanager.events.o.a.ENTER_CAPTURE, false);
            Collections.reverse(listF);
            d("topPointerEnter", bVar, motionEvent, listF, eventDispatcher);
        }
        if (m(list, com.facebook.react.uimanager.events.o.a.CLICK, com.facebook.react.uimanager.events.o.a.CLICK_CAPTURE)) {
            this.f23310c.put(Integer.valueOf(bVar.b()), new ArrayList(list));
        }
        if (m(list, com.facebook.react.uimanager.events.o.a.DOWN, com.facebook.react.uimanager.events.o.a.DOWN_CAPTURE)) {
            eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topPointerDown", i11, bVar, motionEvent));
        }
    }

    private void r(int i11, com.facebook.react.uimanager.events.n.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (m(bVar.d().get(Integer.valueOf(bVar.b())), com.facebook.react.uimanager.events.o.a.MOVE, com.facebook.react.uimanager.events.o.a.MOVE_CAPTURE)) {
            eventDispatcher.h(com.facebook.react.uimanager.events.n.j("topPointerMove", i11, bVar, motionEvent, i()));
        }
    }

    private void s(int i11, com.facebook.react.uimanager.events.n.b bVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int iB = bVar.b();
        List<w0.b> list = bVar.d().get(Integer.valueOf(iB));
        if (m(list, com.facebook.react.uimanager.events.o.a.UP, com.facebook.react.uimanager.events.o.a.UP_CAPTURE)) {
            eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topPointerUp", i11, bVar, motionEvent));
        }
        if (!this.f23311d.contains(Integer.valueOf(iB))) {
            if (m(list, com.facebook.react.uimanager.events.o.a.OUT, com.facebook.react.uimanager.events.o.a.OUT_CAPTURE)) {
                eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topPointerOut", i11, bVar, motionEvent));
            }
            d("topPointerLeave", bVar, motionEvent, f(list, com.facebook.react.uimanager.events.o.a.LEAVE, com.facebook.react.uimanager.events.o.a.LEAVE_CAPTURE, false), eventDispatcher);
        }
        List<w0.b> listRemove = this.f23310c.remove(Integer.valueOf(iB));
        if (listRemove != null && m(list, com.facebook.react.uimanager.events.o.a.CLICK, com.facebook.react.uimanager.events.o.a.CLICK_CAPTURE)) {
            List<w0.b> listG = g(listRemove, list);
            if (!listG.isEmpty()) {
                eventDispatcher.h(com.facebook.react.uimanager.events.n.i("topClick", listG.get(0).b(), bVar, motionEvent));
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f23313f = -1;
        }
        this.f23311d.remove(Integer.valueOf(iB));
    }

    private static boolean t(float[] fArr, float[] fArr2) {
        return Math.abs(fArr2[0] - fArr[0]) > 0.1f || Math.abs(fArr2[1] - fArr[1]) > 0.1f;
    }

    public void k(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z11) {
        int iB;
        View viewA;
        if (this.f23312e != -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (actionMasked == 0) {
            this.f23313f = motionEvent.getPointerId(0);
        } else if (actionMasked == 7) {
            this.f23311d.add(Integer.valueOf(pointerId));
        }
        com.facebook.react.uimanager.events.n.b bVarB = b(pointerId, motionEvent);
        boolean z12 = z11 && motionEvent.getActionMasked() == 10;
        if (z12) {
            Map<Integer, List<w0.b>> map = this.f23308a;
            List<w0.b> list = map != null ? map.get(Integer.valueOf(bVarB.b())) : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            w0.b bVar = list.get(list.size() - 1);
            iB = bVar.b();
            viewA = bVar.a();
            bVarB.d().put(Integer.valueOf(pointerId), new ArrayList());
        } else {
            List<w0.b> list2 = bVarB.d().get(Integer.valueOf(pointerId));
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            w0.b bVar2 = list2.get(0);
            iB = bVar2.b();
            viewA = bVar2.a();
        }
        j(iB, bVarB, motionEvent, eventDispatcher);
        switch (actionMasked) {
            case 0:
            case 5:
                q(iB, bVarB, motionEvent, eventDispatcher);
                break;
            case 1:
            case 6:
                l();
                s(iB, bVarB, motionEvent, eventDispatcher);
                break;
            case 2:
                r(iB, bVarB, motionEvent, eventDispatcher);
                break;
            case 3:
                c(viewA, bVarB, motionEvent, eventDispatcher);
                j(-1, bVarB, motionEvent, eventDispatcher);
                break;
            case 4:
            case 8:
            default:
                qk.a.I("ReactNative", "Motion Event was ignored. Action=" + actionMasked + " Target=" + iB);
                return;
            case 7:
                float[] fArr = bVarB.c().get(Integer.valueOf(pointerId));
                Map<Integer, float[]> map2 = this.f23309b;
                if (!t(fArr, (map2 == null || !map2.containsKey(Integer.valueOf(pointerId))) ? new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED} : this.f23309b.get(Integer.valueOf(pointerId)))) {
                    return;
                } else {
                    r(iB, bVarB, motionEvent, eventDispatcher);
                }
                break;
            case 9:
                return;
            case 10:
                if (z12) {
                    r(iB, bVarB, motionEvent, eventDispatcher);
                }
                break;
        }
        this.f23309b = new HashMap(bVarB.c());
        this.f23315h = motionEvent.getButtonState();
        this.f23311d.retainAll(this.f23309b.keySet());
    }

    public void o() {
        this.f23312e = -1;
    }

    public void p(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.f23312e != -1 || view == null) {
            return;
        }
        MotionEvent motionEventA = a(view, motionEvent);
        motionEventA.setAction(3);
        k(motionEventA, eventDispatcher, false);
        this.f23312e = view.getId();
    }
}
