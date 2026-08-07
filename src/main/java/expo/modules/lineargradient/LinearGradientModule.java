package expo.modules.lineargradient;

import co0.d;
import co0.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import eb.a;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.views.AnyViewProp;
import expo.modules.kotlin.views.ConcreteViewProp;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/lineargradient/LinearGradientModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-linear-gradient_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinearGradientModule extends Module {
    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() throws Throwable {
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            try {
                ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
                moduleDefinitionBuilder.Name("ExpoLinearGradient");
                ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(o0.b(LinearGradientView.class), new LazyKType(o0.b(LinearGradientView.class), false, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$$inlined$View$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(LinearGradientView.class);
                    }
                }, 2, null), moduleDefinitionBuilder.getConverters());
                CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
                LinearGradientModule$definition$1$1$1 linearGradientModule$definition$1$1$1 = new p<LinearGradientView, int[], h0>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$1$1$1
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(LinearGradientView linearGradientView, int[] iArr) {
                        invoke2(linearGradientView, iArr);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LinearGradientView view, int[] colors) {
                        s.k(view, "view");
                        s.k(colors, "colors");
                        view.setColors(colors);
                    }
                };
                Map<String, AnyViewProp> props = viewDefinitionBuilder.getProps();
                AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
                AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(o0.b(int[].class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(int[].class), false, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$lambda$0$$inlined$Prop$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(int[].class);
                        }
                    }), null);
                }
                props.put("colors", new ConcreteViewProp("colors", anyType, linearGradientModule$definition$1$1$1));
                LinearGradientModule$definition$1$1$2 linearGradientModule$definition$1$1$2 = new p<LinearGradientView, float[], h0>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$1$1$2
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(LinearGradientView linearGradientView, float[] fArr) {
                        invoke2(linearGradientView, fArr);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LinearGradientView view, float[] fArr) {
                        s.k(view, "view");
                        if (fArr != null) {
                            view.setLocations(fArr);
                        }
                    }
                };
                Map<String, AnyViewProp> props2 = viewDefinitionBuilder.getProps();
                d dVarB = o0.b(float[].class);
                Boolean bool = Boolean.TRUE;
                AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(float[].class), true, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$lambda$0$$inlined$Prop$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.g(float[].class);
                        }
                    }), null);
                }
                props2.put("locations", new ConcreteViewProp("locations", anyType2, linearGradientModule$definition$1$1$2));
                LinearGradientModule$definition$1$1$3 linearGradientModule$definition$1$1$3 = new p<LinearGradientView, Pair<? extends Float, ? extends Float>, h0>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$1$1$3
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(LinearGradientView linearGradientView, Pair<? extends Float, ? extends Float> pair) {
                        invoke2(linearGradientView, (Pair<Float, Float>) pair);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LinearGradientView view, Pair<Float, Float> pair) {
                        s.k(view, "view");
                        view.setStartPosition(pair != null ? pair.e().floatValue() : 0.5f, pair != null ? pair.f().floatValue() : BitmapDescriptorFactory.HUE_RED);
                    }
                };
                Map<String, AnyViewProp> props3 = viewDefinitionBuilder.getProps();
                AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Pair.class), bool));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(o0.b(Pair.class), true, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$lambda$0$$inlined$Prop$3
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            co0.s.Companion companion = co0.s.INSTANCE;
                            Class cls = Float.TYPE;
                            return o0.i(Pair.class, companion.d(o0.o(cls)), companion.d(o0.o(cls)));
                        }
                    }), null);
                }
                props3.put("startPoint", new ConcreteViewProp("startPoint", anyType3, linearGradientModule$definition$1$1$3));
                LinearGradientModule$definition$1$1$4 linearGradientModule$definition$1$1$4 = new p<LinearGradientView, Pair<? extends Float, ? extends Float>, h0>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$1$1$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(LinearGradientView linearGradientView, Pair<? extends Float, ? extends Float> pair) {
                        invoke2(linearGradientView, (Pair<Float, Float>) pair);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LinearGradientView view, Pair<Float, Float> pair) {
                        s.k(view, "view");
                        view.setEndPosition(pair != null ? pair.e().floatValue() : 0.5f, pair != null ? pair.f().floatValue() : 1.0f);
                    }
                };
                Map<String, AnyViewProp> props4 = viewDefinitionBuilder.getProps();
                AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Pair.class), bool));
                if (anyType4 == null) {
                    anyType4 = new AnyType(new LazyKType(o0.b(Pair.class), true, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$lambda$0$$inlined$Prop$4
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            co0.s.Companion companion = co0.s.INSTANCE;
                            Class cls = Float.TYPE;
                            return o0.i(Pair.class, companion.d(o0.o(cls)), companion.d(o0.o(cls)));
                        }
                    }), null);
                }
                props4.put("endPoint", new ConcreteViewProp("endPoint", anyType4, linearGradientModule$definition$1$1$4));
                LinearGradientModule$definition$1$1$5 linearGradientModule$definition$1$1$5 = new p<LinearGradientView, float[], h0>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$1$1$5
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(LinearGradientView linearGradientView, float[] fArr) {
                        invoke2(linearGradientView, fArr);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LinearGradientView view, float[] fArr) {
                        s.k(view, "view");
                        if (fArr == null) {
                            float[] fArr2 = new float[8];
                            for (int i11 = 0; i11 < 8; i11++) {
                                fArr2[i11] = 0.0f;
                            }
                            fArr = fArr2;
                        }
                        view.setBorderRadii(fArr);
                    }
                };
                Map<String, AnyViewProp> props5 = viewDefinitionBuilder.getProps();
                AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(float[].class), bool));
                if (anyType5 == null) {
                    anyType5 = new AnyType(new LazyKType(o0.b(float[].class), true, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$lambda$0$$inlined$Prop$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.g(float[].class);
                        }
                    }), null);
                }
                props5.put("borderRadii", new ConcreteViewProp("borderRadii", anyType5, linearGradientModule$definition$1$1$5));
                LinearGradientModule$definition$1$1$6 linearGradientModule$definition$1$1$6 = new p<LinearGradientView, Boolean, h0>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$1$1$6
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(LinearGradientView linearGradientView, Boolean bool2) {
                        invoke2(linearGradientView, bool2);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LinearGradientView view, Boolean bool2) {
                        s.k(view, "view");
                        view.setDither(bool2 != null ? bool2.booleanValue() : true);
                    }
                };
                Map<String, AnyViewProp> props6 = viewDefinitionBuilder.getProps();
                AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(r0), bool));
                if (anyType6 == null) {
                    anyType6 = new AnyType(new LazyKType(o0.b(Boolean.class), true, new wn0.a<q>() { // from class: expo.modules.lineargradient.LinearGradientModule$definition$lambda$1$lambda$0$$inlined$Prop$6
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.g(Boolean.class);
                        }
                    }), null);
                }
                props6.put("dither", new ConcreteViewProp("dither", anyType6, linearGradientModule$definition$1$1$6));
                moduleDefinitionBuilder.registerViewDefinition(viewDefinitionBuilder.build());
                ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
                a.f();
                return moduleDefinitionDataBuildModule;
            } catch (Throwable th2) {
                th = th2;
                a.f();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
