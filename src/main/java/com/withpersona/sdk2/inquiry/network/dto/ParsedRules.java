package com.withpersona.sdk2.inquiry.network.dto;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "", "<init>", "()V", "ComplexRules", "PrimitiveRule", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class ParsedRules {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$ComplexRules;", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "expression", "", "", "", "<init>", "(Ljava/util/Map;)V", "getExpression", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComplexRules extends ParsedRules {
        private final Map<String, Object> expression;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComplexRules(Map<String, ? extends Object> expression) {
            super(null);
            s.k(expression, "expression");
            this.expression = expression;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComplexRules copy$default(ComplexRules complexRules, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = complexRules.expression;
            }
            return complexRules.copy(map);
        }

        public final Map<String, Object> component1() {
            return this.expression;
        }

        public final ComplexRules copy(Map<String, ? extends Object> expression) {
            s.k(expression, "expression");
            return new ComplexRules(expression);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComplexRules) && s.f(this.expression, ((ComplexRules) other).expression);
        }

        public final Map<String, Object> getExpression() {
            return this.expression;
        }

        public int hashCode() {
            return this.expression.hashCode();
        }

        public String toString() {
            return "ComplexRules(expression=" + this.expression + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules$PrimitiveRule;", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PrimitiveRule extends ParsedRules {
        private final Object value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimitiveRule(Object value) {
            super(null);
            s.k(value, "value");
            this.value = value;
        }

        public static /* synthetic */ PrimitiveRule copy$default(PrimitiveRule primitiveRule, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = primitiveRule.value;
            }
            return primitiveRule.copy(obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final PrimitiveRule copy(Object value) {
            s.k(value, "value");
            return new PrimitiveRule(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrimitiveRule) && s.f(this.value, ((PrimitiveRule) other).value);
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "PrimitiveRule(value=" + this.value + ")";
        }
    }

    public /* synthetic */ ParsedRules(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedRules() {
    }
}
