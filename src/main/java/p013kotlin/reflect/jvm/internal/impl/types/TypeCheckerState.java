package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import jn0.h0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class TypeCheckerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f88915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeSystemContext f88917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractTypePreparator f88918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractTypeRefiner f88919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f88920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f88921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayDeque<SimpleTypeMarker> f88922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Set<SimpleTypeMarker> f88923j;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f88924a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public void fork(a<Boolean> block) {
                s.k(block, "block");
                if (this.f88924a) {
                    return;
                }
                this.f88924a = block.invoke().booleanValue();
            }

            public final boolean getResult() {
                return this.f88924a;
            }
        }

        void fork(a<Boolean> aVar);
    }

    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        public static final class LowerIfFlexible extends SupertypesPolicy {
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible();

            private LowerIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType */
            public SimpleTypeMarker mo502transformType(TypeCheckerState state, KotlinTypeMarker type) {
                s.k(state, "state");
                s.k(type, "type");
                return state.getTypeSystemContext().lowerBoundIfFlexible(type);
            }
        }

        public static final class None extends SupertypesPolicy {
            public static final None INSTANCE = new None();

            private None() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ SimpleTypeMarker mo502transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (SimpleTypeMarker) transformType(typeCheckerState, kotlinTypeMarker);
            }

            public Void transformType(TypeCheckerState state, KotlinTypeMarker type) {
                s.k(state, "state");
                s.k(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class UpperIfFlexible extends SupertypesPolicy {
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible();

            private UpperIfFlexible() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType */
            public SimpleTypeMarker mo502transformType(TypeCheckerState state, KotlinTypeMarker type) {
                s.k(state, "state");
                s.k(type, "type");
                return state.getTypeSystemContext().upperBoundIfFlexible(type);
            }
        }

        public /* synthetic */ SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: transformType */
        public abstract SimpleTypeMarker mo502transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);

        private SupertypesPolicy() {
        }
    }

    public TypeCheckerState(boolean z11, boolean z12, boolean z13, TypeSystemContext typeSystemContext, AbstractTypePreparator kotlinTypePreparator, AbstractTypeRefiner kotlinTypeRefiner) {
        s.k(typeSystemContext, "typeSystemContext");
        s.k(kotlinTypePreparator, "kotlinTypePreparator");
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f88914a = z11;
        this.f88915b = z12;
        this.f88916c = z13;
        this.f88917d = typeSystemContext;
        this.f88918e = kotlinTypePreparator;
        this.f88919f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean addSubtypeConstraint$default(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return typeCheckerState.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z11);
    }

    public Boolean addSubtypeConstraint(KotlinTypeMarker subType, KotlinTypeMarker superType, boolean z11) {
        s.k(subType, "subType");
        s.k(superType, "superType");
        return null;
    }

    public final void clear() {
        ArrayDeque<SimpleTypeMarker> arrayDeque = this.f88922i;
        s.h(arrayDeque);
        arrayDeque.clear();
        Set<SimpleTypeMarker> set = this.f88923j;
        s.h(set);
        set.clear();
        this.f88921h = false;
    }

    public boolean customIsSubtypeOf(KotlinTypeMarker subType, KotlinTypeMarker superType) {
        s.k(subType, "subType");
        s.k(superType, "superType");
        return true;
    }

    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(SimpleTypeMarker subType, CapturedTypeMarker superType) {
        s.k(subType, "subType");
        s.k(superType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<SimpleTypeMarker> getSupertypesDeque() {
        return this.f88922i;
    }

    public final Set<SimpleTypeMarker> getSupertypesSet() {
        return this.f88923j;
    }

    public final TypeSystemContext getTypeSystemContext() {
        return this.f88917d;
    }

    public final void initialize() {
        this.f88921h = true;
        if (this.f88922i == null) {
            this.f88922i = new ArrayDeque<>(4);
        }
        if (this.f88923j == null) {
            this.f88923j = SmartSet.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(KotlinTypeMarker type) {
        s.k(type, "type");
        return this.f88916c && this.f88917d.isTypeVariableType(type);
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.f88914a;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.f88915b;
    }

    public final KotlinTypeMarker prepareType(KotlinTypeMarker type) {
        s.k(type, "type");
        return this.f88918e.prepareType(type);
    }

    public final KotlinTypeMarker refineType(KotlinTypeMarker type) {
        s.k(type, "type");
        return this.f88919f.refineType(type);
    }

    public boolean runForkingPoint(l<? super ForkPointContext, h0> block) {
        s.k(block, "block");
        ForkPointContext.Default r11 = new ForkPointContext.Default();
        block.invoke(r11);
        return r11.getResult();
    }
}
