package expo.modules.kotlin.classcomponent;

import co0.d;
import co0.h;
import co0.q;
import do0.c;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$get$1$1;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.traits.Trait;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.r;
import wn0.t;
import wn0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0004\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001fJ?\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u001a\b\u0004\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\"JM\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012 \b\u0004\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010%J[\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012&\b\u0004\u0010\u0019\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000'H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010(Ji\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012,\b\u0004\u0010\u0019\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010+Jw\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u000122\b\u0004\u0010\u0019\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010.J\u0085\u0001\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u000128\b\u0004\u0010\u0019\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u000000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u00101J\u0093\u0001\u0010\u001b\u001a\u00020\u001a\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u0001\"\u0006\b\b\u00102\u0018\u00012>\b\u0004\u0010\u0019\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u00104J?\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0006\b\u0001\u00105\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR%\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00130H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;", "", "SharedObjectType", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "Lexpo/modules/kotlin/AppContext;", "appContext", "", "name", "Lco0/d;", "ownerClass", "Lexpo/modules/kotlin/types/AnyType;", "ownerType", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;Lco0/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "buildClass", "()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "Lexpo/modules/kotlin/traits/Trait;", "trait", "Ljn0/h0;", "UseTrait", "(Lexpo/modules/kotlin/traits/Trait;)V", "Lkotlin/Function0;", "body", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Constructor", "(Lwn0/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P0", "Lkotlin/Function1;", "(Lwn0/l;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P1", "Lkotlin/Function2;", "(Lwn0/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P2", "Lkotlin/Function3;", "(Lwn0/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Lwn0/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Lwn0/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Lwn0/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Lwn0/u;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Lwn0/v;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "T", "Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "Property", "(Ljava/lang/String;Lwn0/l;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "(Ljava/lang/String;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "Lexpo/modules/kotlin/AppContext;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lco0/d;", "Lexpo/modules/kotlin/types/AnyType;", "getOwnerType", "()Lexpo/modules/kotlin/types/AnyType;", "constructor", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getConstructor", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "setConstructor", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "", "traits", "Ljava/util/List;", "getTraits", "()Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClassComponentBuilder<SharedObjectType> extends ObjectDefinitionBuilder {
    private final AppContext appContext;
    private SyncFunctionComponent constructor;
    private final String name;
    private final d<SharedObjectType> ownerClass;
    private final AnyType ownerType;
    private final List<Trait<? super SharedObjectType>> traits;

    /* JADX INFO: renamed from: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class C46301 extends p implements wn0.p<SharedObject, String, h0> {
        public static final C46301 INSTANCE = new C46301();

        C46301() {
            super(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(SharedObject sharedObject, String str) {
            invoke2(sharedObject, str);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SharedObject p11, String p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            p11.onStartListeningToEvent(p12);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends p implements wn0.p<SharedObject, String, h0> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(SharedObject sharedObject, String str) {
            invoke2(sharedObject, str);
            return h0.f84049a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SharedObject p11, String p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            p11.onStopListeningToEvent(p12);
        }
    }

    public /* synthetic */ ClassComponentBuilder(AppContext appContext, String str, d dVar, AnyType anyType, TypeConverterProvider typeConverterProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(appContext, str, dVar, anyType, (i11 & 16) != 0 ? null : typeConverterProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 buildClass$lambda$2$lambda$0(h hVar, Object[] objArr) {
        s.k(objArr, "<destruct>");
        ((wn0.p) hVar).invoke(objArr[0], objArr[1]);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 buildClass$lambda$6(Object[] it) {
        s.k(it, "it");
        return h0.f84049a;
    }

    public final SyncFunctionComponent Constructor(final wn0.a<? extends SharedObjectType> body) {
        s.k(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.1
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final void UseTrait(Trait<? super SharedObjectType> trait) {
        s.k(trait, "trait");
        this.traits.add(trait);
    }

    public final ClassDefinitionData buildClass() {
        boolean zF = s.f(this.ownerClass, o0.b(h0.class));
        boolean z11 = !zF && c.k(this.ownerClass, o0.b(SharedObject.class));
        boolean z12 = !zF && c.k(this.ownerClass, o0.b(SharedRef.class));
        Object next = null;
        if (getEventsDefinition() != null && z11) {
            for (Pair pair : v.p(x.a("__expo_onStartListeningToEvent", C46301.INSTANCE), x.a("__expo_onStopListeningToEvent", AnonymousClass2.INSTANCE))) {
                String str = (String) pair.a();
                final h hVar = (h) pair.b();
                AnyType anyType = this.ownerType;
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(String.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$buildClass$lambda$2$$inlined$toAnyType$default$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(String.class);
                        }
                    }), null);
                }
                AnyType[] anyTypeArr = {anyType, anyType2};
                ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
                ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(h0.class));
                if (returnType == null) {
                    returnType = new ReturnType(o0.b(h0.class));
                    returnTypeProvider.getTypes().put(o0.b(h0.class), returnType);
                }
                SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(str, anyTypeArr, returnType, new l() { // from class: expo.modules.kotlin.classcomponent.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return ClassComponentBuilder.buildClass$lambda$2$lambda$0(hVar, (Object[]) obj);
                    }
                });
                syncFunctionComponent.enumerable(false);
                getSyncFunctions().put(str, syncFunctionComponent);
            }
        }
        ObjectDefinitionData objectDefinitionDataBuildObject = buildObject();
        List<Trait<? super SharedObjectType>> list = this.traits;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Trait) it.next()).export(this.appContext));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = ((ObjectDefinitionData) next).plus((ObjectDefinitionData) it2.next());
            }
        }
        ObjectDefinitionData objectDefinitionDataPlus = objectDefinitionDataBuildObject.plus((ObjectDefinitionData) next);
        ConcatIterator<AnyFunction> functions = objectDefinitionDataPlus.getFunctions();
        while (functions.hasNext()) {
            AnyFunction next2 = functions.next();
            next2.setOwnerType(this.ownerType.getKType());
            next2.setCanTakeOwner(true);
        }
        if (!zF && this.constructor == null && !z12) {
            throw new IllegalArgumentException("constructor cannot be null");
        }
        SyncFunctionComponent syncFunctionComponent2 = this.constructor;
        if (syncFunctionComponent2 == null) {
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(o0.b(h0.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(o0.b(h0.class));
                returnTypeProvider2.getTypes().put(o0.b(h0.class), returnType2);
            }
            syncFunctionComponent2 = new SyncFunctionComponent("constructor", anyTypeArr2, returnType2, new l() { // from class: expo.modules.kotlin.classcomponent.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return ClassComponentBuilder.buildClass$lambda$6((Object[]) obj);
                }
            });
        }
        syncFunctionComponent2.setCanTakeOwner(true);
        syncFunctionComponent2.setOwnerType(this.ownerType.getKType());
        return new ClassDefinitionData(this.name, syncFunctionComponent2, objectDefinitionDataPlus, z12);
    }

    public final SyncFunctionComponent getConstructor() {
        return this.constructor;
    }

    public final String getName() {
        return this.name;
    }

    public final AnyType getOwnerType() {
        return this.ownerType;
    }

    public final List<Trait<? super SharedObjectType>> getTraits() {
        return this.traits;
    }

    public final void setConstructor(SyncFunctionComponent syncFunctionComponent) {
        this.constructor = syncFunctionComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassComponentBuilder(AppContext appContext, String name, d<SharedObjectType> ownerClass, AnyType ownerType, TypeConverterProvider typeConverterProvider) {
        super(typeConverterProvider);
        s.k(appContext, "appContext");
        s.k(name, "name");
        s.k(ownerClass, "ownerClass");
        s.k(ownerType, "ownerType");
        this.appContext = appContext;
        this.name = name;
        this.ownerClass = ownerClass;
        this.ownerType = ownerType;
        this.traits = new ArrayList();
    }

    public final /* synthetic */ <T> PropertyComponentBuilderWithThis<SharedObjectType> Property(String name, l<? super SharedObjectType, ? extends T> body) {
        s.k(name, "name");
        s.k(body, "body");
        PropertyComponentBuilderWithThis<SharedObjectType> propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis<>(getOwnerType().getKType(), name);
        AnyType[] anyTypeArr = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "T");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(4, "T");
            returnType = new ReturnType(o0.b(Object.class));
            Map<d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(4, "T");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilderWithThis$get$1$1(body));
        syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
        getProperties().put(name, propertyComponentBuilderWithThis);
        return propertyComponentBuilderWithThis;
    }

    public final /* synthetic */ <P0> SyncFunctionComponent Constructor(final l<? super P0, ? extends SharedObjectType> body) {
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$1 classComponentBuilder$Constructor$$inlined$toArgsArray$default$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$1), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.3
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    @Override // expo.modules.kotlin.objects.ObjectDefinitionBuilder
    public PropertyComponentBuilderWithThis<SharedObjectType> Property(String name) {
        s.k(name, "name");
        PropertyComponentBuilderWithThis<SharedObjectType> propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis<>(this.ownerType.getKType(), name);
        getProperties().put(name, propertyComponentBuilderWithThis);
        return propertyComponentBuilderWithThis;
    }

    public final /* synthetic */ <P0, P1> SyncFunctionComponent Constructor(final wn0.p<? super P0, ? super P1, ? extends SharedObjectType> body) {
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$2 classComponentBuilder$Constructor$$inlined$toArgsArray$default$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$2), converters);
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$3 classComponentBuilder$Constructor$$inlined$toArgsArray$default$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.5
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2> SyncFunctionComponent Constructor(final wn0.q<? super P0, ? super P1, ? super P2, ? extends SharedObjectType> body) {
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$4 classComponentBuilder$Constructor$$inlined$toArgsArray$default$4 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$4), converters);
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$5 classComponentBuilder$Constructor$$inlined$toArgsArray$default$5 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$5), converters);
        }
        s.q(4, "P2");
        d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$6 classComponentBuilder$Constructor$$inlined$toArgsArray$default$6 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$6), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.7
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3> SyncFunctionComponent Constructor(final r<? super P0, ? super P1, ? super P2, ? super P3, ? extends SharedObjectType> body) {
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$7 classComponentBuilder$Constructor$$inlined$toArgsArray$default$7 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$7), converters);
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$8 classComponentBuilder$Constructor$$inlined$toArgsArray$default$8 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$8), converters);
        }
        s.q(4, "P2");
        d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$9 classComponentBuilder$Constructor$$inlined$toArgsArray$default$9 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$9), converters);
        }
        s.q(4, "P3");
        d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$10 classComponentBuilder$Constructor$$inlined$toArgsArray$default$10 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$10), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.9
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4> SyncFunctionComponent Constructor(final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends SharedObjectType> body) {
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$11 classComponentBuilder$Constructor$$inlined$toArgsArray$default$11 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$11), converters);
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$12 classComponentBuilder$Constructor$$inlined$toArgsArray$default$12 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$12), converters);
        }
        s.q(4, "P2");
        d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$13 classComponentBuilder$Constructor$$inlined$toArgsArray$default$13 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$13), converters);
        }
        s.q(4, "P3");
        d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$14 classComponentBuilder$Constructor$$inlined$toArgsArray$default$14 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$14), converters);
        }
        s.q(4, "P4");
        d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$15 classComponentBuilder$Constructor$$inlined$toArgsArray$default$15 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$15), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.11
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5> SyncFunctionComponent Constructor(final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends SharedObjectType> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        AnyType anyType6;
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$16 classComponentBuilder$Constructor$$inlined$toArgsArray$default$16 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$16), converters);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$17 classComponentBuilder$Constructor$$inlined$toArgsArray$default$17 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$17), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$18 classComponentBuilder$Constructor$$inlined$toArgsArray$default$18 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$18), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$19 classComponentBuilder$Constructor$$inlined$toArgsArray$default$19 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$19), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$20 classComponentBuilder$Constructor$$inlined$toArgsArray$default$20 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$20), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$21 classComponentBuilder$Constructor$$inlined$toArgsArray$default$21 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$21), converters);
        } else {
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.13
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Constructor(final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends SharedObjectType> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        AnyType anyType7;
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$22 classComponentBuilder$Constructor$$inlined$toArgsArray$default$22 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$22), converters);
        } else {
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(r13);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$23 classComponentBuilder$Constructor$$inlined$toArgsArray$default$23 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$23), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        d dVarB5 = o0.b(r13);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$24 classComponentBuilder$Constructor$$inlined$toArgsArray$default$24 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$24), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        d dVarB7 = o0.b(r13);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$25 classComponentBuilder$Constructor$$inlined$toArgsArray$default$25 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$25), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        d dVarB9 = o0.b(r13);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$26 classComponentBuilder$Constructor$$inlined$toArgsArray$default$26 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$26), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        d dVarB11 = o0.b(r13);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$27 classComponentBuilder$Constructor$$inlined$toArgsArray$default$27 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            d dVarB12 = o0.b(r13);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$27), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        d dVarB13 = o0.b(r13);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$28 classComponentBuilder$Constructor$$inlined$toArgsArray$default$28 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            d dVarB14 = o0.b(r13);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$28), converters);
        } else {
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(r13));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(r13));
            returnTypeProvider.getTypes().put(o0.b(r13), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.15
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Constructor(final wn0.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends SharedObjectType> body) {
        Class cls;
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        int i24;
        AnyType anyType7;
        AnyType anyType8;
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        s.q(4, "P7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$29 classComponentBuilder$Constructor$$inlined$toArgsArray$default$29 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$29), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType9;
        }
        s.q(4, "P1");
        d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$30 classComponentBuilder$Constructor$$inlined$toArgsArray$default$30 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$30), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType10;
        }
        s.q(i12, "P2");
        d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$31 classComponentBuilder$Constructor$$inlined$toArgsArray$default$31 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$31), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType11;
        }
        s.q(i14, "P3");
        d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$32 classComponentBuilder$Constructor$$inlined$toArgsArray$default$32 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$32), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType12;
        }
        s.q(i16, "P4");
        d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$33 classComponentBuilder$Constructor$$inlined$toArgsArray$default$33 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$33), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType13;
        }
        s.q(i18, "P5");
        d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$34 classComponentBuilder$Constructor$$inlined$toArgsArray$default$34 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$34), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType14;
        }
        s.q(i21, "P6");
        d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$35 classComponentBuilder$Constructor$$inlined$toArgsArray$default$35 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            d dVarB14 = o0.b(cls);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$35), converters);
        } else {
            i23 = 4;
            i24 = 3;
            anyType7 = anyType15;
        }
        s.q(i23, "P7");
        d dVarB15 = o0.b(cls);
        s.q(i24, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            s.p();
            ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$36 classComponentBuilder$Constructor$$inlined$toArgsArray$default$36 = new wn0.a<q>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder$Constructor$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            s.q(4, "P7");
            d dVarB16 = o0.b(cls);
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, classComponentBuilder$Constructor$$inlined$toArgsArray$default$36), converters);
        } else {
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(cls));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(cls));
            returnTypeProvider.getTypes().put(o0.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("constructor", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.classcomponent.ClassComponentBuilder.Constructor.17
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], (P7) objArr[7]);
            }
        });
        setConstructor(syncFunctionComponent);
        return syncFunctionComponent;
    }
}
