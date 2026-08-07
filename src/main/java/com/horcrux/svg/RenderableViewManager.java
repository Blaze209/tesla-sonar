package com.horcrux.svg;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.events.SvgLoadEvent;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.Map;
import vo.a2;
import vo.b2;
import vo.c2;
import vo.d2;
import vo.e2;
import vo.f2;
import vo.i2;
import vo.j2;
import vo.k1;
import vo.k2;
import vo.l1;
import vo.l2;
import vo.m1;
import vo.m2;
import vo.n1;
import vo.n2;
import vo.o1;
import vo.o2;
import vo.p1;
import vo.p2;
import vo.q1;
import vo.q2;
import vo.r1;
import vo.r2;
import vo.s1;
import vo.t1;
import vo.u1;
import vo.v1;
import vo.w1;
import vo.x1;
import vo.y1;
import vo.z1;

/* JADX INFO: loaded from: classes6.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    static class CircleViewManager extends RenderableViewManager<b> implements vo.n0<b> {
        public static final String REACT_CLASS = "RNSVGCircle";

        CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            ((VirtualViewManager) this).mDelegate = new vo.m0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.n0
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.n0
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.n0
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.n0
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.n0
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.n0
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.n0
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.n0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.n0
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.n0
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.n0
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n0
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.n0
        @no.a(name = "cx")
        public void setCx(b bVar, Dynamic dynamic) {
            bVar.setCx(dynamic);
        }

        @Override // vo.n0
        @no.a(name = "cy")
        public void setCy(b bVar, Dynamic dynamic) {
            bVar.setCy(dynamic);
        }

        @Override // vo.n0
        @no.a(name = "r")
        public void setR(b bVar, Dynamic dynamic) {
            bVar.setR(dynamic);
        }
    }

    static class ClipPathViewManager extends GroupViewManagerAbstract<c> implements vo.p0<c> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            ((VirtualViewManager) this).mDelegate = new vo.o0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.p0
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.p0
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.p0
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.p0
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.p0
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.p0
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.p0
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.p0
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.p0
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.p0
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.p0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.p0
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.p0
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.p0
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p0
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }
    }

    static class DefsViewManager extends VirtualViewManager<f> implements vo.r0<f> {
        public static final String REACT_CLASS = "RNSVGDefs";

        DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            ((VirtualViewManager) this).mDelegate = new vo.q0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.r0
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.r0
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        @Override // vo.r0
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // vo.r0
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.r0
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.r0
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.r0
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.r0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.r0
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.r0
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // vo.r0
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }
    }

    static class EllipseViewManager extends RenderableViewManager<h> implements vo.t0<h> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            ((VirtualViewManager) this).mDelegate = new vo.s0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.t0
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.t0
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.t0
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.t0
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.t0
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.t0
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.t0
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.t0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.t0
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.t0
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.t0
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.t0
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.t0
        @no.a(name = "cx")
        public void setCx(h hVar, Dynamic dynamic) {
            hVar.setCx(dynamic);
        }

        @Override // vo.t0
        @no.a(name = "cy")
        public void setCy(h hVar, Dynamic dynamic) {
            hVar.setCy(dynamic);
        }

        @Override // vo.t0
        @no.a(name = "rx")
        public void setRx(h hVar, Dynamic dynamic) {
            hVar.setRx(dynamic);
        }

        @Override // vo.t0
        @no.a(name = "ry")
        public void setRy(h hVar, Dynamic dynamic) {
            hVar.setRy(dynamic);
        }
    }

    static class FeBlendManager extends FilterPrimitiveManager<j> implements vo.v0<j> {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            ((VirtualViewManager) this).mDelegate = new vo.u0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.v0
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.v0
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.v0
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.v0
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.v0
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.v0
        @no.a(name = "in1")
        public void setIn1(j jVar, String str) {
            jVar.setIn1(str);
        }

        @Override // vo.v0
        @no.a(name = "in2")
        public void setIn2(j jVar, String str) {
            jVar.setIn2(str);
        }

        @Override // vo.v0
        @no.a(name = "mode")
        public void setMode(j jVar, String str) {
            jVar.setMode(str);
        }
    }

    static class FeColorMatrixManager extends FilterPrimitiveManager<k> implements vo.x0<k> {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            ((VirtualViewManager) this).mDelegate = new vo.w0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.x0
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.x0
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.x0
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.x0
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.x0
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.x0
        @no.a(name = "in1")
        public void setIn1(k kVar, String str) {
            kVar.setIn1(str);
        }

        @Override // vo.x0
        @no.a(name = "type")
        public void setType(k kVar, String str) {
            kVar.setType(str);
        }

        @Override // vo.x0
        @no.a(name = "values")
        public void setValues(k kVar, ReadableArray readableArray) {
            kVar.setValues(readableArray);
        }
    }

    static class FeCompositeManager extends FilterPrimitiveManager<l> implements vo.z0<l> {
        public static final String REACT_CLASS = "RNSVGFeComposite";

        FeCompositeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeComposite);
            ((VirtualViewManager) this).mDelegate = new vo.y0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.z0
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.z0
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.z0
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.z0
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.z0
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.z0
        @no.a(name = "in1")
        public void setIn1(l lVar, String str) {
            lVar.setIn1(str);
        }

        @Override // vo.z0
        @no.a(name = "in2")
        public void setIn2(l lVar, String str) {
            lVar.setIn2(str);
        }

        @Override // vo.z0
        @no.a(name = "k1")
        public void setK1(l lVar, float f11) {
            lVar.setK1(Float.valueOf(f11));
        }

        @Override // vo.z0
        @no.a(name = "k2")
        public void setK2(l lVar, float f11) {
            lVar.setK2(Float.valueOf(f11));
        }

        @Override // vo.z0
        @no.a(name = "k3")
        public void setK3(l lVar, float f11) {
            lVar.setK3(Float.valueOf(f11));
        }

        @Override // vo.z0
        @no.a(name = "k4")
        public void setK4(l lVar, float f11) {
            lVar.setK4(Float.valueOf(f11));
        }

        @Override // vo.z0
        @no.a(name = "operator1")
        public void setOperator1(l lVar, String str) {
            lVar.setOperator(str);
        }
    }

    static class FeFloodManager extends FilterPrimitiveManager<m> implements vo.b1<m> {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            ((VirtualViewManager) this).mDelegate = new vo.a1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.b1
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.b1
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.b1
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.b1
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.b1
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.b1
        @no.a(name = "floodColor")
        public void setFloodColor(m mVar, Dynamic dynamic) {
            mVar.setFloodColor(dynamic);
        }

        @Override // vo.b1
        @no.a(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(m mVar, float f11) {
            mVar.setFloodOpacity(f11);
        }

        public void setFloodColor(m mVar, ReadableMap readableMap) {
            mVar.setFloodColor(readableMap);
        }
    }

    static class FeGaussianBlurManager extends FilterPrimitiveManager<n> implements vo.d1<n> {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            ((VirtualViewManager) this).mDelegate = new vo.c1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.d1
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.d1
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.d1
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.d1
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.d1
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.d1
        @no.a(name = "values")
        public void setEdgeMode(n nVar, String str) {
            nVar.setEdgeMode(str);
        }

        @Override // vo.d1
        @no.a(name = "in1")
        public void setIn1(n nVar, String str) {
            nVar.setIn1(str);
        }

        @Override // vo.d1
        @no.a(name = "stdDeviationX")
        public void setStdDeviationX(n nVar, float f11) {
            nVar.setStdDeviationX(f11);
        }

        @Override // vo.d1
        @no.a(name = "stdDeviationY")
        public void setStdDeviationY(n nVar, float f11) {
            nVar.setStdDeviationY(f11);
        }
    }

    static class FeMergeManager extends FilterPrimitiveManager<o> implements vo.f1<o> {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            ((VirtualViewManager) this).mDelegate = new vo.e1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.f1
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.f1
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.f1
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.f1
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.f1
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.f1
        @no.a(name = "nodes")
        public void setNodes(o oVar, ReadableArray readableArray) {
            oVar.setNodes(readableArray);
        }
    }

    static class FeOffsetManager extends FilterPrimitiveManager<p> implements vo.h1<p> {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            ((VirtualViewManager) this).mDelegate = new vo.g1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.h1
        @no.a(name = Snapshot.HEIGHT)
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((q) view, dynamic);
        }

        @Override // vo.h1
        @no.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((q) view, str);
        }

        @Override // vo.h1
        @no.a(name = Snapshot.WIDTH)
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((q) view, dynamic);
        }

        @Override // vo.h1
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((q) view, dynamic);
        }

        @Override // vo.h1
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((q) view, dynamic);
        }

        @Override // vo.h1
        @no.a(name = "dx")
        public void setDx(p pVar, Dynamic dynamic) {
            pVar.setDx(dynamic);
        }

        @Override // vo.h1
        @no.a(name = "dy")
        public void setDy(p pVar, Dynamic dynamic) {
            pVar.setDy(dynamic);
        }

        @Override // vo.h1
        @no.a(name = "in1")
        public void setIn1(p pVar, String str) {
            pVar.setIn1(str);
        }
    }

    static class FilterManager extends VirtualViewManager<x> implements vo.j1<x> {
        public static final String REACT_CLASS = "RNSVGFilter";

        FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            ((VirtualViewManager) this).mDelegate = new vo.i1(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.j1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // vo.j1
        @no.a(name = "filterUnits")
        public void setFilterUnits(x xVar, String str) {
            xVar.setFilterUnits(str);
        }

        @Override // vo.j1
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(x xVar, Dynamic dynamic) {
            xVar.setHeight(dynamic);
        }

        @Override // vo.j1
        @no.a(name = "primitiveUnits")
        public void setPrimitiveUnits(x xVar, String str) {
            xVar.setPrimitiveUnits(str);
        }

        @Override // vo.j1
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(x xVar, Dynamic dynamic) {
            xVar.setWidth(dynamic);
        }

        @Override // vo.j1
        @no.a(name = "x")
        public void setX(x xVar, Dynamic dynamic) {
            xVar.setX(dynamic);
        }

        @Override // vo.j1
        @no.a(name = "y")
        public void setY(x xVar, Dynamic dynamic) {
            xVar.setY(dynamic);
        }
    }

    static class FilterPrimitiveManager<T extends q> extends VirtualViewManager<T> {
        protected FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(T t11, Dynamic dynamic) {
            t11.setHeight(dynamic);
        }

        @no.a(name = "result")
        public void setResult(T t11, String str) {
            t11.setResult(str);
        }

        @no.a(name = Snapshot.WIDTH)
        public void setWidth(T t11, Dynamic dynamic) {
            t11.setWidth(dynamic);
        }

        @no.a(name = "x")
        public void setX(T t11, Dynamic dynamic) {
            t11.setX(dynamic);
        }

        @no.a(name = "y")
        public void setY(T t11, Dynamic dynamic) {
            t11.setY(dynamic);
        }
    }

    static class ForeignObjectManager extends GroupViewManagerAbstract<z> implements l1<z> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            ((VirtualViewManager) this).mDelegate = new k1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.l1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.l1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.l1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.l1
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.l1
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.l1
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.l1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.l1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.l1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.l1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.l1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.l1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.l1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.l1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.l1
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(z zVar, Dynamic dynamic) {
            zVar.setHeight(dynamic);
        }

        @Override // vo.l1
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(z zVar, Dynamic dynamic) {
            zVar.setWidth(dynamic);
        }

        @Override // vo.l1
        @no.a(name = "x")
        public void setX(z zVar, Dynamic dynamic) {
            zVar.setX(dynamic);
        }

        @Override // vo.l1
        @no.a(name = "y")
        public void setY(z zVar, Dynamic dynamic) {
            zVar.setY(dynamic);
        }
    }

    static class GroupViewManager extends GroupViewManagerAbstract<c0> implements n1<c0> {
        public static final String REACT_CLASS = "RNSVGGroup";

        GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            ((VirtualViewManager) this).mDelegate = new m1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.n1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.n1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.n1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.n1
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.n1
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.n1
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.n1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.n1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.n1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.n1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.n1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.n1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.n1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.n1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }
    }

    static class GroupViewManagerAbstract<U extends c0> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @no.a(name = "font")
        public void setFont(U u11, Dynamic dynamic) {
            u11.setFont(dynamic);
        }

        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public void setFontSize(U u11, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i11 = a.f45256a[dynamic.getType().ordinal()];
            if (i11 == 1) {
                javaOnlyMap.putDouble(OrcaFlavourKeys.FONT_SIZE, dynamic.asDouble());
            } else if (i11 != 2) {
                return;
            } else {
                javaOnlyMap.putString(OrcaFlavourKeys.FONT_SIZE, dynamic.asString());
            }
            u11.setFont(javaOnlyMap);
        }

        @no.a(name = "fontWeight")
        public void setFontWeight(U u11, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i11 = a.f45256a[dynamic.getType().ordinal()];
            if (i11 == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i11 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            u11.setFont(javaOnlyMap);
        }
    }

    static class ImageViewManager extends RenderableViewManager<d0> implements p1<d0> {
        public static final String REACT_CLASS = "RNSVGImage";

        ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            ((VirtualViewManager) this).mDelegate = new o1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, jn.c.d("registrationName", "onLoad"));
            return map;
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.p1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.p1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.p1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.p1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.p1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.p1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.p1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.p1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.p1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.p1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.p1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.p1
        @no.a(name = "align")
        public void setAlign(d0 d0Var, String str) {
            d0Var.setAlign(str);
        }

        @Override // vo.p1
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(d0 d0Var, Dynamic dynamic) {
            d0Var.setHeight(dynamic);
        }

        @Override // vo.p1
        @no.a(name = "meetOrSlice")
        public void setMeetOrSlice(d0 d0Var, int i11) {
            d0Var.setMeetOrSlice(i11);
        }

        @Override // vo.p1
        @no.a(customType = "ImageSource", name = "src")
        public void setSrc(d0 d0Var, ReadableMap readableMap) {
            d0Var.setSrc(readableMap);
        }

        @Override // vo.p1
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(d0 d0Var, Dynamic dynamic) {
            d0Var.setWidth(dynamic);
        }

        @Override // vo.p1
        @no.a(name = "x")
        public void setX(d0 d0Var, Dynamic dynamic) {
            d0Var.setX(dynamic);
        }

        @Override // vo.p1
        @no.a(name = "y")
        public void setY(d0 d0Var, Dynamic dynamic) {
            d0Var.setY(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager<e0> implements r1<e0> {
        public static final String REACT_CLASS = "RNSVGLine";

        LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            ((VirtualViewManager) this).mDelegate = new q1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.r1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.r1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.r1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.r1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.r1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.r1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.r1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.r1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.r1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.r1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.r1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.r1
        @no.a(name = "x1")
        public void setX1(e0 e0Var, Dynamic dynamic) {
            e0Var.setX1(dynamic);
        }

        @Override // vo.r1
        @no.a(name = "x2")
        public void setX2(e0 e0Var, Dynamic dynamic) {
            e0Var.setX2(dynamic);
        }

        @Override // vo.r1
        @no.a(name = "y1")
        public void setY1(e0 e0Var, Dynamic dynamic) {
            e0Var.setY1(dynamic);
        }

        @Override // vo.r1
        @no.a(name = "y2")
        public void setY2(e0 e0Var, Dynamic dynamic) {
            e0Var.setY2(dynamic);
        }
    }

    static class LinearGradientManager extends VirtualViewManager<f0> implements t1<f0> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            ((VirtualViewManager) this).mDelegate = new s1(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.t1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.t1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        @Override // vo.t1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // vo.t1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.t1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.t1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.t1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.t1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.t1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.t1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // vo.t1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        @Override // vo.t1
        @no.a(name = "gradient")
        public void setGradient(f0 f0Var, ReadableArray readableArray) {
            f0Var.setGradient(readableArray);
        }

        @Override // vo.t1
        @no.a(name = "gradientTransform")
        public void setGradientTransform(f0 f0Var, ReadableArray readableArray) {
            f0Var.setGradientTransform(readableArray);
        }

        @Override // vo.t1
        @no.a(name = "gradientUnits")
        public void setGradientUnits(f0 f0Var, int i11) {
            f0Var.setGradientUnits(i11);
        }

        @Override // vo.t1
        @no.a(name = "x1")
        public void setX1(f0 f0Var, Dynamic dynamic) {
            f0Var.setX1(dynamic);
        }

        @Override // vo.t1
        @no.a(name = "x2")
        public void setX2(f0 f0Var, Dynamic dynamic) {
            f0Var.setX2(dynamic);
        }

        @Override // vo.t1
        @no.a(name = "y1")
        public void setY1(f0 f0Var, Dynamic dynamic) {
            f0Var.setY1(dynamic);
        }

        @Override // vo.t1
        @no.a(name = "y2")
        public void setY2(f0 f0Var, Dynamic dynamic) {
            f0Var.setY2(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManagerAbstract<g0> implements v1<g0> {
        public static final String REACT_CLASS = "RNSVGMarker";

        MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            ((VirtualViewManager) this).mDelegate = new u1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.v1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.v1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.v1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.v1
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.v1
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.v1
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.v1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.v1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.v1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.v1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.v1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.v1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.v1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.v1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.v1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.v1
        @no.a(name = "align")
        public void setAlign(g0 g0Var, String str) {
            g0Var.setAlign(str);
        }

        @Override // vo.v1
        @no.a(name = "markerHeight")
        public void setMarkerHeight(g0 g0Var, Dynamic dynamic) {
            g0Var.setMarkerHeight(dynamic);
        }

        @Override // vo.v1
        @no.a(name = "markerUnits")
        public void setMarkerUnits(g0 g0Var, String str) {
            g0Var.setMarkerUnits(str);
        }

        @Override // vo.v1
        @no.a(name = "markerWidth")
        public void setMarkerWidth(g0 g0Var, Dynamic dynamic) {
            g0Var.setMarkerWidth(dynamic);
        }

        @Override // vo.v1
        @no.a(name = "meetOrSlice")
        public void setMeetOrSlice(g0 g0Var, int i11) {
            g0Var.setMeetOrSlice(i11);
        }

        @Override // vo.v1
        @no.a(name = "minX")
        public void setMinX(g0 g0Var, float f11) {
            g0Var.setMinX(f11);
        }

        @Override // vo.v1
        @no.a(name = "minY")
        public void setMinY(g0 g0Var, float f11) {
            g0Var.setMinY(f11);
        }

        @Override // vo.v1
        @no.a(name = "orient")
        public void setOrient(g0 g0Var, String str) {
            g0Var.setOrient(str);
        }

        @Override // vo.v1
        @no.a(name = "refX")
        public void setRefX(g0 g0Var, Dynamic dynamic) {
            g0Var.setRefX(dynamic);
        }

        @Override // vo.v1
        @no.a(name = "refY")
        public void setRefY(g0 g0Var, Dynamic dynamic) {
            g0Var.setRefY(dynamic);
        }

        @Override // vo.v1
        @no.a(name = "vbHeight")
        public void setVbHeight(g0 g0Var, float f11) {
            g0Var.setVbHeight(f11);
        }

        @Override // vo.v1
        @no.a(name = "vbWidth")
        public void setVbWidth(g0 g0Var, float f11) {
            g0Var.setVbWidth(f11);
        }
    }

    static class MaskManager extends GroupViewManagerAbstract<h0> implements x1<h0> {
        public static final String REACT_CLASS = "RNSVGMask";

        MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            ((VirtualViewManager) this).mDelegate = new w1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.x1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.x1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.x1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.x1
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.x1
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.x1
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.x1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.x1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.x1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.x1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.x1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.x1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.x1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.x1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.x1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.x1
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(h0 h0Var, Dynamic dynamic) {
            h0Var.setHeight(dynamic);
        }

        @Override // vo.x1
        @no.a(name = "maskContentUnits")
        public void setMaskContentUnits(h0 h0Var, int i11) {
            h0Var.setMaskContentUnits(i11);
        }

        @Override // vo.x1
        @no.a(name = "maskType")
        public void setMaskType(h0 h0Var, int i11) {
            h0Var.setMaskType(i11);
        }

        @Override // vo.x1
        @no.a(name = "maskUnits")
        public void setMaskUnits(h0 h0Var, int i11) {
            h0Var.setMaskUnits(i11);
        }

        @Override // vo.x1
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(h0 h0Var, Dynamic dynamic) {
            h0Var.setWidth(dynamic);
        }

        @Override // vo.x1
        @no.a(name = "x")
        public void setX(h0 h0Var, Dynamic dynamic) {
            h0Var.setX(dynamic);
        }

        @Override // vo.x1
        @no.a(name = "y")
        public void setY(h0 h0Var, Dynamic dynamic) {
            h0Var.setY(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager<k0> implements z1<k0> {
        public static final String REACT_CLASS = "RNSVGPath";

        PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            ((VirtualViewManager) this).mDelegate = new y1(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.z1
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.z1
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.z1
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.z1
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.z1
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.z1
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.z1
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.z1
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.z1
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.z1
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.z1
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.z1
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.z1
        @no.a(name = DateTokenConverter.CONVERTER_KEY)
        public void setD(k0 k0Var, String str) {
            k0Var.setD(str);
        }
    }

    static class PatternManager extends GroupViewManagerAbstract<l0> implements b2<l0> {
        public static final String REACT_CLASS = "RNSVGPattern";

        PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            ((VirtualViewManager) this).mDelegate = new a2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.b2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.b2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.b2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.b2
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.b2
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.b2
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.b2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.b2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.b2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.b2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.b2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.b2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.b2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.b2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.b2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.b2
        @no.a(name = "align")
        public void setAlign(l0 l0Var, String str) {
            l0Var.setAlign(str);
        }

        @Override // vo.b2
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(l0 l0Var, Dynamic dynamic) {
            l0Var.setHeight(dynamic);
        }

        @Override // vo.b2
        @no.a(name = "meetOrSlice")
        public void setMeetOrSlice(l0 l0Var, int i11) {
            l0Var.setMeetOrSlice(i11);
        }

        @Override // vo.b2
        @no.a(name = "minX")
        public void setMinX(l0 l0Var, float f11) {
            l0Var.setMinX(f11);
        }

        @Override // vo.b2
        @no.a(name = "minY")
        public void setMinY(l0 l0Var, float f11) {
            l0Var.setMinY(f11);
        }

        @Override // vo.b2
        @no.a(name = "patternContentUnits")
        public void setPatternContentUnits(l0 l0Var, int i11) {
            l0Var.setPatternContentUnits(i11);
        }

        @Override // vo.b2
        @no.a(name = "patternTransform")
        public void setPatternTransform(l0 l0Var, ReadableArray readableArray) {
            l0Var.setPatternTransform(readableArray);
        }

        @Override // vo.b2
        @no.a(name = "patternUnits")
        public void setPatternUnits(l0 l0Var, int i11) {
            l0Var.setPatternUnits(i11);
        }

        @Override // vo.b2
        @no.a(name = "vbHeight")
        public void setVbHeight(l0 l0Var, float f11) {
            l0Var.setVbHeight(f11);
        }

        @Override // vo.b2
        @no.a(name = "vbWidth")
        public void setVbWidth(l0 l0Var, float f11) {
            l0Var.setVbWidth(f11);
        }

        @Override // vo.b2
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(l0 l0Var, Dynamic dynamic) {
            l0Var.setWidth(dynamic);
        }

        @Override // vo.b2
        @no.a(name = "x")
        public void setX(l0 l0Var, Dynamic dynamic) {
            l0Var.setX(dynamic);
        }

        @Override // vo.b2
        @no.a(name = "y")
        public void setY(l0 l0Var, Dynamic dynamic) {
            l0Var.setY(dynamic);
        }
    }

    static class RadialGradientManager extends VirtualViewManager<q0> implements d2<q0> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            ((VirtualViewManager) this).mDelegate = new c2(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.d2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.d2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        @Override // vo.d2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // vo.d2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.d2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.d2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.d2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.d2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.d2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.d2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // vo.d2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        @Override // vo.d2
        @no.a(name = "cx")
        public void setCx(q0 q0Var, Dynamic dynamic) {
            q0Var.setCx(dynamic);
        }

        @Override // vo.d2
        @no.a(name = "cy")
        public void setCy(q0 q0Var, Dynamic dynamic) {
            q0Var.setCy(dynamic);
        }

        @Override // vo.d2
        @no.a(name = "fx")
        public void setFx(q0 q0Var, Dynamic dynamic) {
            q0Var.setFx(dynamic);
        }

        @Override // vo.d2
        @no.a(name = "fy")
        public void setFy(q0 q0Var, Dynamic dynamic) {
            q0Var.setFy(dynamic);
        }

        @Override // vo.d2
        @no.a(name = "gradient")
        public void setGradient(q0 q0Var, ReadableArray readableArray) {
            q0Var.setGradient(readableArray);
        }

        @Override // vo.d2
        @no.a(name = "gradientTransform")
        public void setGradientTransform(q0 q0Var, ReadableArray readableArray) {
            q0Var.setGradientTransform(readableArray);
        }

        @Override // vo.d2
        @no.a(name = "gradientUnits")
        public void setGradientUnits(q0 q0Var, int i11) {
            q0Var.setGradientUnits(i11);
        }

        @Override // vo.d2
        @no.a(name = "rx")
        public void setRx(q0 q0Var, Dynamic dynamic) {
            q0Var.setRx(dynamic);
        }

        @Override // vo.d2
        @no.a(name = "ry")
        public void setRy(q0 q0Var, Dynamic dynamic) {
            q0Var.setRy(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager<r0> implements f2<r0> {
        public static final String REACT_CLASS = "RNSVGRect";

        RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            ((VirtualViewManager) this).mDelegate = new e2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.f2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.f2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.f2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.f2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.f2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.f2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.f2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.f2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.f2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.f2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.f2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.f2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.f2
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(r0 r0Var, Dynamic dynamic) {
            r0Var.setHeight(dynamic);
        }

        @Override // vo.f2
        @no.a(name = "rx")
        public void setRx(r0 r0Var, Dynamic dynamic) {
            r0Var.setRx(dynamic);
        }

        @Override // vo.f2
        @no.a(name = "ry")
        public void setRy(r0 r0Var, Dynamic dynamic) {
            r0Var.setRy(dynamic);
        }

        @Override // vo.f2
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(r0 r0Var, Dynamic dynamic) {
            r0Var.setWidth(dynamic);
        }

        @Override // vo.f2
        @no.a(name = "x")
        public void setX(r0 r0Var, Dynamic dynamic) {
            r0Var.setX(dynamic);
        }

        @Override // vo.f2
        @no.a(name = "y")
        public void setY(r0 r0Var, Dynamic dynamic) {
            r0Var.setY(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManagerAbstract<t0> implements j2<t0> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            ((VirtualViewManager) this).mDelegate = new i2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.j2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.j2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.j2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.j2
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((c0) view, dynamic);
        }

        @Override // vo.j2
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.j2
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.j2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.j2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.j2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.j2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.j2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.j2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.j2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.j2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.j2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.j2
        @no.a(name = "align")
        public void setAlign(t0 t0Var, String str) {
            t0Var.setAlign(str);
        }

        @Override // vo.j2
        @no.a(name = "meetOrSlice")
        public void setMeetOrSlice(t0 t0Var, int i11) {
            t0Var.setMeetOrSlice(i11);
        }

        @Override // vo.j2
        @no.a(name = "minX")
        public void setMinX(t0 t0Var, float f11) {
            t0Var.setMinX(f11);
        }

        @Override // vo.j2
        @no.a(name = "minY")
        public void setMinY(t0 t0Var, float f11) {
            t0Var.setMinY(f11);
        }

        @Override // vo.j2
        @no.a(name = "vbHeight")
        public void setVbHeight(t0 t0Var, float f11) {
            t0Var.setVbHeight(f11);
        }

        @Override // vo.j2
        @no.a(name = "vbWidth")
        public void setVbWidth(t0 t0Var, float f11) {
            t0Var.setVbWidth(f11);
        }
    }

    static class TSpanViewManager extends TextViewManagerAbstract<u0> implements l2<u0> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            ((VirtualViewManager) this).mDelegate = new k2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.l2
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((h1) view, str);
        }

        @Override // vo.l2
        @no.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.l2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.l2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // vo.l2
        @no.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.l2
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((h1) view, str);
        }

        @Override // vo.l2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.l2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.l2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.l2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.l2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.l2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.l2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.l2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        @Override // vo.l2
        @no.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.l2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.l2
        @no.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((h1) view, dynamic);
        }

        @Override // vo.l2
        @no.a(name = "content")
        public void setContent(u0 u0Var, String str) {
            u0Var.setContent(str);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new k2(this);
        }
    }

    static class TextPathViewManager extends TextViewManagerAbstract<v0> implements p2<v0> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            ((VirtualViewManager) this).mDelegate = new o2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.p2
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((h1) view, str);
        }

        @Override // vo.p2
        @no.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.p2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.p2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // vo.p2
        @no.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.p2
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((h1) view, str);
        }

        @Override // vo.p2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.p2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.p2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.p2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.p2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.p2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.p2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.p2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        @Override // vo.p2
        @no.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((h1) view, dynamic);
        }

        @no.a(name = "midLine")
        public void setSharp(v0 v0Var, String str) {
            v0Var.setSharp(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.p2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.p2
        @no.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((h1) view, dynamic);
        }

        @Override // vo.p2
        @no.a(name = "href")
        public void setHref(v0 v0Var, String str) {
            v0Var.setHref(str);
        }

        @Override // vo.p2
        public void setMidLine(v0 v0Var, String str) {
            v0Var.setSharp(str);
        }

        @Override // vo.p2
        @no.a(name = "side")
        public void setSide(v0 v0Var, String str) {
            v0Var.setSide(str);
        }

        @Override // vo.p2
        @no.a(name = "spacing")
        public void setSpacing(v0 v0Var, String str) {
            v0Var.setSpacing(str);
        }

        @Override // vo.p2
        @no.a(name = "startOffset")
        public void setStartOffset(v0 v0Var, Dynamic dynamic) {
            v0Var.setStartOffset(dynamic);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new o2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @no.a(name = "method")
        public void setMethod(v0 v0Var, String str) {
            v0Var.setMethod(str);
        }
    }

    static class TextViewManagerAbstract<K extends h1> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public void setAlignmentBaseline(K k11, String str) {
            k11.setMethod(str);
        }

        @no.a(name = "baselineShift")
        public void setBaselineShift(K k11, Dynamic dynamic) {
            k11.setBaselineShift(dynamic);
        }

        @no.a(name = "dx")
        public void setDx(K k11, Dynamic dynamic) {
            k11.setDeltaX(dynamic);
        }

        @no.a(name = "dy")
        public void setDy(K k11, Dynamic dynamic) {
            k11.setDeltaY(dynamic);
        }

        @no.a(name = "inlineSize")
        public void setInlineSize(K k11, Dynamic dynamic) {
            k11.setInlineSize(dynamic);
        }

        @no.a(name = "lengthAdjust")
        public void setLengthAdjust(K k11, String str) {
            k11.setLengthAdjust(str);
        }

        @no.a(name = "alignmentBaseline")
        public void setMethod(K k11, String str) {
            k11.setMethod(str);
        }

        @no.a(name = "rotate")
        public void setRotate(K k11, Dynamic dynamic) {
            k11.setRotate(dynamic);
        }

        @no.a(name = "textLength")
        public void setTextLength(K k11, Dynamic dynamic) {
            k11.setTextLength(dynamic);
        }

        @no.a(name = "verticalAlign")
        public void setVerticalAlign(K k11, Dynamic dynamic) {
            k11.setVerticalAlign(dynamic);
        }

        @no.a(name = "x")
        public void setX(K k11, Dynamic dynamic) {
            k11.setPositionX(dynamic);
        }

        @no.a(name = "y")
        public void setY(K k11, Dynamic dynamic) {
            k11.setPositionY(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @no.a(name = "font")
        public void setFont(K k11, Dynamic dynamic) {
            k11.setFont(dynamic);
        }
    }

    static class UseViewManager extends RenderableViewManager<i1> implements r2<i1> {
        public static final String REACT_CLASS = "RNSVGUse";

        UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            ((VirtualViewManager) this).mDelegate = new q2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.r2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.r2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.r2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.r2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.r2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.r2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.r2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.r2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.r2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.r2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.r2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.r2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.r2
        @no.a(name = Snapshot.HEIGHT)
        public void setHeight(i1 i1Var, Dynamic dynamic) {
            i1Var.setHeight(dynamic);
        }

        @Override // vo.r2
        @no.a(name = "href")
        public void setHref(i1 i1Var, String str) {
            i1Var.setHref(str);
        }

        @Override // vo.r2
        @no.a(name = Snapshot.WIDTH)
        public void setWidth(i1 i1Var, Dynamic dynamic) {
            i1Var.setWidth(dynamic);
        }

        @Override // vo.r2
        @no.a(name = "x")
        public void setX(i1 i1Var, Dynamic dynamic) {
            i1Var.setX(dynamic);
        }

        @Override // vo.r2
        @no.a(name = "y")
        public void setY(i1 i1Var, Dynamic dynamic) {
            i1Var.setY(dynamic);
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45256a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f45256a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45256a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        map.put(SvgOnLayoutEvent.EVENT_NAME, jn.c.d("registrationName", "onSvgLayout"));
        return map;
    }

    @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(customType = "Color", name = "color")
    public void setColor(T t11, Integer num) {
        t11.setCurrentColor(num);
    }

    @no.a(name = "fill")
    public void setFill(T t11, Dynamic dynamic) {
        t11.setFill(dynamic);
    }

    @no.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t11, float f11) {
        t11.setFillOpacity(f11);
    }

    @no.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t11, int i11) {
        t11.setFillRule(i11);
    }

    @no.a(name = "filter")
    public void setFilter(T t11, String str) {
        t11.setFilter(str);
    }

    @no.a(name = "propList")
    public void setPropList(T t11, ReadableArray readableArray) {
        t11.setPropList(readableArray);
    }

    @no.a(name = "stroke")
    public void setStroke(T t11, Dynamic dynamic) {
        t11.setStroke(dynamic);
    }

    @no.a(name = "strokeDasharray")
    public void setStrokeDasharray(T t11, Dynamic dynamic) {
        t11.setStrokeDasharray(dynamic);
    }

    @no.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t11, float f11) {
        t11.setStrokeDashoffset(f11);
    }

    @no.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t11, int i11) {
        t11.setStrokeLinecap(i11);
    }

    @no.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t11, int i11) {
        t11.setStrokeLinejoin(i11);
    }

    @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t11, float f11) {
        t11.setStrokeMiterlimit(f11);
    }

    @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t11, float f11) {
        t11.setStrokeOpacity(f11);
    }

    @no.a(name = "strokeWidth")
    public void setStrokeWidth(T t11, Dynamic dynamic) {
        t11.setStrokeWidth(dynamic);
    }

    @no.a(name = "vectorEffect")
    public void setVectorEffect(T t11, int i11) {
        t11.setVectorEffect(i11);
    }

    static class TextViewManager extends TextViewManagerAbstract<h1> implements n2<h1> {
        public static final String REACT_CLASS = "RNSVGText";

        TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            ((VirtualViewManager) this).mDelegate = new m2(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // vo.n2
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((h1) view, str);
        }

        @Override // vo.n2
        @no.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((h1) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // vo.n2
        @no.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i11) {
            super.setClipRule((VirtualView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // vo.n2
        @no.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // vo.n2
        @no.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((h1) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f11) {
            super.setFillOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i11) {
            super.setFillRule((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // vo.n2
        @no.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h1) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = OrcaFlavourKeys.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((c0) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((c0) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((h1) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((h1) view, str);
        }

        @Override // vo.n2
        @no.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // vo.n2
        @no.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // vo.n2
        @no.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // vo.n2
        @no.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // vo.n2
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // vo.n2
        @no.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @no.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f11) {
            super.setOpacity((VirtualView) view, f11);
        }

        @Override // vo.n2
        @no.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // vo.n2
        @no.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z11) {
            super.setResponsible((VirtualView) view, z11);
        }

        @Override // vo.n2
        @no.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f11) {
            super.setStrokeDashoffset((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i11) {
            super.setStrokeLinecap((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i11) {
            super.setStrokeLinejoin((RenderableView) view, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f11) {
            super.setStrokeMiterlimit((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f11) {
            super.setStrokeOpacity((RenderableView) view, f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((h1) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vo.n2
        @no.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i11) {
            super.setVectorEffect((RenderableView) view, i11);
        }

        @Override // vo.n2
        @no.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((h1) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((h1) view, dynamic);
        }

        @Override // vo.n2
        @no.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((h1) view, dynamic);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new m2(this);
        }
    }

    public void setFill(T t11, ReadableMap readableMap) {
        t11.setFill(readableMap);
    }

    public void setStroke(T t11, ReadableMap readableMap) {
        t11.setStroke(readableMap);
    }
}
