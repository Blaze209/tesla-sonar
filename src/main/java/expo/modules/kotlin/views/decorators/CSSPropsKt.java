package expo.modules.kotlin.views.decorators;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.a;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.rncompatibility.RNCompatibleStaticWrapperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import so.BoxShadow;
import so.d;
import so.f;
import so.n;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\b\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0004\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\b\u0010\n\u001aM\u0010\f\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0004\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\t\u001a#\u0010\f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\f\u0010\n\u001aM\u0010\u000f\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\b\u0004\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u001a#\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\n\u001aG\u0010\u0012\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0012\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\n\u001aG\u0010\u0014\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\n\u001aK\u0010\u0017\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022 \b\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a#\u0010\u0017\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\n\u001a#\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "T", "Lexpo/modules/kotlin/views/ViewDefinitionBuilder;", "Lkotlin/Function3;", "Lso/n;", "", "Ljn0/h0;", "body", "UseBorderColorProps", "(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;Lwn0/q;)V", "(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V", "", "UseBorderWidthProps", "Lso/d;", "Lcom/facebook/react/uimanager/o;", "UseBorderRadiusProps", "Lkotlin/Function2;", "Lso/f;", "UseBorderStyleProp", "(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;Lwn0/p;)V", "UseBackgroundProp", "", "Lso/g;", "UseBoxShadowProp", "UseCSSProps", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CSSPropsKt {
    public static final /* synthetic */ <T extends View> void UseBackgroundProp(ViewDefinitionBuilder<T> viewDefinitionBuilder, final p<? super T, ? super Integer, h0> body) {
        s.k(viewDefinitionBuilder, "<this>");
        s.k(body, "body");
        s.p();
        p<T, Integer, h0> pVar = new p<T, Integer, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBackgroundProp.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object obj, Integer num) {
                invoke((View) obj, num);
                return h0.f84049a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)V */
            public final void invoke(View view, Integer num) {
                s.k(view, "view");
                body.invoke(view, num);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(o0.b(Integer.class), true, CSSPropsKt$UseBackgroundProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("backgroundColor", new ConcreteViewProp("backgroundColor", anyType, pVar));
    }

    public static final /* synthetic */ <T extends View> void UseBorderColorProps(ViewDefinitionBuilder<T> viewDefinitionBuilder, final q<? super T, ? super n, ? super Integer, h0> body) {
        s.k(viewDefinitionBuilder, "<this>");
        s.k(body, "body");
        Pair[] pairArr = {x.a("borderColor", 8), x.a("borderLeftColor", 0), x.a("borderRightColor", 2), x.a("borderTopColor", 1), x.a("borderBottomColor", 3), x.a("borderStartColor", 4), x.a("borderEndColor", 5), x.a("borderBlockColor", 9), x.a("borderBlockEndColor", 10), x.a("borderBlockStartColor", 11)};
        s.p();
        final q<T, Integer, Integer, h0> qVar = new q<T, Integer, Integer, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderColorProps.1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(Object obj, Integer num, Integer num2) {
                invoke((View) obj, num.intValue(), num2);
                return h0.f84049a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;ILjava/lang/Integer;)V */
            public final void invoke(View view, int i11, Integer num) {
                s.k(view, "view");
                body.invoke(view, n.INSTANCE.a(i11), num);
            }
        };
        for (int i11 = 0; i11 < 10; i11++) {
            Pair pair = pairArr[i11];
            String str = (String) pair.a();
            final Object objB = pair.b();
            s.p();
            p<T, Integer, h0> pVar = new p<T, Integer, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object obj, Integer num) {
                    invoke((View) obj, (Object) num);
                    return h0.f84049a;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Integer;)V */
                public final void invoke(View view, Object obj) {
                    s.k(view, "view");
                    qVar.invoke(view, objB, obj);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Integer.class), true, CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, pVar));
        }
    }

    public static final /* synthetic */ <T extends View> void UseBorderRadiusProps(ViewDefinitionBuilder<T> viewDefinitionBuilder, final q<? super T, ? super d, ? super LengthPercentage, h0> body) {
        s.k(viewDefinitionBuilder, "<this>");
        s.k(body, "body");
        String[] strArr = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"};
        s.p();
        final q<T, Integer, Float, h0> qVar = new q<T, Integer, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderRadiusProps.1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(Object obj, Integer num, Float f11) {
                invoke((View) obj, num.intValue(), f11);
                return h0.f84049a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;ILjava/lang/Float;)V */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void invoke(View view, int i11, Float f11) {
                s.k(view, "view");
                body.invoke((T) view, d.getEntries().get(i11), f11 != null ? new LengthPercentage(f11.floatValue(), com.facebook.react.uimanager.p.POINT) : null);
            }
        };
        int i11 = 0;
        final int i12 = 0;
        while (i11 < 13) {
            String str = strArr[i11];
            int i13 = i12 + 1;
            s.p();
            p<T, Float, h0> pVar = new p<T, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderRadiusProps$$inlined$PropGroup$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object obj, Float f11) {
                    invoke((View) obj, (Object) f11);
                    return h0.f84049a;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Float;)V */
                public final void invoke(View view, Object obj) {
                    s.k(view, "view");
                    qVar.invoke(view, Integer.valueOf(i12), obj);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Float.class), true, CSSPropsKt$UseBorderRadiusProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, pVar));
            i11++;
            i12 = i13;
        }
    }

    public static final /* synthetic */ <T extends View> void UseBorderStyleProp(ViewDefinitionBuilder<T> viewDefinitionBuilder, final p<? super T, ? super f, h0> body) {
        s.k(viewDefinitionBuilder, "<this>");
        s.k(body, "body");
        s.p();
        p<T, String, h0> pVar = new p<T, String, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderStyleProp.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object obj, String str) {
                invoke((View) obj, str);
                return h0.f84049a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/String;)V */
            public final void invoke(View view, String str) {
                s.k(view, "view");
                body.invoke(view, str != null ? f.INSTANCE.a(str) : null);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(o0.b(String.class), true, CSSPropsKt$UseBorderStyleProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("borderStyle", new ConcreteViewProp("borderStyle", anyType, pVar));
    }

    public static final /* synthetic */ <T extends View> void UseBorderWidthProps(ViewDefinitionBuilder<T> viewDefinitionBuilder, final q<? super T, ? super n, ? super Float, h0> body) {
        s.k(viewDefinitionBuilder, "<this>");
        s.k(body, "body");
        String[] strArr = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"};
        s.p();
        final q<T, Integer, Float, h0> qVar = new q<T, Integer, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBorderWidthProps.1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(Object obj, Integer num, Float f11) {
                invoke((View) obj, num.intValue(), f11);
                return h0.f84049a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;ILjava/lang/Float;)V */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void invoke(View view, int i11, Float f11) {
                s.k(view, "view");
                body.invoke((T) view, n.getEntries().get(i11), f11);
            }
        };
        int i11 = 0;
        final int i12 = 0;
        while (i11 < 7) {
            String str = strArr[i11];
            int i13 = i12 + 1;
            s.p();
            p<T, Float, h0> pVar = new p<T, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderWidthProps$$inlined$PropGroup$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object obj, Float f11) {
                    invoke((View) obj, (Object) f11);
                    return h0.f84049a;
                }

                /* JADX WARN: Incorrect types in method signature: (TT;Ljava/lang/Float;)V */
                public final void invoke(View view, Object obj) {
                    s.k(view, "view");
                    qVar.invoke(view, Integer.valueOf(i12), obj);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Float.class), true, CSSPropsKt$UseBorderWidthProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, pVar));
            i11++;
            i12 = i13;
        }
    }

    public static final /* synthetic */ <T extends View> void UseBoxShadowProp(ViewDefinitionBuilder<T> viewDefinitionBuilder, final p<? super T, ? super List<BoxShadow>, h0> body) {
        s.k(viewDefinitionBuilder, "<this>");
        s.k(body, "body");
        s.p();
        p<T, ReadableArray, h0> pVar = new p<T, ReadableArray, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt.UseBoxShadowProp.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object obj, ReadableArray readableArray) {
                invoke((View) obj, readableArray);
                return h0.f84049a;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;Lcom/facebook/react/bridge/ReadableArray;)V */
            public final void invoke(View view, ReadableArray readableArray) {
                s.k(view, "view");
                if (readableArray == null) {
                    body.invoke(view, v.m());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int size = readableArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReadableMap map = readableArray.getMap(i11);
                    Context context = view.getContext();
                    s.j(context, "getContext(...)");
                    BoxShadow boxShadow = RNCompatibleStaticWrapperKt.parseBoxShadow(map, context);
                    if (boxShadow != null) {
                        arrayList.add(boxShadow);
                    }
                }
                body.invoke(view, arrayList);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ReadableArray.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(o0.b(ReadableArray.class), true, CSSPropsKt$UseBoxShadowProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("boxShadow", new ConcreteViewProp("boxShadow", anyType, pVar));
    }

    public static final <T extends View> void UseCSSProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        s.k(viewDefinitionBuilder, "<this>");
        UseBorderColorProps(viewDefinitionBuilder);
        UseBorderWidthProps(viewDefinitionBuilder);
        UseBorderRadiusProps(viewDefinitionBuilder);
        UseBorderStyleProp(viewDefinitionBuilder);
        UseBackgroundProp(viewDefinitionBuilder);
        UseBoxShadowProp(viewDefinitionBuilder);
    }

    private static final <T extends View> void UseBackgroundProp(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        p<View, Integer, h0> pVar = new p<View, Integer, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBackgroundProp$$inlined$UseBackgroundProp$1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(View view, Integer num) {
                invoke2(view, num);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View view, Integer num) {
                s.k(view, "view");
                a.o(view, num);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(o0.b(Integer.class), true, CSSPropsKt$UseBackgroundProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("backgroundColor", new ConcreteViewProp("backgroundColor", anyType, pVar));
    }

    private static final <T extends View> void UseBorderStyleProp(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        p<View, String, h0> pVar = new p<View, String, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderStyleProp$$inlined$UseBorderStyleProp$1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(View view, String str) {
                invoke2(view, str);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View view, String str) {
                s.k(view, "view");
                a.s(view, str != null ? f.INSTANCE.a(str) : null);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(o0.b(String.class), true, CSSPropsKt$UseBorderStyleProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("borderStyle", new ConcreteViewProp("borderStyle", anyType, pVar));
    }

    private static final <T extends View> void UseBoxShadowProp(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        p<View, ReadableArray, h0> pVar = new p<View, ReadableArray, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBoxShadowProp$$inlined$UseBoxShadowProp$1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(View view, ReadableArray readableArray) {
                invoke2(view, readableArray);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View view, ReadableArray readableArray) {
                s.k(view, "view");
                if (readableArray == null) {
                    a.v(view, v.m());
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int size = readableArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ReadableMap map = readableArray.getMap(i11);
                    Context context = view.getContext();
                    s.j(context, "getContext(...)");
                    BoxShadow boxShadow = RNCompatibleStaticWrapperKt.parseBoxShadow(map, context);
                    if (boxShadow != null) {
                        arrayList.add(boxShadow);
                    }
                }
                a.v(view, arrayList);
            }
        };
        Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(ReadableArray.class), Boolean.TRUE));
        if (anyType == null) {
            anyType = new AnyType(new LazyKType(o0.b(ReadableArray.class), true, CSSPropsKt$UseBoxShadowProp$$inlined$Prop$1.INSTANCE), null);
        }
        props.put("boxShadow", new ConcreteViewProp("boxShadow", anyType, pVar));
    }

    private static final <T extends View> void UseBorderRadiusProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        String[] strArr = {Snapshot.BORDER_RADIUS, Snapshot.BORDER_TOP_LEFT_RADIUS, Snapshot.BORDER_TOP_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"};
        final q<View, Integer, Float, h0> qVar = new q<View, Integer, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderRadiusProps$$inlined$UseBorderRadiusProps$1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(View view, Integer num, Float f11) {
                invoke(view, num.intValue(), f11);
                return h0.f84049a;
            }

            public final void invoke(View view, int i11, Float f11) {
                s.k(view, "view");
                a.r(view, d.getEntries().get(i11), f11 != null ? new LengthPercentage(f11.floatValue(), com.facebook.react.uimanager.p.POINT) : null);
            }
        };
        int i11 = 0;
        final int i12 = 0;
        while (i11 < 13) {
            String str = strArr[i11];
            int i13 = i12 + 1;
            p<View, Float, h0> pVar = new p<View, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderRadiusProps$$inlined$UseBorderRadiusProps$2
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(View view, Float f11) {
                    invoke(view, f11);
                    return h0.f84049a;
                }

                public final void invoke(View view, Float f11) {
                    s.k(view, "view");
                    qVar.invoke(view, Integer.valueOf(i12), f11);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Float.class), true, CSSPropsKt$UseBorderRadiusProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, pVar));
            i11++;
            i12 = i13;
        }
    }

    private static final <T extends View> void UseBorderWidthProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        String[] strArr = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"};
        final q<View, Integer, Float, h0> qVar = new q<View, Integer, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderWidthProps$$inlined$UseBorderWidthProps$1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(View view, Integer num, Float f11) {
                invoke(view, num.intValue(), f11);
                return h0.f84049a;
            }

            public final void invoke(View view, int i11, Float f11) {
                s.k(view, "view");
                a.t(view, n.getEntries().get(i11), Float.valueOf(f11 != null ? f11.floatValue() : Float.NaN));
            }
        };
        int i11 = 0;
        final int i12 = 0;
        while (i11 < 7) {
            String str = strArr[i11];
            int i13 = i12 + 1;
            p<View, Float, h0> pVar = new p<View, Float, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderWidthProps$$inlined$UseBorderWidthProps$2
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(View view, Float f11) {
                    invoke(view, f11);
                    return h0.f84049a;
                }

                public final void invoke(View view, Float f11) {
                    s.k(view, "view");
                    qVar.invoke(view, Integer.valueOf(i12), f11);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Float.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Float.class), true, CSSPropsKt$UseBorderWidthProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, pVar));
            i11++;
            i12 = i13;
        }
    }

    private static final <T extends View> void UseBorderColorProps(ViewDefinitionBuilder<T> viewDefinitionBuilder) {
        Pair[] pairArr = {x.a("borderColor", 8), x.a("borderLeftColor", 0), x.a("borderRightColor", 2), x.a("borderTopColor", 1), x.a("borderBottomColor", 3), x.a("borderStartColor", 4), x.a("borderEndColor", 5), x.a("borderBlockColor", 9), x.a("borderBlockEndColor", 10), x.a("borderBlockStartColor", 11)};
        final q<View, Integer, Integer, h0> qVar = new q<View, Integer, Integer, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderColorProps$$inlined$UseBorderColorProps$1
            @Override // wn0.q
            public /* bridge */ /* synthetic */ h0 invoke(View view, Integer num, Integer num2) {
                invoke(view, num.intValue(), num2);
                return h0.f84049a;
            }

            public final void invoke(View view, int i11, Integer num) {
                s.k(view, "view");
                a.q(view, n.INSTANCE.a(i11), num);
            }
        };
        for (int i11 = 0; i11 < 10; i11++) {
            Pair pair = pairArr[i11];
            String str = (String) pair.a();
            final Object objB = pair.b();
            p<View, Integer, h0> pVar = new p<View, Integer, h0>() { // from class: expo.modules.kotlin.views.decorators.CSSPropsKt$UseBorderColorProps$$inlined$UseBorderColorProps$2
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(View view, Integer num) {
                    invoke(view, num);
                    return h0.f84049a;
                }

                public final void invoke(View view, Integer num) {
                    s.k(view, "view");
                    qVar.invoke(view, objB, num);
                }
            };
            Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), Boolean.TRUE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Integer.class), true, CSSPropsKt$UseBorderColorProps$$inlined$PropGroup$2.INSTANCE), null);
            }
            props.put(str, new ConcreteViewProp(str, anyType, pVar));
        }
    }
}
