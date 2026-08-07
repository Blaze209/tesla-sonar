package p013kotlin.reflect.jvm.internal.impl.metadata;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p013kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import p013kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import p013kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p013kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import p013kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import p013kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

/* JADX INFO: loaded from: classes9.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Annotation f87643h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f87644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f87645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Argument> f87647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f87648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87649g;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new a();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final Argument f87650h;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ByteString f87651b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f87652c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87653d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Value f87654e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private byte f87655f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f87656g;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f87657b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f87658c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Value f87659d = Value.getDefaultInstance();

                private Builder() {
                    d();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder c() {
                    return new Builder();
                }

                private void d() {
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i11 = this.f87657b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    argument.f87653d = this.f87658c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    argument.f87654e = this.f87659d;
                    argument.f87652c = i12;
                    return argument;
                }

                public Value getValue() {
                    return this.f87659d;
                }

                public boolean hasNameId() {
                    return (this.f87657b & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.f87657b & 2) == 2;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                public Builder mergeValue(Value value) {
                    if ((this.f87657b & 2) != 2 || this.f87659d == Value.getDefaultInstance()) {
                        this.f87659d = value;
                    } else {
                        this.f87659d = Value.newBuilder(this.f87659d).mergeFrom(value).buildPartial();
                    }
                    this.f87657b |= 2;
                    return this;
                }

                public Builder setNameId(int i11) {
                    this.f87657b |= 1;
                    this.f87658c = i11;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.a(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo499clone() {
                    return c().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f87651b));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            Argument argument2 = (Argument) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new a();

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                private static final Value f87660q;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final ByteString f87661b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f87662c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Type f87663d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private long f87664e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private float f87665f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private double f87666g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f87667h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private int f87668i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f87669j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private Annotation f87670k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private List<Value> f87671l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f87672m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f87673n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                private byte f87674o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                private int f87675p;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private int f87676b;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private long f87678d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private float f87679e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private double f87680f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private int f87681g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private int f87682h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    private int f87683i;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    private int f87686l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    private int f87687m;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private Type f87677c = Type.BYTE;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private Annotation f87684j = Annotation.getDefaultInstance();

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    private List<Value> f87685k = Collections.EMPTY_LIST;

                    private Builder() {
                        e();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static Builder c() {
                        return new Builder();
                    }

                    private void d() {
                        if ((this.f87676b & 256) != 256) {
                            this.f87685k = new ArrayList(this.f87685k);
                            this.f87676b |= 256;
                        }
                    }

                    private void e() {
                    }

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i11 = this.f87676b;
                        int i12 = (i11 & 1) != 1 ? 0 : 1;
                        value.f87663d = this.f87677c;
                        if ((i11 & 2) == 2) {
                            i12 |= 2;
                        }
                        value.f87664e = this.f87678d;
                        if ((i11 & 4) == 4) {
                            i12 |= 4;
                        }
                        value.f87665f = this.f87679e;
                        if ((i11 & 8) == 8) {
                            i12 |= 8;
                        }
                        value.f87666g = this.f87680f;
                        if ((i11 & 16) == 16) {
                            i12 |= 16;
                        }
                        value.f87667h = this.f87681g;
                        if ((i11 & 32) == 32) {
                            i12 |= 32;
                        }
                        value.f87668i = this.f87682h;
                        if ((i11 & 64) == 64) {
                            i12 |= 64;
                        }
                        value.f87669j = this.f87683i;
                        if ((i11 & 128) == 128) {
                            i12 |= 128;
                        }
                        value.f87670k = this.f87684j;
                        if ((this.f87676b & 256) == 256) {
                            this.f87685k = Collections.unmodifiableList(this.f87685k);
                            this.f87676b &= -257;
                        }
                        value.f87671l = this.f87685k;
                        if ((i11 & 512) == 512) {
                            i12 |= 256;
                        }
                        value.f87672m = this.f87686l;
                        if ((i11 & 1024) == 1024) {
                            i12 |= 512;
                        }
                        value.f87673n = this.f87687m;
                        value.f87662c = i12;
                        return value;
                    }

                    public Annotation getAnnotation() {
                        return this.f87684j;
                    }

                    public Value getArrayElement(int i11) {
                        return this.f87685k.get(i11);
                    }

                    public int getArrayElementCount() {
                        return this.f87685k.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.f87676b & 128) == 128;
                    }

                    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i11 = 0; i11 < getArrayElementCount(); i11++) {
                            if (!getArrayElement(i11).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.f87676b & 128) != 128 || this.f87684j == Annotation.getDefaultInstance()) {
                            this.f87684j = annotation;
                        } else {
                            this.f87684j = Annotation.newBuilder(this.f87684j).mergeFrom(annotation).buildPartial();
                        }
                        this.f87676b |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i11) {
                        this.f87676b |= 512;
                        this.f87686l = i11;
                        return this;
                    }

                    public Builder setClassId(int i11) {
                        this.f87676b |= 32;
                        this.f87682h = i11;
                        return this;
                    }

                    public Builder setDoubleValue(double d11) {
                        this.f87676b |= 8;
                        this.f87680f = d11;
                        return this;
                    }

                    public Builder setEnumValueId(int i11) {
                        this.f87676b |= 64;
                        this.f87683i = i11;
                        return this;
                    }

                    public Builder setFlags(int i11) {
                        this.f87676b |= 1024;
                        this.f87687m = i11;
                        return this;
                    }

                    public Builder setFloatValue(float f11) {
                        this.f87676b |= 4;
                        this.f87679e = f11;
                        return this;
                    }

                    public Builder setIntValue(long j11) {
                        this.f87676b |= 2;
                        this.f87678d = j11;
                        return this;
                    }

                    public Builder setStringValue(int i11) {
                        this.f87676b |= 16;
                        this.f87681g = i11;
                        return this;
                    }

                    public Builder setType(Type type) {
                        type.getClass();
                        this.f87676b |= 1;
                        this.f87677c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw AbstractMessageLite.Builder.a(valueBuildPartial);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo499clone() {
                        return c().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.f87671l.isEmpty()) {
                            if (this.f87685k.isEmpty()) {
                                this.f87685k = value.f87671l;
                                this.f87676b &= -257;
                            } else {
                                d();
                                this.f87685k.addAll(value.f87671l);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.f87661b));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value partialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (partialFrom != null) {
                                    mergeFrom(partialFrom);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e11) {
                                Value value2 = (Value) e11.getUnfinishedMessage();
                                try {
                                    throw e11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static Internal.EnumLiteMap<Type> internalValueMap = new a();
                    private final int value;

                    static class a implements Internal.EnumLiteMap<Type> {
                        a() {
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public Type findValueByNumber(int i11) {
                            return Type.valueOf(i11);
                        }
                    }

                    Type(int i11, int i12) {
                        this.value = i12;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i11) {
                        switch (i11) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                static class a extends AbstractParser<Value> {
                    a() {
                    }

                    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                static {
                    Value value = new Value(true);
                    f87660q = value;
                    value.v();
                }

                public static Value getDefaultInstance() {
                    return f87660q;
                }

                public static Builder newBuilder() {
                    return Builder.c();
                }

                private void v() {
                    this.f87663d = Type.BYTE;
                    this.f87664e = 0L;
                    this.f87665f = BitmapDescriptorFactory.HUE_RED;
                    this.f87666g = 0.0d;
                    this.f87667h = 0;
                    this.f87668i = 0;
                    this.f87669j = 0;
                    this.f87670k = Annotation.getDefaultInstance();
                    this.f87671l = Collections.EMPTY_LIST;
                    this.f87672m = 0;
                    this.f87673n = 0;
                }

                public Annotation getAnnotation() {
                    return this.f87670k;
                }

                public int getArrayDimensionCount() {
                    return this.f87672m;
                }

                public Value getArrayElement(int i11) {
                    return this.f87671l.get(i11);
                }

                public int getArrayElementCount() {
                    return this.f87671l.size();
                }

                public List<Value> getArrayElementList() {
                    return this.f87671l;
                }

                public int getClassId() {
                    return this.f87668i;
                }

                public double getDoubleValue() {
                    return this.f87666g;
                }

                public int getEnumValueId() {
                    return this.f87669j;
                }

                public int getFlags() {
                    return this.f87673n;
                }

                public float getFloatValue() {
                    return this.f87665f;
                }

                public long getIntValue() {
                    return this.f87664e;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i11 = this.f87675p;
                    if (i11 != -1) {
                        return i11;
                    }
                    int iComputeEnumSize = (this.f87662c & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f87663d.getNumber()) : 0;
                    if ((this.f87662c & 2) == 2) {
                        iComputeEnumSize += CodedOutputStream.computeSInt64Size(2, this.f87664e);
                    }
                    if ((this.f87662c & 4) == 4) {
                        iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.f87665f);
                    }
                    if ((this.f87662c & 8) == 8) {
                        iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.f87666g);
                    }
                    if ((this.f87662c & 16) == 16) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(5, this.f87667h);
                    }
                    if ((this.f87662c & 32) == 32) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.f87668i);
                    }
                    if ((this.f87662c & 64) == 64) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(7, this.f87669j);
                    }
                    if ((this.f87662c & 128) == 128) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(8, this.f87670k);
                    }
                    for (int i12 = 0; i12 < this.f87671l.size(); i12++) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(9, this.f87671l.get(i12));
                    }
                    if ((this.f87662c & 512) == 512) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(10, this.f87673n);
                    }
                    if ((this.f87662c & 256) == 256) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(11, this.f87672m);
                    }
                    int size = iComputeEnumSize + this.f87661b.size();
                    this.f87675p = size;
                    return size;
                }

                public int getStringValue() {
                    return this.f87667h;
                }

                public Type getType() {
                    return this.f87663d;
                }

                public boolean hasAnnotation() {
                    return (this.f87662c & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.f87662c & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.f87662c & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.f87662c & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.f87662c & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.f87662c & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.f87662c & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.f87662c & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.f87662c & 16) == 16;
                }

                public boolean hasType() {
                    return (this.f87662c & 1) == 1;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b11 = this.f87674o;
                    if (b11 == 1) {
                        return true;
                    }
                    if (b11 == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.f87674o = (byte) 0;
                        return false;
                    }
                    for (int i11 = 0; i11 < getArrayElementCount(); i11++) {
                        if (!getArrayElement(i11).isInitialized()) {
                            this.f87674o = (byte) 0;
                            return false;
                        }
                    }
                    this.f87674o = (byte) 1;
                    return true;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    getSerializedSize();
                    if ((this.f87662c & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.f87663d.getNumber());
                    }
                    if ((this.f87662c & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.f87664e);
                    }
                    if ((this.f87662c & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.f87665f);
                    }
                    if ((this.f87662c & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.f87666g);
                    }
                    if ((this.f87662c & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.f87667h);
                    }
                    if ((this.f87662c & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.f87668i);
                    }
                    if ((this.f87662c & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.f87669j);
                    }
                    if ((this.f87662c & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.f87670k);
                    }
                    for (int i11 = 0; i11 < this.f87671l.size(); i11++) {
                        codedOutputStream.writeMessage(9, this.f87671l.get(i11));
                    }
                    if ((this.f87662c & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.f87673n);
                    }
                    if ((this.f87662c & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.f87672m);
                    }
                    codedOutputStream.writeRawBytes(this.f87661b);
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return f87660q;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.f87674o = (byte) -1;
                    this.f87675p = -1;
                    this.f87661b = builder.getUnknownFields();
                }

                private Value(boolean z11) {
                    this.f87674o = (byte) -1;
                    this.f87675p = -1;
                    this.f87661b = ByteString.EMPTY;
                }

                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    this.f87674o = (byte) -1;
                    this.f87675p = -1;
                    v();
                    ByteString.Output outputNewOutput = ByteString.newOutput();
                    CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z11 = false;
                    char c11 = 0;
                    while (!z11) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        int i11 = codedInputStream.readEnum();
                                        Type typeValueOf = Type.valueOf(i11);
                                        if (typeValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.f87662c |= 1;
                                            this.f87663d = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.f87662c |= 2;
                                        this.f87664e = codedInputStream.readSInt64();
                                        continue;
                                    case 29:
                                        this.f87662c |= 4;
                                        this.f87665f = codedInputStream.readFloat();
                                        continue;
                                    case 33:
                                        this.f87662c |= 8;
                                        this.f87666g = codedInputStream.readDouble();
                                        continue;
                                    case 40:
                                        this.f87662c |= 16;
                                        this.f87667h = codedInputStream.readInt32();
                                        continue;
                                    case 48:
                                        this.f87662c |= 32;
                                        this.f87668i = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.f87662c |= 64;
                                        this.f87669j = codedInputStream.readInt32();
                                        continue;
                                    case 66:
                                        Builder builder = (this.f87662c & 128) == 128 ? this.f87670k.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                        this.f87670k = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.f87670k = builder.buildPartial();
                                        }
                                        this.f87662c |= 128;
                                        continue;
                                    case 74:
                                        if ((c11 & 256) != 256) {
                                            this.f87671l = new ArrayList();
                                            c11 = 256;
                                        }
                                        this.f87671l.add((Value) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.f87662c |= 512;
                                        this.f87673n = codedInputStream.readInt32();
                                        continue;
                                    case 88:
                                        this.f87662c |= 256;
                                        this.f87672m = codedInputStream.readInt32();
                                        continue;
                                    default:
                                        if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                            break;
                                        }
                                        break;
                                }
                                z11 = true;
                            } catch (Throwable th2) {
                                if ((c11 & 256) == 256) {
                                    this.f87671l = Collections.unmodifiableList(this.f87671l);
                                }
                                try {
                                    codedOutputStreamNewInstance.flush();
                                } catch (IOException unused) {
                                } finally {
                                    this.f87661b = outputNewOutput.toByteString();
                                }
                                e();
                                throw th2;
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    }
                    if ((c11 & 256) == 256) {
                        this.f87671l = Collections.unmodifiableList(this.f87671l);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.f87661b = outputNewOutput.toByteString();
                    }
                    e();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static class a extends AbstractParser<Argument> {
                a() {
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument(true);
                f87650h = argument;
                argument.l();
            }

            public static Argument getDefaultInstance() {
                return f87650h;
            }

            private void l() {
                this.f87653d = 0;
                this.f87654e = Value.getDefaultInstance();
            }

            public static Builder newBuilder() {
                return Builder.c();
            }

            public int getNameId() {
                return this.f87653d;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.f87656g;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeInt32Size = (this.f87652c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87653d) : 0;
                if ((this.f87652c & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f87654e);
                }
                int size = iComputeInt32Size + this.f87651b.size();
                this.f87656g = size;
                return size;
            }

            public Value getValue() {
                return this.f87654e;
            }

            public boolean hasNameId() {
                return (this.f87652c & 1) == 1;
            }

            public boolean hasValue() {
                return (this.f87652c & 2) == 2;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.f87655f;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.f87655f = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.f87655f = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.f87655f = (byte) 1;
                    return true;
                }
                this.f87655f = (byte) 0;
                return false;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f87652c & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f87653d);
                }
                if ((this.f87652c & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.f87654e);
                }
                codedOutputStream.writeRawBytes(this.f87651b);
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f87650h;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f87655f = (byte) -1;
                this.f87656g = -1;
                this.f87651b = builder.getUnknownFields();
            }

            private Argument(boolean z11) {
                this.f87655f = (byte) -1;
                this.f87656g = -1;
                this.f87651b = ByteString.EMPTY;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f87655f = (byte) -1;
                this.f87656g = -1;
                l();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f87652c |= 1;
                                    this.f87653d = codedInputStream.readInt32();
                                } else if (tag != 18) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Value.Builder builder = (this.f87652c & 2) == 2 ? this.f87654e.toBuilder() : null;
                                    Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                    this.f87654e = value;
                                    if (builder != null) {
                                        builder.mergeFrom(value);
                                        this.f87654e = builder.buildPartial();
                                    }
                                    this.f87652c |= 2;
                                }
                            }
                            z11 = true;
                        } catch (Throwable th2) {
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.f87651b = outputNewOutput.toByteString();
                            }
                            e();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f87651b = outputNewOutput.toByteString();
                }
                e();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f87688b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f87689c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Argument> f87690d = Collections.EMPTY_LIST;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f87688b & 2) != 2) {
                    this.f87690d = new ArrayList(this.f87690d);
                    this.f87688b |= 2;
                }
            }

            private void e() {
            }

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i11 = (this.f87688b & 1) != 1 ? 0 : 1;
                annotation.f87646d = this.f87689c;
                if ((this.f87688b & 2) == 2) {
                    this.f87690d = Collections.unmodifiableList(this.f87690d);
                    this.f87688b &= -3;
                }
                annotation.f87647e = this.f87690d;
                annotation.f87645c = i11;
                return annotation;
            }

            public Argument getArgument(int i11) {
                return this.f87690d.get(i11);
            }

            public int getArgumentCount() {
                return this.f87690d.size();
            }

            public boolean hasId() {
                return (this.f87688b & 1) == 1;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                    if (!getArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setId(int i11) {
                this.f87688b |= 1;
                this.f87689c = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(annotationBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.f87647e.isEmpty()) {
                    if (this.f87690d.isEmpty()) {
                        this.f87690d = annotation.f87647e;
                        this.f87688b &= -3;
                    } else {
                        d();
                        this.f87690d.addAll(annotation.f87647e);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.f87644b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation partialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Annotation annotation2 = (Annotation) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (annotation != null) {
                        mergeFrom(annotation);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Annotation> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Annotation annotation = new Annotation(true);
            f87643h = annotation;
            annotation.m();
        }

        public static Annotation getDefaultInstance() {
            return f87643h;
        }

        private void m() {
            this.f87646d = 0;
            this.f87647e = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public Argument getArgument(int i11) {
            return this.f87647e.get(i11);
        }

        public int getArgumentCount() {
            return this.f87647e.size();
        }

        public List<Argument> getArgumentList() {
            return this.f87647e;
        }

        public int getId() {
            return this.f87646d;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87649g;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87645c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87646d) : 0;
            for (int i12 = 0; i12 < this.f87647e.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f87647e.get(i12));
            }
            int size = iComputeInt32Size + this.f87644b.size();
            this.f87649g = size;
            return size;
        }

        public boolean hasId() {
            return (this.f87645c & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87648f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasId()) {
                this.f87648f = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                if (!getArgument(i11).isInitialized()) {
                    this.f87648f = (byte) 0;
                    return false;
                }
            }
            this.f87648f = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f87645c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87646d);
            }
            for (int i11 = 0; i11 < this.f87647e.size(); i11++) {
                codedOutputStream.writeMessage(2, this.f87647e.get(i11));
            }
            codedOutputStream.writeRawBytes(this.f87644b);
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return f87643h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f87648f = (byte) -1;
            this.f87649g = -1;
            this.f87644b = builder.getUnknownFields();
        }

        private Annotation(boolean z11) {
            this.f87648f = (byte) -1;
            this.f87649g = -1;
            this.f87644b = ByteString.EMPTY;
        }

        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87648f = (byte) -1;
            this.f87649g = -1;
            m();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f87645c |= 1;
                                this.f87646d = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((c11 & 2) != 2) {
                                    this.f87647e = new ArrayList();
                                    c11 = 2;
                                }
                                this.f87647e.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.f87647e = Collections.unmodifiableList(this.f87647e);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87644b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.f87647e = Collections.unmodifiableList(this.f87647e);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87644b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        private static final Class K;
        public static Parser<Class> PARSER = new a();
        private List<Integer> A;
        private int B;
        private List<Type> C;
        private List<Integer> D;
        private int E;
        private TypeTable F;
        private List<Integer> G;
        private VersionRequirementTable H;
        private byte I;
        private int J;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f87694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<TypeParameter> f87696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<Type> f87697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Integer> f87698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f87699k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<Integer> f87700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f87701m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Type> f87702n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<Integer> f87703o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f87704p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<Constructor> f87705q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<Function> f87706r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<Property> f87707s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<TypeAlias> f87708t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private List<EnumEntry> f87709u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List<Integer> f87710v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f87711w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f87712x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private Type f87713y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f87714z;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            private List<Integer> A;
            private VersionRequirementTable B;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87715d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87716e = 6;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f87717f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f87718g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<TypeParameter> f87719h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<Type> f87720i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<Integer> f87721j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private List<Integer> f87722k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private List<Type> f87723l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<Integer> f87724m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Constructor> f87725n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private List<Function> f87726o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private List<Property> f87727p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private List<TypeAlias> f87728q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private List<EnumEntry> f87729r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private List<Integer> f87730s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f87731t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private Type f87732u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private int f87733v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private List<Integer> f87734w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private List<Type> f87735x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private List<Integer> f87736y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            private TypeTable f87737z;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f87719h = list;
                this.f87720i = list;
                this.f87721j = list;
                this.f87722k = list;
                this.f87723l = list;
                this.f87724m = list;
                this.f87725n = list;
                this.f87726o = list;
                this.f87727p = list;
                this.f87728q = list;
                this.f87729r = list;
                this.f87730s = list;
                this.f87732u = Type.getDefaultInstance();
                this.f87734w = list;
                this.f87735x = list;
                this.f87736y = list;
                this.f87737z = TypeTable.getDefaultInstance();
                this.A = list;
                this.B = VersionRequirementTable.getDefaultInstance();
                y();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87715d & 512) != 512) {
                    this.f87725n = new ArrayList(this.f87725n);
                    this.f87715d |= 512;
                }
            }

            private void j() {
                if ((this.f87715d & 256) != 256) {
                    this.f87724m = new ArrayList(this.f87724m);
                    this.f87715d |= 256;
                }
            }

            private void k() {
                if ((this.f87715d & 128) != 128) {
                    this.f87723l = new ArrayList(this.f87723l);
                    this.f87715d |= 128;
                }
            }

            private void l() {
                if ((this.f87715d & PKIFailureInfo.certRevoked) != 8192) {
                    this.f87729r = new ArrayList(this.f87729r);
                    this.f87715d |= PKIFailureInfo.certRevoked;
                }
            }

            private void m() {
                if ((this.f87715d & 1024) != 1024) {
                    this.f87726o = new ArrayList(this.f87726o);
                    this.f87715d |= 1024;
                }
            }

            private void n() {
                if ((this.f87715d & 262144) != 262144) {
                    this.f87734w = new ArrayList(this.f87734w);
                    this.f87715d |= 262144;
                }
            }

            private void o() {
                if ((this.f87715d & PKIFailureInfo.badCertTemplate) != 1048576) {
                    this.f87736y = new ArrayList(this.f87736y);
                    this.f87715d |= PKIFailureInfo.badCertTemplate;
                }
            }

            private void p() {
                if ((this.f87715d & PKIFailureInfo.signerNotTrusted) != 524288) {
                    this.f87735x = new ArrayList(this.f87735x);
                    this.f87715d |= PKIFailureInfo.signerNotTrusted;
                }
            }

            private void q() {
                if ((this.f87715d & 64) != 64) {
                    this.f87722k = new ArrayList(this.f87722k);
                    this.f87715d |= 64;
                }
            }

            private void r() {
                if ((this.f87715d & 2048) != 2048) {
                    this.f87727p = new ArrayList(this.f87727p);
                    this.f87715d |= 2048;
                }
            }

            private void s() {
                if ((this.f87715d & 16384) != 16384) {
                    this.f87730s = new ArrayList(this.f87730s);
                    this.f87715d |= 16384;
                }
            }

            private void t() {
                if ((this.f87715d & 32) != 32) {
                    this.f87721j = new ArrayList(this.f87721j);
                    this.f87715d |= 32;
                }
            }

            private void u() {
                if ((this.f87715d & 16) != 16) {
                    this.f87720i = new ArrayList(this.f87720i);
                    this.f87715d |= 16;
                }
            }

            private void v() {
                if ((this.f87715d & 4096) != 4096) {
                    this.f87728q = new ArrayList(this.f87728q);
                    this.f87715d |= 4096;
                }
            }

            private void w() {
                if ((this.f87715d & 8) != 8) {
                    this.f87719h = new ArrayList(this.f87719h);
                    this.f87715d |= 8;
                }
            }

            private void x() {
                if ((this.f87715d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.f87715d |= 4194304;
                }
            }

            private void y() {
            }

            public Class buildPartial() {
                Class r11 = new Class(this);
                int i11 = this.f87715d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                r11.f87693e = this.f87716e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                r11.f87694f = this.f87717f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                r11.f87695g = this.f87718g;
                if ((this.f87715d & 8) == 8) {
                    this.f87719h = Collections.unmodifiableList(this.f87719h);
                    this.f87715d &= -9;
                }
                r11.f87696h = this.f87719h;
                if ((this.f87715d & 16) == 16) {
                    this.f87720i = Collections.unmodifiableList(this.f87720i);
                    this.f87715d &= -17;
                }
                r11.f87697i = this.f87720i;
                if ((this.f87715d & 32) == 32) {
                    this.f87721j = Collections.unmodifiableList(this.f87721j);
                    this.f87715d &= -33;
                }
                r11.f87698j = this.f87721j;
                if ((this.f87715d & 64) == 64) {
                    this.f87722k = Collections.unmodifiableList(this.f87722k);
                    this.f87715d &= -65;
                }
                r11.f87700l = this.f87722k;
                if ((this.f87715d & 128) == 128) {
                    this.f87723l = Collections.unmodifiableList(this.f87723l);
                    this.f87715d &= -129;
                }
                r11.f87702n = this.f87723l;
                if ((this.f87715d & 256) == 256) {
                    this.f87724m = Collections.unmodifiableList(this.f87724m);
                    this.f87715d &= -257;
                }
                r11.f87703o = this.f87724m;
                if ((this.f87715d & 512) == 512) {
                    this.f87725n = Collections.unmodifiableList(this.f87725n);
                    this.f87715d &= -513;
                }
                r11.f87705q = this.f87725n;
                if ((this.f87715d & 1024) == 1024) {
                    this.f87726o = Collections.unmodifiableList(this.f87726o);
                    this.f87715d &= -1025;
                }
                r11.f87706r = this.f87726o;
                if ((this.f87715d & 2048) == 2048) {
                    this.f87727p = Collections.unmodifiableList(this.f87727p);
                    this.f87715d &= -2049;
                }
                r11.f87707s = this.f87727p;
                if ((this.f87715d & 4096) == 4096) {
                    this.f87728q = Collections.unmodifiableList(this.f87728q);
                    this.f87715d &= -4097;
                }
                r11.f87708t = this.f87728q;
                if ((this.f87715d & PKIFailureInfo.certRevoked) == 8192) {
                    this.f87729r = Collections.unmodifiableList(this.f87729r);
                    this.f87715d &= -8193;
                }
                r11.f87709u = this.f87729r;
                if ((this.f87715d & 16384) == 16384) {
                    this.f87730s = Collections.unmodifiableList(this.f87730s);
                    this.f87715d &= -16385;
                }
                r11.f87710v = this.f87730s;
                if ((i11 & 32768) == 32768) {
                    i12 |= 8;
                }
                r11.f87712x = this.f87731t;
                if ((i11 & 65536) == 65536) {
                    i12 |= 16;
                }
                r11.f87713y = this.f87732u;
                if ((i11 & 131072) == 131072) {
                    i12 |= 32;
                }
                r11.f87714z = this.f87733v;
                if ((this.f87715d & 262144) == 262144) {
                    this.f87734w = Collections.unmodifiableList(this.f87734w);
                    this.f87715d &= -262145;
                }
                r11.A = this.f87734w;
                if ((this.f87715d & PKIFailureInfo.signerNotTrusted) == 524288) {
                    this.f87735x = Collections.unmodifiableList(this.f87735x);
                    this.f87715d &= -524289;
                }
                r11.C = this.f87735x;
                if ((this.f87715d & PKIFailureInfo.badCertTemplate) == 1048576) {
                    this.f87736y = Collections.unmodifiableList(this.f87736y);
                    this.f87715d &= -1048577;
                }
                r11.D = this.f87736y;
                if ((i11 & PKIFailureInfo.badSenderNonce) == 2097152) {
                    i12 |= 64;
                }
                r11.F = this.f87737z;
                if ((this.f87715d & 4194304) == 4194304) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.f87715d &= -4194305;
                }
                r11.G = this.A;
                if ((i11 & 8388608) == 8388608) {
                    i12 |= 128;
                }
                r11.H = this.B;
                r11.f87692d = i12;
                return r11;
            }

            public Constructor getConstructor(int i11) {
                return this.f87725n.get(i11);
            }

            public int getConstructorCount() {
                return this.f87725n.size();
            }

            public Type getContextReceiverType(int i11) {
                return this.f87723l.get(i11);
            }

            public int getContextReceiverTypeCount() {
                return this.f87723l.size();
            }

            public EnumEntry getEnumEntry(int i11) {
                return this.f87729r.get(i11);
            }

            public int getEnumEntryCount() {
                return this.f87729r.size();
            }

            public Function getFunction(int i11) {
                return this.f87726o.get(i11);
            }

            public int getFunctionCount() {
                return this.f87726o.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.f87732u;
            }

            public Type getMultiFieldValueClassUnderlyingType(int i11) {
                return this.f87735x.get(i11);
            }

            public int getMultiFieldValueClassUnderlyingTypeCount() {
                return this.f87735x.size();
            }

            public Property getProperty(int i11) {
                return this.f87727p.get(i11);
            }

            public int getPropertyCount() {
                return this.f87727p.size();
            }

            public Type getSupertype(int i11) {
                return this.f87720i.get(i11);
            }

            public int getSupertypeCount() {
                return this.f87720i.size();
            }

            public TypeAlias getTypeAlias(int i11) {
                return this.f87728q.get(i11);
            }

            public int getTypeAliasCount() {
                return this.f87728q.size();
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.f87719h.get(i11);
            }

            public int getTypeParameterCount() {
                return this.f87719h.size();
            }

            public TypeTable getTypeTable() {
                return this.f87737z;
            }

            public boolean hasFqName() {
                return (this.f87715d & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.f87715d & 65536) == 65536;
            }

            public boolean hasTypeTable() {
                return (this.f87715d & PKIFailureInfo.badSenderNonce) == 2097152;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getSupertypeCount(); i12++) {
                    if (!getSupertype(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getContextReceiverTypeCount(); i13++) {
                    if (!getContextReceiverType(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < getConstructorCount(); i14++) {
                    if (!getConstructor(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getFunctionCount(); i15++) {
                    if (!getFunction(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < getPropertyCount(); i16++) {
                    if (!getProperty(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < getTypeAliasCount(); i17++) {
                    if (!getTypeAlias(i17).isInitialized()) {
                        return false;
                    }
                }
                for (int i18 = 0; i18 < getEnumEntryCount(); i18++) {
                    if (!getEnumEntry(i18).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i19 = 0; i19 < getMultiFieldValueClassUnderlyingTypeCount(); i19++) {
                    if (!getMultiFieldValueClassUnderlyingType(i19).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && e();
            }

            public Builder mergeInlineClassUnderlyingType(Type type) {
                if ((this.f87715d & 65536) != 65536 || this.f87732u == Type.getDefaultInstance()) {
                    this.f87732u = type;
                } else {
                    this.f87732u = Type.newBuilder(this.f87732u).mergeFrom(type).buildPartial();
                }
                this.f87715d |= 65536;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f87715d & PKIFailureInfo.badSenderNonce) != 2097152 || this.f87737z == TypeTable.getDefaultInstance()) {
                    this.f87737z = typeTable;
                } else {
                    this.f87737z = TypeTable.newBuilder(this.f87737z).mergeFrom(typeTable).buildPartial();
                }
                this.f87715d |= PKIFailureInfo.badSenderNonce;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.f87715d & 8388608) != 8388608 || this.B == VersionRequirementTable.getDefaultInstance()) {
                    this.B = versionRequirementTable;
                } else {
                    this.B = VersionRequirementTable.newBuilder(this.B).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.f87715d |= 8388608;
                return this;
            }

            public Builder setCompanionObjectName(int i11) {
                this.f87715d |= 4;
                this.f87718g = i11;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f87715d |= 1;
                this.f87716e = i11;
                return this;
            }

            public Builder setFqName(int i11) {
                this.f87715d |= 2;
                this.f87717f = i11;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i11) {
                this.f87715d |= 32768;
                this.f87731t = i11;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i11) {
                this.f87715d |= 131072;
                this.f87733v = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(classBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r11) {
                if (r11 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r11.hasFlags()) {
                    setFlags(r11.getFlags());
                }
                if (r11.hasFqName()) {
                    setFqName(r11.getFqName());
                }
                if (r11.hasCompanionObjectName()) {
                    setCompanionObjectName(r11.getCompanionObjectName());
                }
                if (!r11.f87696h.isEmpty()) {
                    if (this.f87719h.isEmpty()) {
                        this.f87719h = r11.f87696h;
                        this.f87715d &= -9;
                    } else {
                        w();
                        this.f87719h.addAll(r11.f87696h);
                    }
                }
                if (!r11.f87697i.isEmpty()) {
                    if (this.f87720i.isEmpty()) {
                        this.f87720i = r11.f87697i;
                        this.f87715d &= -17;
                    } else {
                        u();
                        this.f87720i.addAll(r11.f87697i);
                    }
                }
                if (!r11.f87698j.isEmpty()) {
                    if (this.f87721j.isEmpty()) {
                        this.f87721j = r11.f87698j;
                        this.f87715d &= -33;
                    } else {
                        t();
                        this.f87721j.addAll(r11.f87698j);
                    }
                }
                if (!r11.f87700l.isEmpty()) {
                    if (this.f87722k.isEmpty()) {
                        this.f87722k = r11.f87700l;
                        this.f87715d &= -65;
                    } else {
                        q();
                        this.f87722k.addAll(r11.f87700l);
                    }
                }
                if (!r11.f87702n.isEmpty()) {
                    if (this.f87723l.isEmpty()) {
                        this.f87723l = r11.f87702n;
                        this.f87715d &= -129;
                    } else {
                        k();
                        this.f87723l.addAll(r11.f87702n);
                    }
                }
                if (!r11.f87703o.isEmpty()) {
                    if (this.f87724m.isEmpty()) {
                        this.f87724m = r11.f87703o;
                        this.f87715d &= -257;
                    } else {
                        j();
                        this.f87724m.addAll(r11.f87703o);
                    }
                }
                if (!r11.f87705q.isEmpty()) {
                    if (this.f87725n.isEmpty()) {
                        this.f87725n = r11.f87705q;
                        this.f87715d &= -513;
                    } else {
                        i();
                        this.f87725n.addAll(r11.f87705q);
                    }
                }
                if (!r11.f87706r.isEmpty()) {
                    if (this.f87726o.isEmpty()) {
                        this.f87726o = r11.f87706r;
                        this.f87715d &= -1025;
                    } else {
                        m();
                        this.f87726o.addAll(r11.f87706r);
                    }
                }
                if (!r11.f87707s.isEmpty()) {
                    if (this.f87727p.isEmpty()) {
                        this.f87727p = r11.f87707s;
                        this.f87715d &= -2049;
                    } else {
                        r();
                        this.f87727p.addAll(r11.f87707s);
                    }
                }
                if (!r11.f87708t.isEmpty()) {
                    if (this.f87728q.isEmpty()) {
                        this.f87728q = r11.f87708t;
                        this.f87715d &= -4097;
                    } else {
                        v();
                        this.f87728q.addAll(r11.f87708t);
                    }
                }
                if (!r11.f87709u.isEmpty()) {
                    if (this.f87729r.isEmpty()) {
                        this.f87729r = r11.f87709u;
                        this.f87715d &= -8193;
                    } else {
                        l();
                        this.f87729r.addAll(r11.f87709u);
                    }
                }
                if (!r11.f87710v.isEmpty()) {
                    if (this.f87730s.isEmpty()) {
                        this.f87730s = r11.f87710v;
                        this.f87715d &= -16385;
                    } else {
                        s();
                        this.f87730s.addAll(r11.f87710v);
                    }
                }
                if (r11.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r11.getInlineClassUnderlyingPropertyName());
                }
                if (r11.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r11.getInlineClassUnderlyingType());
                }
                if (r11.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r11.getInlineClassUnderlyingTypeId());
                }
                if (!r11.A.isEmpty()) {
                    if (this.f87734w.isEmpty()) {
                        this.f87734w = r11.A;
                        this.f87715d &= -262145;
                    } else {
                        n();
                        this.f87734w.addAll(r11.A);
                    }
                }
                if (!r11.C.isEmpty()) {
                    if (this.f87735x.isEmpty()) {
                        this.f87735x = r11.C;
                        this.f87715d &= -524289;
                    } else {
                        p();
                        this.f87735x.addAll(r11.C);
                    }
                }
                if (!r11.D.isEmpty()) {
                    if (this.f87736y.isEmpty()) {
                        this.f87736y = r11.D;
                        this.f87715d &= -1048577;
                    } else {
                        o();
                        this.f87736y.addAll(r11.D);
                    }
                }
                if (r11.hasTypeTable()) {
                    mergeTypeTable(r11.getTypeTable());
                }
                if (!r11.G.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = r11.G;
                        this.f87715d &= -4194305;
                    } else {
                        x();
                        this.A.addAll(r11.G);
                    }
                }
                if (r11.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r11.getVersionRequirementTable());
                }
                f(r11);
                setUnknownFields(getUnknownFields().concat(r11.f87691c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r11 = null;
                try {
                    try {
                        Class partialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Class r12 = (Class) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = r12;
                            if (r11 != null) {
                                mergeFrom(r11);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r11 != null) {
                        mergeFrom(r11);
                    }
                    throw th;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static Internal.EnumLiteMap<Kind> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<Kind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Kind findValueByNumber(int i11) {
                    return Kind.valueOf(i11);
                }
            }

            Kind(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i11) {
                switch (i11) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        static class a extends AbstractParser<Class> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Class r11 = new Class(true);
            K = r11;
            r11.d0();
        }

        private void d0() {
            this.f87693e = 6;
            this.f87694f = 0;
            this.f87695g = 0;
            List list = Collections.EMPTY_LIST;
            this.f87696h = list;
            this.f87697i = list;
            this.f87698j = list;
            this.f87700l = list;
            this.f87702n = list;
            this.f87703o = list;
            this.f87705q = list;
            this.f87706r = list;
            this.f87707s = list;
            this.f87708t = list;
            this.f87709u = list;
            this.f87710v = list;
            this.f87712x = 0;
            this.f87713y = Type.getDefaultInstance();
            this.f87714z = 0;
            this.A = list;
            this.C = list;
            this.D = list;
            this.F = TypeTable.getDefaultInstance();
            this.G = list;
            this.H = VersionRequirementTable.getDefaultInstance();
        }

        public static Class getDefaultInstance() {
            return K;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public int getCompanionObjectName() {
            return this.f87695g;
        }

        public Constructor getConstructor(int i11) {
            return this.f87705q.get(i11);
        }

        public int getConstructorCount() {
            return this.f87705q.size();
        }

        public List<Constructor> getConstructorList() {
            return this.f87705q;
        }

        public Type getContextReceiverType(int i11) {
            return this.f87702n.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.f87702n.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f87703o;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f87702n;
        }

        public EnumEntry getEnumEntry(int i11) {
            return this.f87709u.get(i11);
        }

        public int getEnumEntryCount() {
            return this.f87709u.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.f87709u;
        }

        public int getFlags() {
            return this.f87693e;
        }

        public int getFqName() {
            return this.f87694f;
        }

        public Function getFunction(int i11) {
            return this.f87706r.get(i11);
        }

        public int getFunctionCount() {
            return this.f87706r.size();
        }

        public List<Function> getFunctionList() {
            return this.f87706r;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.f87712x;
        }

        public Type getInlineClassUnderlyingType() {
            return this.f87713y;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.f87714z;
        }

        public int getMultiFieldValueClassUnderlyingNameCount() {
            return this.A.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
            return this.A;
        }

        public Type getMultiFieldValueClassUnderlyingType(int i11) {
            return this.C.get(i11);
        }

        public int getMultiFieldValueClassUnderlyingTypeCount() {
            return this.C.size();
        }

        public int getMultiFieldValueClassUnderlyingTypeIdCount() {
            return this.D.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
            return this.D;
        }

        public List<Type> getMultiFieldValueClassUnderlyingTypeList() {
            return this.C;
        }

        public List<Integer> getNestedClassNameList() {
            return this.f87700l;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i11) {
            return this.f87707s.get(i11);
        }

        public int getPropertyCount() {
            return this.f87707s.size();
        }

        public List<Property> getPropertyList() {
            return this.f87707s;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.f87710v;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.J;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87692d & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87693e) : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f87698j.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f87698j.get(i12).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f87699k = iComputeInt32SizeNoTag;
            if ((this.f87692d & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(3, this.f87694f);
            }
            if ((this.f87692d & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(4, this.f87695g);
            }
            for (int i13 = 0; i13 < this.f87696h.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f87696h.get(i13));
            }
            for (int i14 = 0; i14 < this.f87697i.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, this.f87697i.get(i14));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i15 = 0; i15 < this.f87700l.size(); i15++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.f87700l.get(i15).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.f87701m = iComputeInt32SizeNoTag2;
            for (int i16 = 0; i16 < this.f87705q.size(); i16++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(8, this.f87705q.get(i16));
            }
            for (int i17 = 0; i17 < this.f87706r.size(); i17++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(9, this.f87706r.get(i17));
            }
            for (int i18 = 0; i18 < this.f87707s.size(); i18++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(10, this.f87707s.get(i18));
            }
            for (int i19 = 0; i19 < this.f87708t.size(); i19++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(11, this.f87708t.get(i19));
            }
            for (int i21 = 0; i21 < this.f87709u.size(); i21++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(13, this.f87709u.get(i21));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i22 = 0; i22 < this.f87710v.size(); i22++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.f87710v.get(i22).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.f87711w = iComputeInt32SizeNoTag3;
            if ((this.f87692d & 8) == 8) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(17, this.f87712x);
            }
            if ((this.f87692d & 16) == 16) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(18, this.f87713y);
            }
            if ((this.f87692d & 32) == 32) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(19, this.f87714z);
            }
            for (int i23 = 0; i23 < this.f87702n.size(); i23++) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(20, this.f87702n.get(i23));
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i24 = 0; i24 < this.f87703o.size(); i24++) {
                iComputeInt32SizeNoTag4 += CodedOutputStream.computeInt32SizeNoTag(this.f87703o.get(i24).intValue());
            }
            int iComputeInt32SizeNoTag5 = iComputeMessageSize3 + iComputeInt32SizeNoTag4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag5 = iComputeInt32SizeNoTag5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag4);
            }
            this.f87704p = iComputeInt32SizeNoTag4;
            int iComputeInt32SizeNoTag6 = 0;
            for (int i25 = 0; i25 < this.A.size(); i25++) {
                iComputeInt32SizeNoTag6 += CodedOutputStream.computeInt32SizeNoTag(this.A.get(i25).intValue());
            }
            int iComputeMessageSize4 = iComputeInt32SizeNoTag5 + iComputeInt32SizeNoTag6;
            if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
                iComputeMessageSize4 = iComputeMessageSize4 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag6);
            }
            this.B = iComputeInt32SizeNoTag6;
            for (int i26 = 0; i26 < this.C.size(); i26++) {
                iComputeMessageSize4 += CodedOutputStream.computeMessageSize(23, this.C.get(i26));
            }
            int iComputeInt32SizeNoTag7 = 0;
            for (int i27 = 0; i27 < this.D.size(); i27++) {
                iComputeInt32SizeNoTag7 += CodedOutputStream.computeInt32SizeNoTag(this.D.get(i27).intValue());
            }
            int iComputeMessageSize5 = iComputeMessageSize4 + iComputeInt32SizeNoTag7;
            if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
                iComputeMessageSize5 = iComputeMessageSize5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag7);
            }
            this.E = iComputeInt32SizeNoTag7;
            if ((this.f87692d & 64) == 64) {
                iComputeMessageSize5 += CodedOutputStream.computeMessageSize(30, this.F);
            }
            int iComputeInt32SizeNoTag8 = 0;
            for (int i28 = 0; i28 < this.G.size(); i28++) {
                iComputeInt32SizeNoTag8 += CodedOutputStream.computeInt32SizeNoTag(this.G.get(i28).intValue());
            }
            int size = iComputeMessageSize5 + iComputeInt32SizeNoTag8 + (getVersionRequirementList().size() * 2);
            if ((this.f87692d & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.H);
            }
            int iJ = size + j() + this.f87691c.size();
            this.J = iJ;
            return iJ;
        }

        public Type getSupertype(int i11) {
            return this.f87697i.get(i11);
        }

        public int getSupertypeCount() {
            return this.f87697i.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.f87698j;
        }

        public List<Type> getSupertypeList() {
            return this.f87697i;
        }

        public TypeAlias getTypeAlias(int i11) {
            return this.f87708t.get(i11);
        }

        public int getTypeAliasCount() {
            return this.f87708t.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f87708t;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.f87696h.get(i11);
        }

        public int getTypeParameterCount() {
            return this.f87696h.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f87696h;
        }

        public TypeTable getTypeTable() {
            return this.F;
        }

        public List<Integer> getVersionRequirementList() {
            return this.G;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.H;
        }

        public boolean hasCompanionObjectName() {
            return (this.f87692d & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f87692d & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.f87692d & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.f87692d & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.f87692d & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.f87692d & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.f87692d & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f87692d & 128) == 128;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.I;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.I = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getSupertypeCount(); i12++) {
                if (!getSupertype(i12).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getContextReceiverTypeCount(); i13++) {
                if (!getContextReceiverType(i13).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < getConstructorCount(); i14++) {
                if (!getConstructor(i14).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getFunctionCount(); i15++) {
                if (!getFunction(i15).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getPropertyCount(); i16++) {
                if (!getProperty(i16).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getTypeAliasCount(); i17++) {
                if (!getTypeAlias(i17).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            for (int i18 = 0; i18 < getEnumEntryCount(); i18++) {
                if (!getEnumEntry(i18).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
            for (int i19 = 0; i19 < getMultiFieldValueClassUnderlyingTypeCount(); i19++) {
                if (!getMultiFieldValueClassUnderlyingType(i19).isInitialized()) {
                    this.I = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.I = (byte) 0;
                return false;
            }
            if (i()) {
                this.I = (byte) 1;
                return true;
            }
            this.I = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87692d & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87693e);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.f87699k);
            }
            for (int i11 = 0; i11 < this.f87698j.size(); i11++) {
                codedOutputStream.writeInt32NoTag(this.f87698j.get(i11).intValue());
            }
            if ((this.f87692d & 2) == 2) {
                codedOutputStream.writeInt32(3, this.f87694f);
            }
            if ((this.f87692d & 4) == 4) {
                codedOutputStream.writeInt32(4, this.f87695g);
            }
            for (int i12 = 0; i12 < this.f87696h.size(); i12++) {
                codedOutputStream.writeMessage(5, this.f87696h.get(i12));
            }
            for (int i13 = 0; i13 < this.f87697i.size(); i13++) {
                codedOutputStream.writeMessage(6, this.f87697i.get(i13));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.f87701m);
            }
            for (int i14 = 0; i14 < this.f87700l.size(); i14++) {
                codedOutputStream.writeInt32NoTag(this.f87700l.get(i14).intValue());
            }
            for (int i15 = 0; i15 < this.f87705q.size(); i15++) {
                codedOutputStream.writeMessage(8, this.f87705q.get(i15));
            }
            for (int i16 = 0; i16 < this.f87706r.size(); i16++) {
                codedOutputStream.writeMessage(9, this.f87706r.get(i16));
            }
            for (int i17 = 0; i17 < this.f87707s.size(); i17++) {
                codedOutputStream.writeMessage(10, this.f87707s.get(i17));
            }
            for (int i18 = 0; i18 < this.f87708t.size(); i18++) {
                codedOutputStream.writeMessage(11, this.f87708t.get(i18));
            }
            for (int i19 = 0; i19 < this.f87709u.size(); i19++) {
                codedOutputStream.writeMessage(13, this.f87709u.get(i19));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                codedOutputStream.writeRawVarint32(this.f87711w);
            }
            for (int i21 = 0; i21 < this.f87710v.size(); i21++) {
                codedOutputStream.writeInt32NoTag(this.f87710v.get(i21).intValue());
            }
            if ((this.f87692d & 8) == 8) {
                codedOutputStream.writeInt32(17, this.f87712x);
            }
            if ((this.f87692d & 16) == 16) {
                codedOutputStream.writeMessage(18, this.f87713y);
            }
            if ((this.f87692d & 32) == 32) {
                codedOutputStream.writeInt32(19, this.f87714z);
            }
            for (int i22 = 0; i22 < this.f87702n.size(); i22++) {
                codedOutputStream.writeMessage(20, this.f87702n.get(i22));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(170);
                codedOutputStream.writeRawVarint32(this.f87704p);
            }
            for (int i23 = 0; i23 < this.f87703o.size(); i23++) {
                codedOutputStream.writeInt32NoTag(this.f87703o.get(i23).intValue());
            }
            if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(178);
                codedOutputStream.writeRawVarint32(this.B);
            }
            for (int i24 = 0; i24 < this.A.size(); i24++) {
                codedOutputStream.writeInt32NoTag(this.A.get(i24).intValue());
            }
            for (int i25 = 0; i25 < this.C.size(); i25++) {
                codedOutputStream.writeMessage(23, this.C.get(i25));
            }
            if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(194);
                codedOutputStream.writeRawVarint32(this.E);
            }
            for (int i26 = 0; i26 < this.D.size(); i26++) {
                codedOutputStream.writeInt32NoTag(this.D.get(i26).intValue());
            }
            if ((this.f87692d & 64) == 64) {
                codedOutputStream.writeMessage(30, this.F);
            }
            for (int i27 = 0; i27 < this.G.size(); i27++) {
                codedOutputStream.writeInt32(31, this.G.get(i27).intValue());
            }
            if ((this.f87692d & 128) == 128) {
                codedOutputStream.writeMessage(32, this.H);
            }
            extensionWriterK.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87691c);
        }

        public static Builder newBuilder(Class r11) {
            return newBuilder().mergeFrom(r11);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return K;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87699k = -1;
            this.f87701m = -1;
            this.f87704p = -1;
            this.f87711w = -1;
            this.B = -1;
            this.E = -1;
            this.I = (byte) -1;
            this.J = -1;
            this.f87691c = extendableBuilder.getUnknownFields();
        }

        private Class(boolean z11) {
            this.f87699k = -1;
            this.f87701m = -1;
            this.f87704p = -1;
            this.f87711w = -1;
            this.B = -1;
            this.E = -1;
            this.I = (byte) -1;
            this.J = -1;
            this.f87691c = ByteString.EMPTY;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:9:0x004d  */
        /* JADX WARN: Multi-variable type inference failed */
        private Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            this.f87699k = -1;
            this.f87701m = -1;
            this.f87704p = -1;
            this.f87711w = -1;
            this.B = -1;
            this.E = -1;
            this.I = (byte) -1;
            this.J = -1;
            d0();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            boolean z11 = true;
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z12 = false;
            int i11 = 0;
            while (true) {
                boolean z13 = z11;
                if (!z12) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    z12 = z13;
                                    z11 = z13;
                                    break;
                                case 8:
                                    this.f87692d |= 1;
                                    this.f87693e = codedInputStream.readInt32();
                                    z11 = z13;
                                    break;
                                case 16:
                                    if ((i11 & 32) != 32) {
                                        this.f87698j = new ArrayList();
                                        i11 |= 32;
                                    }
                                    this.f87698j.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case 18:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87698j = new ArrayList();
                                        i11 |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87698j.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    z11 = z13;
                                    break;
                                case 24:
                                    this.f87692d |= 2;
                                    this.f87694f = codedInputStream.readInt32();
                                    z11 = z13;
                                    break;
                                case 32:
                                    this.f87692d |= 4;
                                    this.f87695g = codedInputStream.readInt32();
                                    z11 = z13;
                                    break;
                                case 42:
                                    if ((i11 & 8) != 8) {
                                        this.f87696h = new ArrayList();
                                        i11 |= 8;
                                    }
                                    this.f87696h.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 50:
                                    if ((i11 & 16) != 16) {
                                        this.f87697i = new ArrayList();
                                        i11 |= 16;
                                    }
                                    this.f87697i.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 56:
                                    if ((i11 & 64) != 64) {
                                        this.f87700l = new ArrayList();
                                        i11 |= 64;
                                    }
                                    this.f87700l.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case 58:
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 64) != 64 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87700l = new ArrayList();
                                        i11 |= 64;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87700l.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                    z11 = z13;
                                    break;
                                case 66:
                                    if ((i11 & 512) != 512) {
                                        this.f87705q = new ArrayList();
                                        i11 |= 512;
                                    }
                                    this.f87705q.add((Constructor) codedInputStream.readMessage(Constructor.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 74:
                                    if ((i11 & 1024) != 1024) {
                                        this.f87706r = new ArrayList();
                                        i11 |= 1024;
                                    }
                                    this.f87706r.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 82:
                                    if ((i11 & 2048) != 2048) {
                                        this.f87707s = new ArrayList();
                                        i11 |= 2048;
                                    }
                                    this.f87707s.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 90:
                                    if ((i11 & 4096) != 4096) {
                                        this.f87708t = new ArrayList();
                                        i11 |= 4096;
                                    }
                                    this.f87708t.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 106:
                                    if ((i11 & PKIFailureInfo.certRevoked) != 8192) {
                                        this.f87709u = new ArrayList();
                                        i11 |= PKIFailureInfo.certRevoked;
                                    }
                                    this.f87709u.add((EnumEntry) codedInputStream.readMessage(EnumEntry.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 128:
                                    if ((i11 & 16384) != 16384) {
                                        this.f87710v = new ArrayList();
                                        i11 |= 16384;
                                    }
                                    this.f87710v.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                    int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 16384) != 16384 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87710v = new ArrayList();
                                        i11 |= 16384;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87710v.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit3);
                                    z11 = z13;
                                    break;
                                case 136:
                                    this.f87692d |= 8;
                                    this.f87712x = codedInputStream.readInt32();
                                    z11 = z13;
                                    break;
                                case 146:
                                    Type.Builder builder = (this.f87692d & 16) == 16 ? this.f87713y.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f87713y = type;
                                    if (builder != 0) {
                                        builder.mergeFrom(type);
                                        this.f87713y = builder.buildPartial();
                                    }
                                    this.f87692d |= 16;
                                    z11 = z13;
                                    break;
                                case 152:
                                    this.f87692d |= 32;
                                    this.f87714z = codedInputStream.readInt32();
                                    z11 = z13;
                                    break;
                                case 162:
                                    if ((i11 & 128) != 128) {
                                        this.f87702n = new ArrayList();
                                        i11 |= 128;
                                    }
                                    this.f87702n.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 168:
                                    if ((i11 & 256) != 256) {
                                        this.f87703o = new ArrayList();
                                        i11 |= 256;
                                    }
                                    this.f87703o.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case 170:
                                    int iPushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87703o = new ArrayList();
                                        i11 |= 256;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87703o.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit4);
                                    z11 = z13;
                                    break;
                                case 176:
                                    if ((i11 & 262144) != 262144) {
                                        this.A = new ArrayList();
                                        i11 |= 262144;
                                    }
                                    this.A.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case 178:
                                    int iPushLimit5 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 262144) != 262144 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.A = new ArrayList();
                                        i11 |= 262144;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.A.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit5);
                                    z11 = z13;
                                    break;
                                case 186:
                                    if ((i11 & PKIFailureInfo.signerNotTrusted) != 524288) {
                                        this.C = new ArrayList();
                                        i11 |= PKIFailureInfo.signerNotTrusted;
                                    }
                                    this.C.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                    z11 = z13;
                                    break;
                                case 192:
                                    if ((i11 & PKIFailureInfo.badCertTemplate) != 1048576) {
                                        this.D = new ArrayList();
                                        i11 |= PKIFailureInfo.badCertTemplate;
                                    }
                                    this.D.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case 194:
                                    int iPushLimit6 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & PKIFailureInfo.badCertTemplate) != 1048576 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.D = new ArrayList();
                                        i11 |= PKIFailureInfo.badCertTemplate;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.D.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit6);
                                    z11 = z13;
                                    break;
                                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                    TypeTable.Builder builder2 = (this.f87692d & 64) == 64 ? this.F.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                    this.F = typeTable;
                                    if (builder2 != 0) {
                                        builder2.mergeFrom(typeTable);
                                        this.F = builder2.buildPartial();
                                    }
                                    this.f87692d |= 64;
                                    z11 = z13;
                                    break;
                                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                    if ((i11 & 4194304) != 4194304) {
                                        this.G = new ArrayList();
                                        i11 |= 4194304;
                                    }
                                    this.G.add(Integer.valueOf(codedInputStream.readInt32()));
                                    z11 = z13;
                                    break;
                                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                    int iPushLimit7 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 4194304) != 4194304 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.G = new ArrayList();
                                        i11 |= 4194304;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.G.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit7);
                                    z11 = z13;
                                    break;
                                case SDK_ASSET_HEADER_BOLT_VALUE:
                                    try {
                                        VersionRequirementTable.Builder builder3 = (this.f87692d & 128) == 128 ? this.H.toBuilder() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                        this.H = versionRequirementTable;
                                        if (builder3 != 0) {
                                            builder3.mergeFrom(versionRequirementTable);
                                            this.H = builder3.buildPartial();
                                        }
                                        this.f87692d |= 128;
                                        z11 = z13;
                                    } catch (InvalidProtocolBufferException e11) {
                                        e = e11;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e12) {
                                        e = e12;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if ((i11 & 32) == 32) {
                                            this.f87698j = Collections.unmodifiableList(this.f87698j);
                                        }
                                        if ((i11 & 8) == 8) {
                                            this.f87696h = Collections.unmodifiableList(this.f87696h);
                                        }
                                        if ((i11 & 16) == 16) {
                                            this.f87697i = Collections.unmodifiableList(this.f87697i);
                                        }
                                        if ((i11 & 64) == 64) {
                                            this.f87700l = Collections.unmodifiableList(this.f87700l);
                                        }
                                        if ((i11 & 512) == 512) {
                                            this.f87705q = Collections.unmodifiableList(this.f87705q);
                                        }
                                        if ((i11 & 1024) == 1024) {
                                            this.f87706r = Collections.unmodifiableList(this.f87706r);
                                        }
                                        if ((i11 & 2048) == 2048) {
                                            this.f87707s = Collections.unmodifiableList(this.f87707s);
                                        }
                                        if ((i11 & 4096) == 4096) {
                                            this.f87708t = Collections.unmodifiableList(this.f87708t);
                                        }
                                        if ((i11 & PKIFailureInfo.certRevoked) == 8192) {
                                            this.f87709u = Collections.unmodifiableList(this.f87709u);
                                        }
                                        if ((i11 & 16384) == 16384) {
                                            this.f87710v = Collections.unmodifiableList(this.f87710v);
                                        }
                                        if ((i11 & 128) == 128) {
                                            this.f87702n = Collections.unmodifiableList(this.f87702n);
                                        }
                                        if ((i11 & 256) == 256) {
                                            this.f87703o = Collections.unmodifiableList(this.f87703o);
                                        }
                                        if ((i11 & 262144) == 262144) {
                                            this.A = Collections.unmodifiableList(this.A);
                                        }
                                        if ((i11 & PKIFailureInfo.signerNotTrusted) == 524288) {
                                            this.C = Collections.unmodifiableList(this.C);
                                        }
                                        if ((i11 & PKIFailureInfo.badCertTemplate) == 1048576) {
                                            this.D = Collections.unmodifiableList(this.D);
                                        }
                                        if ((i11 & 4194304) == 4194304) {
                                            this.G = Collections.unmodifiableList(this.G);
                                        }
                                        try {
                                            codedOutputStreamNewInstance.flush();
                                            break;
                                        } catch (IOException unused) {
                                        } finally {
                                            this.f87691c = outputNewOutput.toByteString();
                                        }
                                        e();
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        z12 = z13;
                                    }
                                    z11 = z13;
                                    break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (InvalidProtocolBufferException e13) {
                        e = e13;
                    } catch (IOException e14) {
                        e = e14;
                    }
                } else {
                    if ((i11 & 32) == 32) {
                        this.f87698j = Collections.unmodifiableList(this.f87698j);
                    }
                    if ((i11 & 8) == 8) {
                        this.f87696h = Collections.unmodifiableList(this.f87696h);
                    }
                    if ((i11 & 16) == 16) {
                        this.f87697i = Collections.unmodifiableList(this.f87697i);
                    }
                    if ((i11 & 64) == 64) {
                        this.f87700l = Collections.unmodifiableList(this.f87700l);
                    }
                    if ((i11 & 512) == 512) {
                        this.f87705q = Collections.unmodifiableList(this.f87705q);
                    }
                    if ((i11 & 1024) == 1024) {
                        this.f87706r = Collections.unmodifiableList(this.f87706r);
                    }
                    if ((i11 & 2048) == 2048) {
                        this.f87707s = Collections.unmodifiableList(this.f87707s);
                    }
                    if ((i11 & 4096) == 4096) {
                        this.f87708t = Collections.unmodifiableList(this.f87708t);
                    }
                    if ((i11 & PKIFailureInfo.certRevoked) == 8192) {
                        this.f87709u = Collections.unmodifiableList(this.f87709u);
                    }
                    if ((i11 & 16384) == 16384) {
                        this.f87710v = Collections.unmodifiableList(this.f87710v);
                    }
                    if ((i11 & 128) == 128) {
                        this.f87702n = Collections.unmodifiableList(this.f87702n);
                    }
                    if ((i11 & 256) == 256) {
                        this.f87703o = Collections.unmodifiableList(this.f87703o);
                    }
                    if ((i11 & 262144) == 262144) {
                        this.A = Collections.unmodifiableList(this.A);
                    }
                    if ((i11 & PKIFailureInfo.signerNotTrusted) == 524288) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    if ((i11 & PKIFailureInfo.badCertTemplate) == 1048576) {
                        this.D = Collections.unmodifiableList(this.D);
                    }
                    if ((i11 & 4194304) == 4194304) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.f87691c = outputNewOutput.toByteString();
                    }
                    e();
                    return;
                }
            }
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Constructor f87738j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<ValueParameter> f87742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<Integer> f87743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f87744h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f87745i;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87746d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87747e = 6;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List<ValueParameter> f87748f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private List<Integer> f87749g;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f87748f = list;
                this.f87749g = list;
                k();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87746d & 2) != 2) {
                    this.f87748f = new ArrayList(this.f87748f);
                    this.f87746d |= 2;
                }
            }

            private void j() {
                if ((this.f87746d & 4) != 4) {
                    this.f87749g = new ArrayList(this.f87749g);
                    this.f87746d |= 4;
                }
            }

            private void k() {
            }

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i11 = (this.f87746d & 1) != 1 ? 0 : 1;
                constructor.f87741e = this.f87747e;
                if ((this.f87746d & 2) == 2) {
                    this.f87748f = Collections.unmodifiableList(this.f87748f);
                    this.f87746d &= -3;
                }
                constructor.f87742f = this.f87748f;
                if ((this.f87746d & 4) == 4) {
                    this.f87749g = Collections.unmodifiableList(this.f87749g);
                    this.f87746d &= -5;
                }
                constructor.f87743g = this.f87749g;
                constructor.f87740d = i11;
                return constructor;
            }

            public ValueParameter getValueParameter(int i11) {
                return this.f87748f.get(i11);
            }

            public int getValueParameterCount() {
                return this.f87748f.size();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getValueParameterCount(); i11++) {
                    if (!getValueParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                return e();
            }

            public Builder setFlags(int i11) {
                this.f87746d |= 1;
                this.f87747e = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(constructorBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.f87742f.isEmpty()) {
                    if (this.f87748f.isEmpty()) {
                        this.f87748f = constructor.f87742f;
                        this.f87746d &= -3;
                    } else {
                        i();
                        this.f87748f.addAll(constructor.f87742f);
                    }
                }
                if (!constructor.f87743g.isEmpty()) {
                    if (this.f87749g.isEmpty()) {
                        this.f87749g = constructor.f87743g;
                        this.f87746d &= -5;
                    } else {
                        j();
                        this.f87749g.addAll(constructor.f87743g);
                    }
                }
                f(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.f87739c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor partialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Constructor constructor2 = (Constructor) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (constructor != null) {
                        mergeFrom(constructor);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Constructor> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Constructor constructor = new Constructor(true);
            f87738j = constructor;
            constructor.t();
        }

        public static Constructor getDefaultInstance() {
            return f87738j;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        private void t() {
            this.f87741e = 6;
            List list = Collections.EMPTY_LIST;
            this.f87742f = list;
            this.f87743g = list;
        }

        public int getFlags() {
            return this.f87741e;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87745i;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87740d & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87741e) : 0;
            for (int i12 = 0; i12 < this.f87742f.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f87742f.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.f87743g.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f87743g.get(i13).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + j() + this.f87739c.size();
            this.f87745i = size;
            return size;
        }

        public ValueParameter getValueParameter(int i11) {
            return this.f87742f.get(i11);
        }

        public int getValueParameterCount() {
            return this.f87742f.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.f87742f;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f87743g;
        }

        public boolean hasFlags() {
            return (this.f87740d & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87744h;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getValueParameterCount(); i11++) {
                if (!getValueParameter(i11).isInitialized()) {
                    this.f87744h = (byte) 0;
                    return false;
                }
            }
            if (i()) {
                this.f87744h = (byte) 1;
                return true;
            }
            this.f87744h = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87740d & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87741e);
            }
            for (int i11 = 0; i11 < this.f87742f.size(); i11++) {
                codedOutputStream.writeMessage(2, this.f87742f.get(i11));
            }
            for (int i12 = 0; i12 < this.f87743g.size(); i12++) {
                codedOutputStream.writeInt32(31, this.f87743g.get(i12).intValue());
            }
            extensionWriterK.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87739c);
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return f87738j;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87744h = (byte) -1;
            this.f87745i = -1;
            this.f87739c = extendableBuilder.getUnknownFields();
        }

        private Constructor(boolean z11) {
            this.f87744h = (byte) -1;
            this.f87745i = -1;
            this.f87739c = ByteString.EMPTY;
        }

        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87744h = (byte) -1;
            this.f87745i = -1;
            t();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f87740d |= 1;
                                    this.f87741e = codedInputStream.readInt32();
                                } else if (tag == 18) {
                                    if ((i11 & 2) != 2) {
                                        this.f87742f = new ArrayList();
                                        i11 |= 2;
                                    }
                                    this.f87742f.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                } else if (tag == 248) {
                                    if ((i11 & 4) != 4) {
                                        this.f87743g = new ArrayList();
                                        i11 |= 4;
                                    }
                                    this.f87743g.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag != 250) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87743g = new ArrayList();
                                        i11 |= 4;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f87743g.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 2) == 2) {
                        this.f87742f = Collections.unmodifiableList(this.f87742f);
                    }
                    if ((i11 & 4) == 4) {
                        this.f87743g = Collections.unmodifiableList(this.f87743g);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87739c = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if ((i11 & 2) == 2) {
                this.f87742f = Collections.unmodifiableList(this.f87742f);
            }
            if ((i11 & 4) == 4) {
                this.f87743g = Collections.unmodifiableList(this.f87743g);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87739c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Contract f87750f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f87751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Effect> f87752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f87753d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87754e;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f87755b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<Effect> f87756c = Collections.EMPTY_LIST;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f87755b & 1) != 1) {
                    this.f87756c = new ArrayList(this.f87756c);
                    this.f87755b |= 1;
                }
            }

            private void e() {
            }

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.f87755b & 1) == 1) {
                    this.f87756c = Collections.unmodifiableList(this.f87756c);
                    this.f87755b &= -2;
                }
                contract.f87752c = this.f87756c;
                return contract;
            }

            public Effect getEffect(int i11) {
                return this.f87756c.get(i11);
            }

            public int getEffectCount() {
                return this.f87756c.size();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getEffectCount(); i11++) {
                    if (!getEffect(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(contractBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.f87752c.isEmpty()) {
                    if (this.f87756c.isEmpty()) {
                        this.f87756c = contract.f87752c;
                        this.f87755b &= -2;
                    } else {
                        d();
                        this.f87756c.addAll(contract.f87752c);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.f87751b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract partialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Contract contract2 = (Contract) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (contract != null) {
                        mergeFrom(contract);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Contract> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Contract contract = new Contract(true);
            f87750f = contract;
            contract.k();
        }

        public static Contract getDefaultInstance() {
            return f87750f;
        }

        private void k() {
            this.f87752c = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public Effect getEffect(int i11) {
            return this.f87752c.get(i11);
        }

        public int getEffectCount() {
            return this.f87752c.size();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87754e;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.f87752c.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f87752c.get(i12));
            }
            int size = iComputeMessageSize + this.f87751b.size();
            this.f87754e = size;
            return size;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87753d;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getEffectCount(); i11++) {
                if (!getEffect(i11).isInitialized()) {
                    this.f87753d = (byte) 0;
                    return false;
                }
            }
            this.f87753d = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f87752c.size(); i11++) {
                codedOutputStream.writeMessage(1, this.f87752c.get(i11));
            }
            codedOutputStream.writeRawBytes(this.f87751b);
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return f87750f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f87753d = (byte) -1;
            this.f87754e = -1;
            this.f87751b = builder.getUnknownFields();
        }

        private Contract(boolean z11) {
            this.f87753d = (byte) -1;
            this.f87754e = -1;
            this.f87751b = ByteString.EMPTY;
        }

        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87753d = (byte) -1;
            this.f87754e = -1;
            k();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.f87752c = new ArrayList();
                                        z12 = true;
                                    }
                                    this.f87752c.add((Effect) codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.f87752c = Collections.unmodifiableList(this.f87752c);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87751b = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (z12) {
                this.f87752c = Collections.unmodifiableList(this.f87752c);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87751b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final Effect f87757j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f87758b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f87759c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EffectType f87760d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Expression> f87761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Expression f87762f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private InvocationKind f87763g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f87764h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f87765i;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f87766b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private EffectType f87767c = EffectType.RETURNS_CONSTANT;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Expression> f87768d = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Expression f87769e = Expression.getDefaultInstance();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private InvocationKind f87770f = InvocationKind.AT_MOST_ONCE;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f87766b & 2) != 2) {
                    this.f87768d = new ArrayList(this.f87768d);
                    this.f87766b |= 2;
                }
            }

            private void e() {
            }

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i11 = this.f87766b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                effect.f87760d = this.f87767c;
                if ((this.f87766b & 2) == 2) {
                    this.f87768d = Collections.unmodifiableList(this.f87768d);
                    this.f87766b &= -3;
                }
                effect.f87761e = this.f87768d;
                if ((i11 & 4) == 4) {
                    i12 |= 2;
                }
                effect.f87762f = this.f87769e;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                effect.f87763g = this.f87770f;
                effect.f87759c = i12;
                return effect;
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.f87769e;
            }

            public Expression getEffectConstructorArgument(int i11) {
                return this.f87768d.get(i11);
            }

            public int getEffectConstructorArgumentCount() {
                return this.f87768d.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.f87766b & 4) == 4;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getEffectConstructorArgumentCount(); i11++) {
                    if (!getEffectConstructorArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.f87766b & 4) != 4 || this.f87769e == Expression.getDefaultInstance()) {
                    this.f87769e = expression;
                } else {
                    this.f87769e = Expression.newBuilder(this.f87769e).mergeFrom(expression).buildPartial();
                }
                this.f87766b |= 4;
                return this;
            }

            public Builder setEffectType(EffectType effectType) {
                effectType.getClass();
                this.f87766b |= 1;
                this.f87767c = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f87766b |= 8;
                this.f87770f = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(effectBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.f87761e.isEmpty()) {
                    if (this.f87768d.isEmpty()) {
                        this.f87768d = effect.f87761e;
                        this.f87766b &= -3;
                    } else {
                        d();
                        this.f87768d.addAll(effect.f87761e);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.f87758b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect partialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Effect effect2 = (Effect) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (effect != null) {
                        mergeFrom(effect);
                    }
                    throw th;
                }
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<EffectType> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EffectType findValueByNumber(int i11) {
                    return EffectType.valueOf(i11);
                }
            }

            EffectType(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i11) {
                if (i11 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i11 == 1) {
                    return CALLS;
                }
                if (i11 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<InvocationKind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public InvocationKind findValueByNumber(int i11) {
                    return InvocationKind.valueOf(i11);
                }
            }

            InvocationKind(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i11) {
                if (i11 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i11 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i11 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        static class a extends AbstractParser<Effect> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Effect effect = new Effect(true);
            f87757j = effect;
            effect.o();
        }

        public static Effect getDefaultInstance() {
            return f87757j;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        private void o() {
            this.f87760d = EffectType.RETURNS_CONSTANT;
            this.f87761e = Collections.EMPTY_LIST;
            this.f87762f = Expression.getDefaultInstance();
            this.f87763g = InvocationKind.AT_MOST_ONCE;
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.f87762f;
        }

        public Expression getEffectConstructorArgument(int i11) {
            return this.f87761e.get(i11);
        }

        public int getEffectConstructorArgumentCount() {
            return this.f87761e.size();
        }

        public EffectType getEffectType() {
            return this.f87760d;
        }

        public InvocationKind getKind() {
            return this.f87763g;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87765i;
            if (i11 != -1) {
                return i11;
            }
            int iComputeEnumSize = (this.f87759c & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f87760d.getNumber()) : 0;
            for (int i12 = 0; i12 < this.f87761e.size(); i12++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.f87761e.get(i12));
            }
            if ((this.f87759c & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.f87762f);
            }
            if ((this.f87759c & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.f87763g.getNumber());
            }
            int size = iComputeEnumSize + this.f87758b.size();
            this.f87765i = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.f87759c & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.f87759c & 1) == 1;
        }

        public boolean hasKind() {
            return (this.f87759c & 4) == 4;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87764h;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getEffectConstructorArgumentCount(); i11++) {
                if (!getEffectConstructorArgument(i11).isInitialized()) {
                    this.f87764h = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.f87764h = (byte) 1;
                return true;
            }
            this.f87764h = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f87759c & 1) == 1) {
                codedOutputStream.writeEnum(1, this.f87760d.getNumber());
            }
            for (int i11 = 0; i11 < this.f87761e.size(); i11++) {
                codedOutputStream.writeMessage(2, this.f87761e.get(i11));
            }
            if ((this.f87759c & 2) == 2) {
                codedOutputStream.writeMessage(3, this.f87762f);
            }
            if ((this.f87759c & 4) == 4) {
                codedOutputStream.writeEnum(4, this.f87763g.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f87758b);
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return f87757j;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f87764h = (byte) -1;
            this.f87765i = -1;
            this.f87758b = builder.getUnknownFields();
        }

        private Effect(boolean z11) {
            this.f87764h = (byte) -1;
            this.f87765i = -1;
            this.f87758b = ByteString.EMPTY;
        }

        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87764h = (byte) -1;
            this.f87765i = -1;
            o();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i11 = codedInputStream.readEnum();
                                EffectType effectTypeValueOf = EffectType.valueOf(i11);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f87759c |= 1;
                                    this.f87760d = effectTypeValueOf;
                                }
                            } else if (tag == 18) {
                                if ((c11 & 2) != 2) {
                                    this.f87761e = new ArrayList();
                                    c11 = 2;
                                }
                                this.f87761e.add((Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                            } else if (tag == 26) {
                                Expression.Builder builder = (this.f87759c & 2) == 2 ? this.f87762f.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                this.f87762f = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.f87762f = builder.buildPartial();
                                }
                                this.f87759c |= 2;
                            } else if (tag != 32) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i12 = codedInputStream.readEnum();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(i12);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.f87759c |= 4;
                                    this.f87763g = invocationKindValueOf;
                                }
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.f87761e = Collections.unmodifiableList(this.f87761e);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87758b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.f87761e = Collections.unmodifiableList(this.f87761e);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87758b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final EnumEntry f87771h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f87775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87776g;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87777d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87778e;

            private Builder() {
                i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
            }

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i11 = (this.f87777d & 1) != 1 ? 0 : 1;
                enumEntry.f87774e = this.f87778e;
                enumEntry.f87773d = i11;
                return enumEntry;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return e();
            }

            public Builder setName(int i11) {
                this.f87777d |= 1;
                this.f87778e = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(enumEntryBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                f(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.f87772c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry partialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        EnumEntry enumEntry2 = (EnumEntry) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (enumEntry != null) {
                        mergeFrom(enumEntry);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<EnumEntry> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            f87771h = enumEntry;
            enumEntry.p();
        }

        public static EnumEntry getDefaultInstance() {
            return f87771h;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        private void p() {
            this.f87774e = 0;
        }

        public int getName() {
            return this.f87774e;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87776g;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = ((this.f87773d & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87774e) : 0) + j() + this.f87772c.size();
            this.f87776g = iComputeInt32Size;
            return iComputeInt32Size;
        }

        public boolean hasName() {
            return (this.f87773d & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87775f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (i()) {
                this.f87775f = (byte) 1;
                return true;
            }
            this.f87775f = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87773d & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87774e);
            }
            extensionWriterK.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87772c);
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return f87771h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87775f = (byte) -1;
            this.f87776g = -1;
            this.f87772c = extendableBuilder.getUnknownFields();
        }

        private EnumEntry(boolean z11) {
            this.f87775f = (byte) -1;
            this.f87776g = -1;
            this.f87772c = ByteString.EMPTY;
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87775f = (byte) -1;
            this.f87776g = -1;
            p();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 8) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f87773d |= 1;
                                    this.f87774e = codedInputStream.readInt32();
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87772c = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87772c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Expression f87779m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f87780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f87781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ConstantValue f87784f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Type f87785g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f87786h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<Expression> f87787i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Expression> f87788j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private byte f87789k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f87790l;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f87791b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f87792c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87793d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private ConstantValue f87794e = ConstantValue.TRUE;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Type f87795f = Type.getDefaultInstance();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f87796g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<Expression> f87797h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<Expression> f87798i;

            private Builder() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.f87797h = list;
                this.f87798i = list;
                f();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f87791b & 32) != 32) {
                    this.f87797h = new ArrayList(this.f87797h);
                    this.f87791b |= 32;
                }
            }

            private void e() {
                if ((this.f87791b & 64) != 64) {
                    this.f87798i = new ArrayList(this.f87798i);
                    this.f87791b |= 64;
                }
            }

            private void f() {
            }

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i11 = this.f87791b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                expression.f87782d = this.f87792c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                expression.f87783e = this.f87793d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                expression.f87784f = this.f87794e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                expression.f87785g = this.f87795f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                expression.f87786h = this.f87796g;
                if ((this.f87791b & 32) == 32) {
                    this.f87797h = Collections.unmodifiableList(this.f87797h);
                    this.f87791b &= -33;
                }
                expression.f87787i = this.f87797h;
                if ((this.f87791b & 64) == 64) {
                    this.f87798i = Collections.unmodifiableList(this.f87798i);
                    this.f87791b &= -65;
                }
                expression.f87788j = this.f87798i;
                expression.f87781c = i12;
                return expression;
            }

            public Expression getAndArgument(int i11) {
                return this.f87797h.get(i11);
            }

            public int getAndArgumentCount() {
                return this.f87797h.size();
            }

            public Type getIsInstanceType() {
                return this.f87795f;
            }

            public Expression getOrArgument(int i11) {
                return this.f87798i.get(i11);
            }

            public int getOrArgumentCount() {
                return this.f87798i.size();
            }

            public boolean hasIsInstanceType() {
                return (this.f87791b & 8) == 8;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getAndArgumentCount(); i11++) {
                    if (!getAndArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getOrArgumentCount(); i12++) {
                    if (!getOrArgument(i12).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.f87791b & 8) != 8 || this.f87795f == Type.getDefaultInstance()) {
                    this.f87795f = type;
                } else {
                    this.f87795f = Type.newBuilder(this.f87795f).mergeFrom(type).buildPartial();
                }
                this.f87791b |= 8;
                return this;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                constantValue.getClass();
                this.f87791b |= 4;
                this.f87794e = constantValue;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f87791b |= 1;
                this.f87792c = i11;
                return this;
            }

            public Builder setIsInstanceTypeId(int i11) {
                this.f87791b |= 16;
                this.f87796g = i11;
                return this;
            }

            public Builder setValueParameterReference(int i11) {
                this.f87791b |= 2;
                this.f87793d = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(expressionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.f87787i.isEmpty()) {
                    if (this.f87797h.isEmpty()) {
                        this.f87797h = expression.f87787i;
                        this.f87791b &= -33;
                    } else {
                        d();
                        this.f87797h.addAll(expression.f87787i);
                    }
                }
                if (!expression.f87788j.isEmpty()) {
                    if (this.f87798i.isEmpty()) {
                        this.f87798i = expression.f87788j;
                        this.f87791b &= -65;
                    } else {
                        e();
                        this.f87798i.addAll(expression.f87788j);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.f87780b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression partialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Expression expression2 = (Expression) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (expression != null) {
                        mergeFrom(expression);
                    }
                    throw th;
                }
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<ConstantValue> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ConstantValue findValueByNumber(int i11) {
                    return ConstantValue.valueOf(i11);
                }
            }

            ConstantValue(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i11) {
                if (i11 == 0) {
                    return TRUE;
                }
                if (i11 == 1) {
                    return FALSE;
                }
                if (i11 != 2) {
                    return null;
                }
                return NULL;
            }
        }

        static class a extends AbstractParser<Expression> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Expression expression = new Expression(true);
            f87779m = expression;
            expression.s();
        }

        public static Expression getDefaultInstance() {
            return f87779m;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        private void s() {
            this.f87782d = 0;
            this.f87783e = 0;
            this.f87784f = ConstantValue.TRUE;
            this.f87785g = Type.getDefaultInstance();
            this.f87786h = 0;
            List<Expression> list = Collections.EMPTY_LIST;
            this.f87787i = list;
            this.f87788j = list;
        }

        public Expression getAndArgument(int i11) {
            return this.f87787i.get(i11);
        }

        public int getAndArgumentCount() {
            return this.f87787i.size();
        }

        public ConstantValue getConstantValue() {
            return this.f87784f;
        }

        public int getFlags() {
            return this.f87782d;
        }

        public Type getIsInstanceType() {
            return this.f87785g;
        }

        public int getIsInstanceTypeId() {
            return this.f87786h;
        }

        public Expression getOrArgument(int i11) {
            return this.f87788j.get(i11);
        }

        public int getOrArgumentCount() {
            return this.f87788j.size();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87790l;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87781c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87782d) : 0;
            if ((this.f87781c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f87783e);
            }
            if ((this.f87781c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f87784f.getNumber());
            }
            if ((this.f87781c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f87785g);
            }
            if ((this.f87781c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f87786h);
            }
            for (int i12 = 0; i12 < this.f87787i.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f87787i.get(i12));
            }
            for (int i13 = 0; i13 < this.f87788j.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, this.f87788j.get(i13));
            }
            int size = iComputeInt32Size + this.f87780b.size();
            this.f87790l = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.f87783e;
        }

        public boolean hasConstantValue() {
            return (this.f87781c & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f87781c & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.f87781c & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.f87781c & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.f87781c & 2) == 2;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87789k;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.f87789k = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getAndArgumentCount(); i11++) {
                if (!getAndArgument(i11).isInitialized()) {
                    this.f87789k = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getOrArgumentCount(); i12++) {
                if (!getOrArgument(i12).isInitialized()) {
                    this.f87789k = (byte) 0;
                    return false;
                }
            }
            this.f87789k = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f87781c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87782d);
            }
            if ((this.f87781c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f87783e);
            }
            if ((this.f87781c & 4) == 4) {
                codedOutputStream.writeEnum(3, this.f87784f.getNumber());
            }
            if ((this.f87781c & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f87785g);
            }
            if ((this.f87781c & 16) == 16) {
                codedOutputStream.writeInt32(5, this.f87786h);
            }
            for (int i11 = 0; i11 < this.f87787i.size(); i11++) {
                codedOutputStream.writeMessage(6, this.f87787i.get(i11));
            }
            for (int i12 = 0; i12 < this.f87788j.size(); i12++) {
                codedOutputStream.writeMessage(7, this.f87788j.get(i12));
            }
            codedOutputStream.writeRawBytes(this.f87780b);
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return f87779m;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f87789k = (byte) -1;
            this.f87790l = -1;
            this.f87780b = builder.getUnknownFields();
        }

        private Expression(boolean z11) {
            this.f87789k = (byte) -1;
            this.f87790l = -1;
            this.f87780b = ByteString.EMPTY;
        }

        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87789k = (byte) -1;
            this.f87790l = -1;
            s();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f87781c |= 1;
                                this.f87782d = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f87781c |= 2;
                                this.f87783e = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i12 = codedInputStream.readEnum();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(i12);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.f87781c |= 4;
                                    this.f87784f = constantValueValueOf;
                                }
                            } else if (tag == 34) {
                                Type.Builder builder = (this.f87781c & 8) == 8 ? this.f87785g.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87785g = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f87785g = builder.buildPartial();
                                }
                                this.f87781c |= 8;
                            } else if (tag == 40) {
                                this.f87781c |= 16;
                                this.f87786h = codedInputStream.readInt32();
                            } else if (tag == 50) {
                                if ((i11 & 32) != 32) {
                                    this.f87787i = new ArrayList();
                                    i11 |= 32;
                                }
                                this.f87787i.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag != 58) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i11 & 64) != 64) {
                                    this.f87788j = new ArrayList();
                                    i11 |= 64;
                                }
                                this.f87788j.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((i11 & 32) == 32) {
                            this.f87787i = Collections.unmodifiableList(this.f87787i);
                        }
                        if ((i11 & 64) == 64) {
                            this.f87788j = Collections.unmodifiableList(this.f87788j);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87780b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i11 & 32) == 32) {
                this.f87787i = Collections.unmodifiableList(this.f87787i);
            }
            if ((i11 & 64) == 64) {
                this.f87788j = Collections.unmodifiableList(this.f87788j);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87780b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new a();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final Function f87799v;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f87803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Type f87805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f87806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<TypeParameter> f87807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Type f87808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f87809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<Type> f87810m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Integer> f87811n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f87812o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<ValueParameter> f87813p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private TypeTable f87814q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<Integer> f87815r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Contract f87816s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private byte f87817t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f87818u;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87819d;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f87822g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f87824i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<TypeParameter> f87825j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Type f87826k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f87827l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<Type> f87828m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Integer> f87829n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private List<ValueParameter> f87830o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private TypeTable f87831p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private List<Integer> f87832q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private Contract f87833r;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87820e = 6;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f87821f = 6;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Type f87823h = Type.getDefaultInstance();

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f87825j = list;
                this.f87826k = Type.getDefaultInstance();
                this.f87828m = list;
                this.f87829n = list;
                this.f87830o = list;
                this.f87831p = TypeTable.getDefaultInstance();
                this.f87832q = list;
                this.f87833r = Contract.getDefaultInstance();
                n();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87819d & 512) != 512) {
                    this.f87829n = new ArrayList(this.f87829n);
                    this.f87819d |= 512;
                }
            }

            private void j() {
                if ((this.f87819d & 256) != 256) {
                    this.f87828m = new ArrayList(this.f87828m);
                    this.f87819d |= 256;
                }
            }

            private void k() {
                if ((this.f87819d & 32) != 32) {
                    this.f87825j = new ArrayList(this.f87825j);
                    this.f87819d |= 32;
                }
            }

            private void l() {
                if ((this.f87819d & 1024) != 1024) {
                    this.f87830o = new ArrayList(this.f87830o);
                    this.f87819d |= 1024;
                }
            }

            private void m() {
                if ((this.f87819d & 4096) != 4096) {
                    this.f87832q = new ArrayList(this.f87832q);
                    this.f87819d |= 4096;
                }
            }

            private void n() {
            }

            public Function buildPartial() {
                Function function = new Function(this);
                int i11 = this.f87819d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                function.f87802e = this.f87820e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                function.f87803f = this.f87821f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                function.f87804g = this.f87822g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                function.f87805h = this.f87823h;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                function.f87806i = this.f87824i;
                if ((this.f87819d & 32) == 32) {
                    this.f87825j = Collections.unmodifiableList(this.f87825j);
                    this.f87819d &= -33;
                }
                function.f87807j = this.f87825j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                function.f87808k = this.f87826k;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                function.f87809l = this.f87827l;
                if ((this.f87819d & 256) == 256) {
                    this.f87828m = Collections.unmodifiableList(this.f87828m);
                    this.f87819d &= -257;
                }
                function.f87810m = this.f87828m;
                if ((this.f87819d & 512) == 512) {
                    this.f87829n = Collections.unmodifiableList(this.f87829n);
                    this.f87819d &= -513;
                }
                function.f87811n = this.f87829n;
                if ((this.f87819d & 1024) == 1024) {
                    this.f87830o = Collections.unmodifiableList(this.f87830o);
                    this.f87819d &= -1025;
                }
                function.f87813p = this.f87830o;
                if ((i11 & 2048) == 2048) {
                    i12 |= 128;
                }
                function.f87814q = this.f87831p;
                if ((this.f87819d & 4096) == 4096) {
                    this.f87832q = Collections.unmodifiableList(this.f87832q);
                    this.f87819d &= -4097;
                }
                function.f87815r = this.f87832q;
                if ((i11 & PKIFailureInfo.certRevoked) == 8192) {
                    i12 |= 256;
                }
                function.f87816s = this.f87833r;
                function.f87801d = i12;
                return function;
            }

            public Type getContextReceiverType(int i11) {
                return this.f87828m.get(i11);
            }

            public int getContextReceiverTypeCount() {
                return this.f87828m.size();
            }

            public Contract getContract() {
                return this.f87833r;
            }

            public Type getReceiverType() {
                return this.f87826k;
            }

            public Type getReturnType() {
                return this.f87823h;
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.f87825j.get(i11);
            }

            public int getTypeParameterCount() {
                return this.f87825j.size();
            }

            public TypeTable getTypeTable() {
                return this.f87831p;
            }

            public ValueParameter getValueParameter(int i11) {
                return this.f87830o.get(i11);
            }

            public int getValueParameterCount() {
                return this.f87830o.size();
            }

            public boolean hasContract() {
                return (this.f87819d & PKIFailureInfo.certRevoked) == 8192;
            }

            public boolean hasName() {
                return (this.f87819d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.f87819d & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.f87819d & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.f87819d & 2048) == 2048;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                    if (!getContextReceiverType(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getValueParameterCount(); i13++) {
                    if (!getValueParameter(i13).isInitialized()) {
                        return false;
                    }
                }
                if (!hasTypeTable() || getTypeTable().isInitialized()) {
                    return (!hasContract() || getContract().isInitialized()) && e();
                }
                return false;
            }

            public Builder mergeContract(Contract contract) {
                if ((this.f87819d & PKIFailureInfo.certRevoked) != 8192 || this.f87833r == Contract.getDefaultInstance()) {
                    this.f87833r = contract;
                } else {
                    this.f87833r = Contract.newBuilder(this.f87833r).mergeFrom(contract).buildPartial();
                }
                this.f87819d |= PKIFailureInfo.certRevoked;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.f87819d & 64) != 64 || this.f87826k == Type.getDefaultInstance()) {
                    this.f87826k = type;
                } else {
                    this.f87826k = Type.newBuilder(this.f87826k).mergeFrom(type).buildPartial();
                }
                this.f87819d |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.f87819d & 8) != 8 || this.f87823h == Type.getDefaultInstance()) {
                    this.f87823h = type;
                } else {
                    this.f87823h = Type.newBuilder(this.f87823h).mergeFrom(type).buildPartial();
                }
                this.f87819d |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f87819d & 2048) != 2048 || this.f87831p == TypeTable.getDefaultInstance()) {
                    this.f87831p = typeTable;
                } else {
                    this.f87831p = TypeTable.newBuilder(this.f87831p).mergeFrom(typeTable).buildPartial();
                }
                this.f87819d |= 2048;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f87819d |= 1;
                this.f87820e = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f87819d |= 4;
                this.f87822g = i11;
                return this;
            }

            public Builder setOldFlags(int i11) {
                this.f87819d |= 2;
                this.f87821f = i11;
                return this;
            }

            public Builder setReceiverTypeId(int i11) {
                this.f87819d |= 128;
                this.f87827l = i11;
                return this;
            }

            public Builder setReturnTypeId(int i11) {
                this.f87819d |= 16;
                this.f87824i = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(functionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.f87807j.isEmpty()) {
                    if (this.f87825j.isEmpty()) {
                        this.f87825j = function.f87807j;
                        this.f87819d &= -33;
                    } else {
                        k();
                        this.f87825j.addAll(function.f87807j);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.f87810m.isEmpty()) {
                    if (this.f87828m.isEmpty()) {
                        this.f87828m = function.f87810m;
                        this.f87819d &= -257;
                    } else {
                        j();
                        this.f87828m.addAll(function.f87810m);
                    }
                }
                if (!function.f87811n.isEmpty()) {
                    if (this.f87829n.isEmpty()) {
                        this.f87829n = function.f87811n;
                        this.f87819d &= -513;
                    } else {
                        i();
                        this.f87829n.addAll(function.f87811n);
                    }
                }
                if (!function.f87813p.isEmpty()) {
                    if (this.f87830o.isEmpty()) {
                        this.f87830o = function.f87813p;
                        this.f87819d &= -1025;
                    } else {
                        l();
                        this.f87830o.addAll(function.f87813p);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.f87815r.isEmpty()) {
                    if (this.f87832q.isEmpty()) {
                        this.f87832q = function.f87815r;
                        this.f87819d &= -4097;
                    } else {
                        m();
                        this.f87832q.addAll(function.f87815r);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                f(function);
                setUnknownFields(getUnknownFields().concat(function.f87800c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function partialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Function function2 = (Function) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (function != null) {
                        mergeFrom(function);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Function> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Function function = new Function(true);
            f87799v = function;
            function.H();
        }

        private void H() {
            this.f87802e = 6;
            this.f87803f = 6;
            this.f87804g = 0;
            this.f87805h = Type.getDefaultInstance();
            this.f87806i = 0;
            List list = Collections.EMPTY_LIST;
            this.f87807j = list;
            this.f87808k = Type.getDefaultInstance();
            this.f87809l = 0;
            this.f87810m = list;
            this.f87811n = list;
            this.f87813p = list;
            this.f87814q = TypeTable.getDefaultInstance();
            this.f87815r = list;
            this.f87816s = Contract.getDefaultInstance();
        }

        public static Function getDefaultInstance() {
            return f87799v;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Type getContextReceiverType(int i11) {
            return this.f87810m.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.f87810m.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f87811n;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f87810m;
        }

        public Contract getContract() {
            return this.f87816s;
        }

        public int getFlags() {
            return this.f87802e;
        }

        public int getName() {
            return this.f87804g;
        }

        public int getOldFlags() {
            return this.f87803f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f87808k;
        }

        public int getReceiverTypeId() {
            return this.f87809l;
        }

        public Type getReturnType() {
            return this.f87805h;
        }

        public int getReturnTypeId() {
            return this.f87806i;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87818u;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87801d & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.f87803f) : 0;
            if ((this.f87801d & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f87804g);
            }
            if ((this.f87801d & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f87805h);
            }
            for (int i12 = 0; i12 < this.f87807j.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f87807j.get(i12));
            }
            if ((this.f87801d & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f87808k);
            }
            for (int i13 = 0; i13 < this.f87813p.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f87813p.get(i13));
            }
            if ((this.f87801d & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f87806i);
            }
            if ((this.f87801d & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f87809l);
            }
            if ((this.f87801d & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f87802e);
            }
            for (int i14 = 0; i14 < this.f87810m.size(); i14++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.f87810m.get(i14));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i15 = 0; i15 < this.f87811n.size(); i15++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f87811n.get(i15).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f87812o = iComputeInt32SizeNoTag;
            if ((this.f87801d & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.f87814q);
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i16 = 0; i16 < this.f87815r.size(); i16++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.f87815r.get(i16).intValue());
            }
            int size = iComputeMessageSize + iComputeInt32SizeNoTag2 + (getVersionRequirementList().size() * 2);
            if ((this.f87801d & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.f87816s);
            }
            int iJ = size + j() + this.f87800c.size();
            this.f87818u = iJ;
            return iJ;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.f87807j.get(i11);
        }

        public int getTypeParameterCount() {
            return this.f87807j.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f87807j;
        }

        public TypeTable getTypeTable() {
            return this.f87814q;
        }

        public ValueParameter getValueParameter(int i11) {
            return this.f87813p.get(i11);
        }

        public int getValueParameterCount() {
            return this.f87813p.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.f87813p;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f87815r;
        }

        public boolean hasContract() {
            return (this.f87801d & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.f87801d & 1) == 1;
        }

        public boolean hasName() {
            return (this.f87801d & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f87801d & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f87801d & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f87801d & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f87801d & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f87801d & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.f87801d & 128) == 128;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87817t;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f87817t = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.f87817t = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.f87817t = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.f87817t = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.f87817t = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getValueParameterCount(); i13++) {
                if (!getValueParameter(i13).isInitialized()) {
                    this.f87817t = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f87817t = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.f87817t = (byte) 0;
                return false;
            }
            if (i()) {
                this.f87817t = (byte) 1;
                return true;
            }
            this.f87817t = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87801d & 2) == 2) {
                codedOutputStream.writeInt32(1, this.f87803f);
            }
            if ((this.f87801d & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f87804g);
            }
            if ((this.f87801d & 8) == 8) {
                codedOutputStream.writeMessage(3, this.f87805h);
            }
            for (int i11 = 0; i11 < this.f87807j.size(); i11++) {
                codedOutputStream.writeMessage(4, this.f87807j.get(i11));
            }
            if ((this.f87801d & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f87808k);
            }
            for (int i12 = 0; i12 < this.f87813p.size(); i12++) {
                codedOutputStream.writeMessage(6, this.f87813p.get(i12));
            }
            if ((this.f87801d & 16) == 16) {
                codedOutputStream.writeInt32(7, this.f87806i);
            }
            if ((this.f87801d & 64) == 64) {
                codedOutputStream.writeInt32(8, this.f87809l);
            }
            if ((this.f87801d & 1) == 1) {
                codedOutputStream.writeInt32(9, this.f87802e);
            }
            for (int i13 = 0; i13 < this.f87810m.size(); i13++) {
                codedOutputStream.writeMessage(10, this.f87810m.get(i13));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.f87812o);
            }
            for (int i14 = 0; i14 < this.f87811n.size(); i14++) {
                codedOutputStream.writeInt32NoTag(this.f87811n.get(i14).intValue());
            }
            if ((this.f87801d & 128) == 128) {
                codedOutputStream.writeMessage(30, this.f87814q);
            }
            for (int i15 = 0; i15 < this.f87815r.size(); i15++) {
                codedOutputStream.writeInt32(31, this.f87815r.get(i15).intValue());
            }
            if ((this.f87801d & 256) == 256) {
                codedOutputStream.writeMessage(32, this.f87816s);
            }
            extensionWriterK.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87800c);
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return f87799v;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87812o = -1;
            this.f87817t = (byte) -1;
            this.f87818u = -1;
            this.f87800c = extendableBuilder.getUnknownFields();
        }

        private Function(boolean z11) {
            this.f87812o = -1;
            this.f87817t = (byte) -1;
            this.f87818u = -1;
            this.f87800c = ByteString.EMPTY;
        }

        private Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87812o = -1;
            this.f87817t = (byte) -1;
            this.f87818u = -1;
            H();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f87801d |= 2;
                                this.f87803f = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f87801d |= 4;
                                this.f87804g = codedInputStream.readInt32();
                                continue;
                            case 26:
                                Type.Builder builder = (this.f87801d & 8) == 8 ? this.f87805h.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87805h = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f87805h = builder.buildPartial();
                                }
                                this.f87801d |= 8;
                                continue;
                            case 34:
                                int i12 = (i11 == true ? 1 : 0) & 32;
                                i11 = i11;
                                if (i12 != 32) {
                                    this.f87807j = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 32;
                                }
                                this.f87807j.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 42:
                                Type.Builder builder2 = (this.f87801d & 32) == 32 ? this.f87808k.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87808k = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.f87808k = builder2.buildPartial();
                                }
                                this.f87801d |= 32;
                                continue;
                            case 50:
                                int i13 = (i11 == true ? 1 : 0) & 1024;
                                i11 = i11;
                                if (i13 != 1024) {
                                    this.f87813p = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 1024;
                                }
                                this.f87813p.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 56:
                                this.f87801d |= 16;
                                this.f87806i = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f87801d |= 64;
                                this.f87809l = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f87801d |= 1;
                                this.f87802e = codedInputStream.readInt32();
                                continue;
                            case 82:
                                int i14 = (i11 == true ? 1 : 0) & 256;
                                i11 = i11;
                                if (i14 != 256) {
                                    this.f87810m = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 256;
                                }
                                this.f87810m.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                continue;
                            case 88:
                                int i15 = (i11 == true ? 1 : 0) & 512;
                                i11 = i11;
                                if (i15 != 512) {
                                    this.f87811n = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 512;
                                }
                                this.f87811n.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 90:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i16 = (i11 == true ? 1 : 0) & 512;
                                i11 = i11;
                                if (i16 != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i11 = i11;
                                    this.f87811n = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 512;
                                }
                                i11 = i11;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f87811n.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                                TypeTable.Builder builder3 = (this.f87801d & 128) == 128 ? this.f87814q.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.f87814q = typeTable;
                                if (builder3 != null) {
                                    builder3.mergeFrom(typeTable);
                                    this.f87814q = builder3.buildPartial();
                                }
                                this.f87801d |= 128;
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                int i17 = (i11 == true ? 1 : 0) & 4096;
                                i11 = i11;
                                if (i17 != 4096) {
                                    this.f87815r = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 4096;
                                }
                                this.f87815r.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i18 = (i11 == true ? 1 : 0) & 4096;
                                i11 = i11;
                                if (i18 != 4096 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i11 = i11;
                                    this.f87815r = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 4096;
                                }
                                i11 = i11;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f87815r.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            case SDK_ASSET_HEADER_BOLT_VALUE:
                                Contract.Builder builder4 = (this.f87801d & 256) == 256 ? this.f87816s.toBuilder() : null;
                                Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                this.f87816s = contract;
                                if (builder4 != null) {
                                    builder4.mergeFrom(contract);
                                    this.f87816s = builder4.buildPartial();
                                }
                                this.f87801d |= 256;
                                continue;
                            default:
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i11 == true ? 1 : 0) & 32) == 32) {
                        this.f87807j = Collections.unmodifiableList(this.f87807j);
                    }
                    if (((i11 == true ? 1 : 0) & 1024) == 1024) {
                        this.f87813p = Collections.unmodifiableList(this.f87813p);
                    }
                    if (((i11 == true ? 1 : 0) & 256) == 256) {
                        this.f87810m = Collections.unmodifiableList(this.f87810m);
                    }
                    if (((i11 == true ? 1 : 0) & 512) == 512) {
                        this.f87811n = Collections.unmodifiableList(this.f87811n);
                    }
                    if (((i11 == true ? 1 : 0) & 4096) == 4096) {
                        this.f87815r = Collections.unmodifiableList(this.f87815r);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87800c = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (((i11 == true ? 1 : 0) & 32) == 32) {
                this.f87807j = Collections.unmodifiableList(this.f87807j);
            }
            if (((i11 == true ? 1 : 0) & 1024) == 1024) {
                this.f87813p = Collections.unmodifiableList(this.f87813p);
            }
            if (((i11 == true ? 1 : 0) & 256) == 256) {
                this.f87810m = Collections.unmodifiableList(this.f87810m);
            }
            if (((i11 == true ? 1 : 0) & 512) == 512) {
                this.f87811n = Collections.unmodifiableList(this.f87811n);
            }
            if (((i11 == true ? 1 : 0) & 4096) == 4096) {
                this.f87815r = Collections.unmodifiableList(this.f87815r);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87800c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new a();
        private final int value;

        static class a implements Internal.EnumLiteMap<MemberKind> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberKind findValueByNumber(int i11) {
                return MemberKind.valueOf(i11);
            }
        }

        MemberKind(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i11) {
            if (i11 == 0) {
                return DECLARATION;
            }
            if (i11 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i11 == 2) {
                return DELEGATION;
            }
            if (i11 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static Internal.EnumLiteMap<Modality> internalValueMap = new a();
        private final int value;

        static class a implements Internal.EnumLiteMap<Modality> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Modality findValueByNumber(int i11) {
                return Modality.valueOf(i11);
            }
        }

        Modality(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i11) {
            if (i11 == 0) {
                return FINAL;
            }
            if (i11 == 1) {
                return OPEN;
            }
            if (i11 == 2) {
                return ABSTRACT;
            }
            if (i11 != 3) {
                return null;
            }
            return SEALED;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Package f87834l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Function> f87837e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<Property> f87838f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<TypeAlias> f87839g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private TypeTable f87840h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private VersionRequirementTable f87841i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f87842j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f87843k;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87844d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List<Function> f87845e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List<Property> f87846f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private List<TypeAlias> f87847g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private TypeTable f87848h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private VersionRequirementTable f87849i;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f87845e = list;
                this.f87846f = list;
                this.f87847g = list;
                this.f87848h = TypeTable.getDefaultInstance();
                this.f87849i = VersionRequirementTable.getDefaultInstance();
                l();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87844d & 1) != 1) {
                    this.f87845e = new ArrayList(this.f87845e);
                    this.f87844d |= 1;
                }
            }

            private void j() {
                if ((this.f87844d & 2) != 2) {
                    this.f87846f = new ArrayList(this.f87846f);
                    this.f87844d |= 2;
                }
            }

            private void k() {
                if ((this.f87844d & 4) != 4) {
                    this.f87847g = new ArrayList(this.f87847g);
                    this.f87844d |= 4;
                }
            }

            private void l() {
            }

            public Package buildPartial() {
                Package r11 = new Package(this);
                int i11 = this.f87844d;
                if ((i11 & 1) == 1) {
                    this.f87845e = Collections.unmodifiableList(this.f87845e);
                    this.f87844d &= -2;
                }
                r11.f87837e = this.f87845e;
                if ((this.f87844d & 2) == 2) {
                    this.f87846f = Collections.unmodifiableList(this.f87846f);
                    this.f87844d &= -3;
                }
                r11.f87838f = this.f87846f;
                if ((this.f87844d & 4) == 4) {
                    this.f87847g = Collections.unmodifiableList(this.f87847g);
                    this.f87844d &= -5;
                }
                r11.f87839g = this.f87847g;
                int i12 = (i11 & 8) != 8 ? 0 : 1;
                r11.f87840h = this.f87848h;
                if ((i11 & 16) == 16) {
                    i12 |= 2;
                }
                r11.f87841i = this.f87849i;
                r11.f87836d = i12;
                return r11;
            }

            public Function getFunction(int i11) {
                return this.f87845e.get(i11);
            }

            public int getFunctionCount() {
                return this.f87845e.size();
            }

            public Property getProperty(int i11) {
                return this.f87846f.get(i11);
            }

            public int getPropertyCount() {
                return this.f87846f.size();
            }

            public TypeAlias getTypeAlias(int i11) {
                return this.f87847g.get(i11);
            }

            public int getTypeAliasCount() {
                return this.f87847g.size();
            }

            public TypeTable getTypeTable() {
                return this.f87848h;
            }

            public boolean hasTypeTable() {
                return (this.f87844d & 8) == 8;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getFunctionCount(); i11++) {
                    if (!getFunction(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getPropertyCount(); i12++) {
                    if (!getProperty(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getTypeAliasCount(); i13++) {
                    if (!getTypeAlias(i13).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && e();
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f87844d & 8) != 8 || this.f87848h == TypeTable.getDefaultInstance()) {
                    this.f87848h = typeTable;
                } else {
                    this.f87848h = TypeTable.newBuilder(this.f87848h).mergeFrom(typeTable).buildPartial();
                }
                this.f87844d |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.f87844d & 16) != 16 || this.f87849i == VersionRequirementTable.getDefaultInstance()) {
                    this.f87849i = versionRequirementTable;
                } else {
                    this.f87849i = VersionRequirementTable.newBuilder(this.f87849i).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.f87844d |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(packageBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r11) {
                if (r11 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r11.f87837e.isEmpty()) {
                    if (this.f87845e.isEmpty()) {
                        this.f87845e = r11.f87837e;
                        this.f87844d &= -2;
                    } else {
                        i();
                        this.f87845e.addAll(r11.f87837e);
                    }
                }
                if (!r11.f87838f.isEmpty()) {
                    if (this.f87846f.isEmpty()) {
                        this.f87846f = r11.f87838f;
                        this.f87844d &= -3;
                    } else {
                        j();
                        this.f87846f.addAll(r11.f87838f);
                    }
                }
                if (!r11.f87839g.isEmpty()) {
                    if (this.f87847g.isEmpty()) {
                        this.f87847g = r11.f87839g;
                        this.f87844d &= -5;
                    } else {
                        k();
                        this.f87847g.addAll(r11.f87839g);
                    }
                }
                if (r11.hasTypeTable()) {
                    mergeTypeTable(r11.getTypeTable());
                }
                if (r11.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r11.getVersionRequirementTable());
                }
                f(r11);
                setUnknownFields(getUnknownFields().concat(r11.f87835c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r11 = null;
                try {
                    try {
                        Package partialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Package r12 = (Package) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = r12;
                            if (r11 != null) {
                                mergeFrom(r11);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r11 != null) {
                        mergeFrom(r11);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Package> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Package r11 = new Package(true);
            f87834l = r11;
            r11.w();
        }

        public static Package getDefaultInstance() {
            return f87834l;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        private void w() {
            List list = Collections.EMPTY_LIST;
            this.f87837e = list;
            this.f87838f = list;
            this.f87839g = list;
            this.f87840h = TypeTable.getDefaultInstance();
            this.f87841i = VersionRequirementTable.getDefaultInstance();
        }

        public Function getFunction(int i11) {
            return this.f87837e.get(i11);
        }

        public int getFunctionCount() {
            return this.f87837e.size();
        }

        public List<Function> getFunctionList() {
            return this.f87837e;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i11) {
            return this.f87838f.get(i11);
        }

        public int getPropertyCount() {
            return this.f87838f.size();
        }

        public List<Property> getPropertyList() {
            return this.f87838f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87843k;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.f87837e.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f87837e.get(i12));
            }
            for (int i13 = 0; i13 < this.f87838f.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f87838f.get(i13));
            }
            for (int i14 = 0; i14 < this.f87839g.size(); i14++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f87839g.get(i14));
            }
            if ((this.f87836d & 1) == 1) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.f87840h);
            }
            if ((this.f87836d & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(32, this.f87841i);
            }
            int iJ = iComputeMessageSize + j() + this.f87835c.size();
            this.f87843k = iJ;
            return iJ;
        }

        public TypeAlias getTypeAlias(int i11) {
            return this.f87839g.get(i11);
        }

        public int getTypeAliasCount() {
            return this.f87839g.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f87839g;
        }

        public TypeTable getTypeTable() {
            return this.f87840h;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.f87841i;
        }

        public boolean hasTypeTable() {
            return (this.f87836d & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f87836d & 2) == 2;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87842j;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getFunctionCount(); i11++) {
                if (!getFunction(i11).isInitialized()) {
                    this.f87842j = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getPropertyCount(); i12++) {
                if (!getProperty(i12).isInitialized()) {
                    this.f87842j = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getTypeAliasCount(); i13++) {
                if (!getTypeAlias(i13).isInitialized()) {
                    this.f87842j = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f87842j = (byte) 0;
                return false;
            }
            if (i()) {
                this.f87842j = (byte) 1;
                return true;
            }
            this.f87842j = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            for (int i11 = 0; i11 < this.f87837e.size(); i11++) {
                codedOutputStream.writeMessage(3, this.f87837e.get(i11));
            }
            for (int i12 = 0; i12 < this.f87838f.size(); i12++) {
                codedOutputStream.writeMessage(4, this.f87838f.get(i12));
            }
            for (int i13 = 0; i13 < this.f87839g.size(); i13++) {
                codedOutputStream.writeMessage(5, this.f87839g.get(i13));
            }
            if ((this.f87836d & 1) == 1) {
                codedOutputStream.writeMessage(30, this.f87840h);
            }
            if ((this.f87836d & 2) == 2) {
                codedOutputStream.writeMessage(32, this.f87841i);
            }
            extensionWriterK.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87835c);
        }

        public static Builder newBuilder(Package r11) {
            return newBuilder().mergeFrom(r11);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return f87834l;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87842j = (byte) -1;
            this.f87843k = -1;
            this.f87835c = extendableBuilder.getUnknownFields();
        }

        private Package(boolean z11) {
            this.f87842j = (byte) -1;
            this.f87843k = -1;
            this.f87835c = ByteString.EMPTY;
        }

        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87842j = (byte) -1;
            this.f87843k = -1;
            w();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 26) {
                                int i12 = (i11 == true ? 1 : 0) & 1;
                                i11 = i11;
                                if (i12 != 1) {
                                    this.f87837e = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 1;
                                }
                                this.f87837e.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                            } else if (tag == 34) {
                                int i13 = (i11 == true ? 1 : 0) & 2;
                                i11 = i11;
                                if (i13 != 2) {
                                    this.f87838f = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 2;
                                }
                                this.f87838f.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                            } else if (tag != 42) {
                                if (tag == 242) {
                                    TypeTable.Builder builder = (this.f87836d & 1) == 1 ? this.f87840h.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                    this.f87840h = typeTable;
                                    if (builder != null) {
                                        builder.mergeFrom(typeTable);
                                        this.f87840h = builder.buildPartial();
                                    }
                                    this.f87836d |= 1;
                                } else if (tag != 258) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    VersionRequirementTable.Builder builder2 = (this.f87836d & 2) == 2 ? this.f87841i.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                    this.f87841i = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(versionRequirementTable);
                                        this.f87841i = builder2.buildPartial();
                                    }
                                    this.f87836d |= 2;
                                }
                            } else {
                                int i14 = (i11 == true ? 1 : 0) & 4;
                                i11 = i11;
                                if (i14 != 4) {
                                    this.f87839g = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 4;
                                }
                                this.f87839g.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((i11 == true ? 1 : 0) & 1) == 1) {
                            this.f87837e = Collections.unmodifiableList(this.f87837e);
                        }
                        if (((i11 == true ? 1 : 0) & 2) == 2) {
                            this.f87838f = Collections.unmodifiableList(this.f87838f);
                        }
                        if (((i11 == true ? 1 : 0) & 4) == 4) {
                            this.f87839g = Collections.unmodifiableList(this.f87839g);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87835c = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((i11 == true ? 1 : 0) & 1) == 1) {
                this.f87837e = Collections.unmodifiableList(this.f87837e);
            }
            if (((i11 == true ? 1 : 0) & 2) == 2) {
                this.f87838f = Collections.unmodifiableList(this.f87838f);
            }
            if (((i11 == true ? 1 : 0) & 4) == 4) {
                this.f87839g = Collections.unmodifiableList(this.f87839g);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87835c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final PackageFragment f87850k;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private StringTable f87853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private QualifiedNameTable f87854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Package f87855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<Class> f87856h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f87857i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f87858j;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87859d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private StringTable f87860e = StringTable.getDefaultInstance();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private QualifiedNameTable f87861f = QualifiedNameTable.getDefaultInstance();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Package f87862g = Package.getDefaultInstance();

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<Class> f87863h = Collections.EMPTY_LIST;

            private Builder() {
                j();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87859d & 8) != 8) {
                    this.f87863h = new ArrayList(this.f87863h);
                    this.f87859d |= 8;
                }
            }

            private void j() {
            }

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i11 = this.f87859d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                packageFragment.f87853e = this.f87860e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                packageFragment.f87854f = this.f87861f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                packageFragment.f87855g = this.f87862g;
                if ((this.f87859d & 8) == 8) {
                    this.f87863h = Collections.unmodifiableList(this.f87863h);
                    this.f87859d &= -9;
                }
                packageFragment.f87856h = this.f87863h;
                packageFragment.f87852d = i12;
                return packageFragment;
            }

            public Class getClass_(int i11) {
                return this.f87863h.get(i11);
            }

            public int getClass_Count() {
                return this.f87863h.size();
            }

            public Package getPackage() {
                return this.f87862g;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.f87861f;
            }

            public boolean hasPackage() {
                return (this.f87859d & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.f87859d & 2) == 2;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getClass_Count(); i11++) {
                    if (!getClass_(i11).isInitialized()) {
                        return false;
                    }
                }
                return e();
            }

            public Builder mergePackage(Package r11) {
                if ((this.f87859d & 4) != 4 || this.f87862g == Package.getDefaultInstance()) {
                    this.f87862g = r11;
                } else {
                    this.f87862g = Package.newBuilder(this.f87862g).mergeFrom(r11).buildPartial();
                }
                this.f87859d |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.f87859d & 2) != 2 || this.f87861f == QualifiedNameTable.getDefaultInstance()) {
                    this.f87861f = qualifiedNameTable;
                } else {
                    this.f87861f = QualifiedNameTable.newBuilder(this.f87861f).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.f87859d |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.f87859d & 1) != 1 || this.f87860e == StringTable.getDefaultInstance()) {
                    this.f87860e = stringTable;
                } else {
                    this.f87860e = StringTable.newBuilder(this.f87860e).mergeFrom(stringTable).buildPartial();
                }
                this.f87859d |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(packageFragmentBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.f87856h.isEmpty()) {
                    if (this.f87863h.isEmpty()) {
                        this.f87863h = packageFragment.f87856h;
                        this.f87859d &= -9;
                    } else {
                        i();
                        this.f87863h.addAll(packageFragment.f87856h);
                    }
                }
                f(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.f87851c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment partialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        PackageFragment packageFragment2 = (PackageFragment) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (packageFragment != null) {
                        mergeFrom(packageFragment);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<PackageFragment> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            f87850k = packageFragment;
            packageFragment.t();
        }

        public static PackageFragment getDefaultInstance() {
            return f87850k;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        private void t() {
            this.f87853e = StringTable.getDefaultInstance();
            this.f87854f = QualifiedNameTable.getDefaultInstance();
            this.f87855g = Package.getDefaultInstance();
            this.f87856h = Collections.EMPTY_LIST;
        }

        public Class getClass_(int i11) {
            return this.f87856h.get(i11);
        }

        public int getClass_Count() {
            return this.f87856h.size();
        }

        public List<Class> getClass_List() {
            return this.f87856h;
        }

        public Package getPackage() {
            return this.f87855g;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.f87854f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87858j;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = (this.f87852d & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f87853e) : 0;
            if ((this.f87852d & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f87854f);
            }
            if ((this.f87852d & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f87855g);
            }
            for (int i12 = 0; i12 < this.f87856h.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f87856h.get(i12));
            }
            int iJ = iComputeMessageSize + j() + this.f87851c.size();
            this.f87858j = iJ;
            return iJ;
        }

        public StringTable getStrings() {
            return this.f87853e;
        }

        public boolean hasPackage() {
            return (this.f87852d & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.f87852d & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.f87852d & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87857i;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.f87857i = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.f87857i = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getClass_Count(); i11++) {
                if (!getClass_(i11).isInitialized()) {
                    this.f87857i = (byte) 0;
                    return false;
                }
            }
            if (i()) {
                this.f87857i = (byte) 1;
                return true;
            }
            this.f87857i = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87852d & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f87853e);
            }
            if ((this.f87852d & 2) == 2) {
                codedOutputStream.writeMessage(2, this.f87854f);
            }
            if ((this.f87852d & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f87855g);
            }
            for (int i11 = 0; i11 < this.f87856h.size(); i11++) {
                codedOutputStream.writeMessage(4, this.f87856h.get(i11));
            }
            extensionWriterK.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87851c);
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return f87850k;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87857i = (byte) -1;
            this.f87858j = -1;
            this.f87851c = extendableBuilder.getUnknownFields();
        }

        private PackageFragment(boolean z11) {
            this.f87857i = (byte) -1;
            this.f87858j = -1;
            this.f87851c = ByteString.EMPTY;
        }

        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87857i = (byte) -1;
            this.f87858j = -1;
            t();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                StringTable.Builder builder = (this.f87852d & 1) == 1 ? this.f87853e.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                this.f87853e = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.f87853e = builder.buildPartial();
                                }
                                this.f87852d |= 1;
                            } else if (tag == 18) {
                                QualifiedNameTable.Builder builder2 = (this.f87852d & 2) == 2 ? this.f87854f.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.f87854f = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.f87854f = builder2.buildPartial();
                                }
                                this.f87852d |= 2;
                            } else if (tag == 26) {
                                Package.Builder builder3 = (this.f87852d & 4) == 4 ? this.f87855g.toBuilder() : null;
                                Package r11 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                this.f87855g = r11;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r11);
                                    this.f87855g = builder3.buildPartial();
                                }
                                this.f87852d |= 4;
                            } else if (tag != 34) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i11 = (c11 == true ? 1 : 0) & '\b';
                                c11 = c11;
                                if (i11 != 8) {
                                    this.f87856h = new ArrayList();
                                    c11 = '\b';
                                }
                                this.f87856h.add((Class) codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & '\b') == 8) {
                            this.f87856h = Collections.unmodifiableList(this.f87856h);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87851c = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c11 == true ? 1 : 0) & '\b') == 8) {
                this.f87856h = Collections.unmodifiableList(this.f87856h);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87851c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new a();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final Property f87864v;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f87868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Type f87870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f87871i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<TypeParameter> f87872j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Type f87873k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f87874l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<Type> f87875m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Integer> f87876n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f87877o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ValueParameter f87878p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f87879q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f87880r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<Integer> f87881s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private byte f87882t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f87883u;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87884d;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f87887g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f87889i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<TypeParameter> f87890j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private Type f87891k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f87892l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<Type> f87893m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private List<Integer> f87894n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private ValueParameter f87895o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f87896p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private int f87897q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private List<Integer> f87898r;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87885e = 518;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f87886f = 2054;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Type f87888h = Type.getDefaultInstance();

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f87890j = list;
                this.f87891k = Type.getDefaultInstance();
                this.f87893m = list;
                this.f87894n = list;
                this.f87895o = ValueParameter.getDefaultInstance();
                this.f87898r = list;
                m();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87884d & 512) != 512) {
                    this.f87894n = new ArrayList(this.f87894n);
                    this.f87884d |= 512;
                }
            }

            private void j() {
                if ((this.f87884d & 256) != 256) {
                    this.f87893m = new ArrayList(this.f87893m);
                    this.f87884d |= 256;
                }
            }

            private void k() {
                if ((this.f87884d & 32) != 32) {
                    this.f87890j = new ArrayList(this.f87890j);
                    this.f87884d |= 32;
                }
            }

            private void l() {
                if ((this.f87884d & PKIFailureInfo.certRevoked) != 8192) {
                    this.f87898r = new ArrayList(this.f87898r);
                    this.f87884d |= PKIFailureInfo.certRevoked;
                }
            }

            private void m() {
            }

            public Property buildPartial() {
                Property property = new Property(this);
                int i11 = this.f87884d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                property.f87867e = this.f87885e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                property.f87868f = this.f87886f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                property.f87869g = this.f87887g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                property.f87870h = this.f87888h;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                property.f87871i = this.f87889i;
                if ((this.f87884d & 32) == 32) {
                    this.f87890j = Collections.unmodifiableList(this.f87890j);
                    this.f87884d &= -33;
                }
                property.f87872j = this.f87890j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                property.f87873k = this.f87891k;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                property.f87874l = this.f87892l;
                if ((this.f87884d & 256) == 256) {
                    this.f87893m = Collections.unmodifiableList(this.f87893m);
                    this.f87884d &= -257;
                }
                property.f87875m = this.f87893m;
                if ((this.f87884d & 512) == 512) {
                    this.f87894n = Collections.unmodifiableList(this.f87894n);
                    this.f87884d &= -513;
                }
                property.f87876n = this.f87894n;
                if ((i11 & 1024) == 1024) {
                    i12 |= 128;
                }
                property.f87878p = this.f87895o;
                if ((i11 & 2048) == 2048) {
                    i12 |= 256;
                }
                property.f87879q = this.f87896p;
                if ((i11 & 4096) == 4096) {
                    i12 |= 512;
                }
                property.f87880r = this.f87897q;
                if ((this.f87884d & PKIFailureInfo.certRevoked) == 8192) {
                    this.f87898r = Collections.unmodifiableList(this.f87898r);
                    this.f87884d &= -8193;
                }
                property.f87881s = this.f87898r;
                property.f87866d = i12;
                return property;
            }

            public Type getContextReceiverType(int i11) {
                return this.f87893m.get(i11);
            }

            public int getContextReceiverTypeCount() {
                return this.f87893m.size();
            }

            public Type getReceiverType() {
                return this.f87891k;
            }

            public Type getReturnType() {
                return this.f87888h;
            }

            public ValueParameter getSetterValueParameter() {
                return this.f87895o;
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.f87890j.get(i11);
            }

            public int getTypeParameterCount() {
                return this.f87890j.size();
            }

            public boolean hasName() {
                return (this.f87884d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.f87884d & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.f87884d & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.f87884d & 1024) == 1024;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                    if (!getContextReceiverType(i12).isInitialized()) {
                        return false;
                    }
                }
                return (!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && e();
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.f87884d & 64) != 64 || this.f87891k == Type.getDefaultInstance()) {
                    this.f87891k = type;
                } else {
                    this.f87891k = Type.newBuilder(this.f87891k).mergeFrom(type).buildPartial();
                }
                this.f87884d |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.f87884d & 8) != 8 || this.f87888h == Type.getDefaultInstance()) {
                    this.f87888h = type;
                } else {
                    this.f87888h = Type.newBuilder(this.f87888h).mergeFrom(type).buildPartial();
                }
                this.f87884d |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.f87884d & 1024) != 1024 || this.f87895o == ValueParameter.getDefaultInstance()) {
                    this.f87895o = valueParameter;
                } else {
                    this.f87895o = ValueParameter.newBuilder(this.f87895o).mergeFrom(valueParameter).buildPartial();
                }
                this.f87884d |= 1024;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f87884d |= 1;
                this.f87885e = i11;
                return this;
            }

            public Builder setGetterFlags(int i11) {
                this.f87884d |= 2048;
                this.f87896p = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f87884d |= 4;
                this.f87887g = i11;
                return this;
            }

            public Builder setOldFlags(int i11) {
                this.f87884d |= 2;
                this.f87886f = i11;
                return this;
            }

            public Builder setReceiverTypeId(int i11) {
                this.f87884d |= 128;
                this.f87892l = i11;
                return this;
            }

            public Builder setReturnTypeId(int i11) {
                this.f87884d |= 16;
                this.f87889i = i11;
                return this;
            }

            public Builder setSetterFlags(int i11) {
                this.f87884d |= 4096;
                this.f87897q = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(propertyBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.f87872j.isEmpty()) {
                    if (this.f87890j.isEmpty()) {
                        this.f87890j = property.f87872j;
                        this.f87884d &= -33;
                    } else {
                        k();
                        this.f87890j.addAll(property.f87872j);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.f87875m.isEmpty()) {
                    if (this.f87893m.isEmpty()) {
                        this.f87893m = property.f87875m;
                        this.f87884d &= -257;
                    } else {
                        j();
                        this.f87893m.addAll(property.f87875m);
                    }
                }
                if (!property.f87876n.isEmpty()) {
                    if (this.f87894n.isEmpty()) {
                        this.f87894n = property.f87876n;
                        this.f87884d &= -513;
                    } else {
                        i();
                        this.f87894n.addAll(property.f87876n);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.f87881s.isEmpty()) {
                    if (this.f87898r.isEmpty()) {
                        this.f87898r = property.f87881s;
                        this.f87884d &= -8193;
                    } else {
                        l();
                        this.f87898r.addAll(property.f87881s);
                    }
                }
                f(property);
                setUnknownFields(getUnknownFields().concat(property.f87865c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property partialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Property property2 = (Property) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (property != null) {
                        mergeFrom(property);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Property> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Property property = new Property(true);
            f87864v = property;
            property.G();
        }

        private void G() {
            this.f87867e = 518;
            this.f87868f = 2054;
            this.f87869g = 0;
            this.f87870h = Type.getDefaultInstance();
            this.f87871i = 0;
            List list = Collections.EMPTY_LIST;
            this.f87872j = list;
            this.f87873k = Type.getDefaultInstance();
            this.f87874l = 0;
            this.f87875m = list;
            this.f87876n = list;
            this.f87878p = ValueParameter.getDefaultInstance();
            this.f87879q = 0;
            this.f87880r = 0;
            this.f87881s = list;
        }

        public static Property getDefaultInstance() {
            return f87864v;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public Type getContextReceiverType(int i11) {
            return this.f87875m.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.f87875m.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f87876n;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f87875m;
        }

        public int getFlags() {
            return this.f87867e;
        }

        public int getGetterFlags() {
            return this.f87879q;
        }

        public int getName() {
            return this.f87869g;
        }

        public int getOldFlags() {
            return this.f87868f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f87873k;
        }

        public int getReceiverTypeId() {
            return this.f87874l;
        }

        public Type getReturnType() {
            return this.f87870h;
        }

        public int getReturnTypeId() {
            return this.f87871i;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87883u;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87866d & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.f87868f) : 0;
            if ((this.f87866d & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f87869g);
            }
            if ((this.f87866d & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f87870h);
            }
            for (int i12 = 0; i12 < this.f87872j.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f87872j.get(i12));
            }
            if ((this.f87866d & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f87873k);
            }
            if ((this.f87866d & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f87878p);
            }
            if ((this.f87866d & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f87879q);
            }
            if ((this.f87866d & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f87880r);
            }
            if ((this.f87866d & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f87871i);
            }
            if ((this.f87866d & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, this.f87874l);
            }
            if ((this.f87866d & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.f87867e);
            }
            for (int i13 = 0; i13 < this.f87875m.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, this.f87875m.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.f87876n.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f87876n.get(i14).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f87877o = iComputeInt32SizeNoTag;
            int iComputeInt32SizeNoTag3 = 0;
            for (int i15 = 0; i15 < this.f87881s.size(); i15++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.f87881s.get(i15).intValue());
            }
            int size = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3 + (getVersionRequirementList().size() * 2) + j() + this.f87865c.size();
            this.f87883u = size;
            return size;
        }

        public int getSetterFlags() {
            return this.f87880r;
        }

        public ValueParameter getSetterValueParameter() {
            return this.f87878p;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.f87872j.get(i11);
        }

        public int getTypeParameterCount() {
            return this.f87872j.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f87872j;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f87881s;
        }

        public boolean hasFlags() {
            return (this.f87866d & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.f87866d & 256) == 256;
        }

        public boolean hasName() {
            return (this.f87866d & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f87866d & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f87866d & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f87866d & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f87866d & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f87866d & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.f87866d & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.f87866d & 128) == 128;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87882t;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f87882t = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.f87882t = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.f87882t = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.f87882t = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.f87882t = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.f87882t = (byte) 0;
                return false;
            }
            if (i()) {
                this.f87882t = (byte) 1;
                return true;
            }
            this.f87882t = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87866d & 2) == 2) {
                codedOutputStream.writeInt32(1, this.f87868f);
            }
            if ((this.f87866d & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f87869g);
            }
            if ((this.f87866d & 8) == 8) {
                codedOutputStream.writeMessage(3, this.f87870h);
            }
            for (int i11 = 0; i11 < this.f87872j.size(); i11++) {
                codedOutputStream.writeMessage(4, this.f87872j.get(i11));
            }
            if ((this.f87866d & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f87873k);
            }
            if ((this.f87866d & 128) == 128) {
                codedOutputStream.writeMessage(6, this.f87878p);
            }
            if ((this.f87866d & 256) == 256) {
                codedOutputStream.writeInt32(7, this.f87879q);
            }
            if ((this.f87866d & 512) == 512) {
                codedOutputStream.writeInt32(8, this.f87880r);
            }
            if ((this.f87866d & 16) == 16) {
                codedOutputStream.writeInt32(9, this.f87871i);
            }
            if ((this.f87866d & 64) == 64) {
                codedOutputStream.writeInt32(10, this.f87874l);
            }
            if ((this.f87866d & 1) == 1) {
                codedOutputStream.writeInt32(11, this.f87867e);
            }
            for (int i12 = 0; i12 < this.f87875m.size(); i12++) {
                codedOutputStream.writeMessage(12, this.f87875m.get(i12));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.f87877o);
            }
            for (int i13 = 0; i13 < this.f87876n.size(); i13++) {
                codedOutputStream.writeInt32NoTag(this.f87876n.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.f87881s.size(); i14++) {
                codedOutputStream.writeInt32(31, this.f87881s.get(i14).intValue());
            }
            extensionWriterK.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87865c);
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return f87864v;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87877o = -1;
            this.f87882t = (byte) -1;
            this.f87883u = -1;
            this.f87865c = extendableBuilder.getUnknownFields();
        }

        private Property(boolean z11) {
            this.f87877o = -1;
            this.f87882t = (byte) -1;
            this.f87883u = -1;
            this.f87865c = ByteString.EMPTY;
        }

        private Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87877o = -1;
            this.f87882t = (byte) -1;
            this.f87883u = -1;
            G();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f87866d |= 2;
                                this.f87868f = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f87866d |= 4;
                                this.f87869g = codedInputStream.readInt32();
                                continue;
                            case 26:
                                Type.Builder builder = (this.f87866d & 8) == 8 ? this.f87870h.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87870h = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f87870h = builder.buildPartial();
                                }
                                this.f87866d |= 8;
                                continue;
                            case 34:
                                int i12 = (i11 == true ? 1 : 0) & 32;
                                i11 = i11;
                                if (i12 != 32) {
                                    this.f87872j = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 32;
                                }
                                this.f87872j.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 42:
                                Type.Builder builder2 = (this.f87866d & 32) == 32 ? this.f87873k.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87873k = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.f87873k = builder2.buildPartial();
                                }
                                this.f87866d |= 32;
                                continue;
                            case 50:
                                ValueParameter.Builder builder3 = (this.f87866d & 128) == 128 ? this.f87878p.toBuilder() : null;
                                ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                                this.f87878p = valueParameter;
                                if (builder3 != null) {
                                    builder3.mergeFrom(valueParameter);
                                    this.f87878p = builder3.buildPartial();
                                }
                                this.f87866d |= 128;
                                continue;
                            case 56:
                                this.f87866d |= 256;
                                this.f87879q = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f87866d |= 512;
                                this.f87880r = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f87866d |= 16;
                                this.f87871i = codedInputStream.readInt32();
                                continue;
                            case 80:
                                this.f87866d |= 64;
                                this.f87874l = codedInputStream.readInt32();
                                continue;
                            case 88:
                                this.f87866d |= 1;
                                this.f87867e = codedInputStream.readInt32();
                                continue;
                            case 98:
                                int i13 = (i11 == true ? 1 : 0) & 256;
                                i11 = i11;
                                if (i13 != 256) {
                                    this.f87875m = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 256;
                                }
                                this.f87875m.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                continue;
                            case 104:
                                int i14 = (i11 == true ? 1 : 0) & 512;
                                i11 = i11;
                                if (i14 != 512) {
                                    this.f87876n = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 512;
                                }
                                this.f87876n.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 106:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i15 = (i11 == true ? 1 : 0) & 512;
                                i11 = i11;
                                if (i15 != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i11 = i11;
                                    this.f87876n = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | 512;
                                }
                                i11 = i11;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f87876n.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                int i16 = (i11 == true ? 1 : 0) & PKIFailureInfo.certRevoked;
                                i11 = i11;
                                if (i16 != 8192) {
                                    this.f87881s = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | PKIFailureInfo.certRevoked;
                                }
                                this.f87881s.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i17 = (i11 == true ? 1 : 0) & PKIFailureInfo.certRevoked;
                                i11 = i11;
                                if (i17 != 8192 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i11 = i11;
                                    this.f87881s = new ArrayList();
                                    i11 = (i11 == true ? 1 : 0) | PKIFailureInfo.certRevoked;
                                }
                                i11 = i11;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f87881s.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            default:
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i11 == true ? 1 : 0) & 32) == 32) {
                        this.f87872j = Collections.unmodifiableList(this.f87872j);
                    }
                    if (((i11 == true ? 1 : 0) & 256) == 256) {
                        this.f87875m = Collections.unmodifiableList(this.f87875m);
                    }
                    if (((i11 == true ? 1 : 0) & 512) == 512) {
                        this.f87876n = Collections.unmodifiableList(this.f87876n);
                    }
                    if (((i11 == true ? 1 : 0) & PKIFailureInfo.certRevoked) == 8192) {
                        this.f87881s = Collections.unmodifiableList(this.f87881s);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87865c = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (((i11 == true ? 1 : 0) & 32) == 32) {
                this.f87872j = Collections.unmodifiableList(this.f87872j);
            }
            if (((i11 == true ? 1 : 0) & 256) == 256) {
                this.f87875m = Collections.unmodifiableList(this.f87875m);
            }
            if (((i11 == true ? 1 : 0) & 512) == 512) {
                this.f87876n = Collections.unmodifiableList(this.f87876n);
            }
            if (((i11 == true ? 1 : 0) & PKIFailureInfo.certRevoked) == 8192) {
                this.f87881s = Collections.unmodifiableList(this.f87881s);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87865c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final QualifiedNameTable f87899f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f87900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<QualifiedName> f87901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f87902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87903e;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f87904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<QualifiedName> f87905c = Collections.EMPTY_LIST;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f87904b & 1) != 1) {
                    this.f87905c = new ArrayList(this.f87905c);
                    this.f87904b |= 1;
                }
            }

            private void e() {
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f87904b & 1) == 1) {
                    this.f87905c = Collections.unmodifiableList(this.f87905c);
                    this.f87904b &= -2;
                }
                qualifiedNameTable.f87901c = this.f87905c;
                return qualifiedNameTable;
            }

            public QualifiedName getQualifiedName(int i11) {
                return this.f87905c.get(i11);
            }

            public int getQualifiedNameCount() {
                return this.f87905c.size();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getQualifiedNameCount(); i11++) {
                    if (!getQualifiedName(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(qualifiedNameTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.f87901c.isEmpty()) {
                    if (this.f87905c.isEmpty()) {
                        this.f87905c = qualifiedNameTable.f87901c;
                        this.f87904b &= -2;
                    } else {
                        d();
                        this.f87905c.addAll(qualifiedNameTable.f87901c);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.f87900b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable partialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (qualifiedNameTable != null) {
                        mergeFrom(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new a();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final QualifiedName f87906i;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ByteString f87907b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f87908c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87909d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87910e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Kind f87911f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private byte f87912g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f87913h;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f87914b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f87916d;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f87915c = -1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Kind f87917e = Kind.PACKAGE;

                private Builder() {
                    d();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder c() {
                    return new Builder();
                }

                private void d() {
                }

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i11 = this.f87914b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    qualifiedName.f87909d = this.f87915c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    qualifiedName.f87910e = this.f87916d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    qualifiedName.f87911f = this.f87917e;
                    qualifiedName.f87908c = i12;
                    return qualifiedName;
                }

                public boolean hasShortName() {
                    return (this.f87914b & 2) == 2;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                public Builder setKind(Kind kind) {
                    kind.getClass();
                    this.f87914b |= 4;
                    this.f87917e = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i11) {
                    this.f87914b |= 1;
                    this.f87915c = i11;
                    return this;
                }

                public Builder setShortName(int i11) {
                    this.f87914b |= 2;
                    this.f87916d = i11;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.a(qualifiedNameBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo499clone() {
                    return c().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.f87907b));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName partialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            QualifiedName qualifiedName2 = (QualifiedName) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (qualifiedName != null) {
                            mergeFrom(qualifiedName);
                        }
                        throw th;
                    }
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new a();
                private final int value;

                static class a implements Internal.EnumLiteMap<Kind> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Kind findValueByNumber(int i11) {
                        return Kind.valueOf(i11);
                    }
                }

                Kind(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i11) {
                    if (i11 == 0) {
                        return CLASS;
                    }
                    if (i11 == 1) {
                        return PACKAGE;
                    }
                    if (i11 != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            static class a extends AbstractParser<QualifiedName> {
                a() {
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                f87906i = qualifiedName;
                qualifiedName.m();
            }

            public static QualifiedName getDefaultInstance() {
                return f87906i;
            }

            private void m() {
                this.f87909d = -1;
                this.f87910e = 0;
                this.f87911f = Kind.PACKAGE;
            }

            public static Builder newBuilder() {
                return Builder.c();
            }

            public Kind getKind() {
                return this.f87911f;
            }

            public int getParentQualifiedName() {
                return this.f87909d;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.f87913h;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeInt32Size = (this.f87908c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87909d) : 0;
                if ((this.f87908c & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f87910e);
                }
                if ((this.f87908c & 4) == 4) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f87911f.getNumber());
                }
                int size = iComputeInt32Size + this.f87907b.size();
                this.f87913h = size;
                return size;
            }

            public int getShortName() {
                return this.f87910e;
            }

            public boolean hasKind() {
                return (this.f87908c & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.f87908c & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.f87908c & 2) == 2;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.f87912g;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.f87912g = (byte) 1;
                    return true;
                }
                this.f87912g = (byte) 0;
                return false;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f87908c & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f87909d);
                }
                if ((this.f87908c & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.f87910e);
                }
                if ((this.f87908c & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.f87911f.getNumber());
                }
                codedOutputStream.writeRawBytes(this.f87907b);
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return f87906i;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f87912g = (byte) -1;
                this.f87913h = -1;
                this.f87907b = builder.getUnknownFields();
            }

            private QualifiedName(boolean z11) {
                this.f87912g = (byte) -1;
                this.f87913h = -1;
                this.f87907b = ByteString.EMPTY;
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f87912g = (byte) -1;
                this.f87913h = -1;
                m();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f87908c |= 1;
                                        this.f87909d = codedInputStream.readInt32();
                                    } else if (tag == 16) {
                                        this.f87908c |= 2;
                                        this.f87910e = codedInputStream.readInt32();
                                    } else if (tag != 24) {
                                        if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        int i11 = codedInputStream.readEnum();
                                        Kind kindValueOf = Kind.valueOf(i11);
                                        if (kindValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.f87908c |= 4;
                                            this.f87911f = kindValueOf;
                                        }
                                    }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            }
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87907b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f87907b = outputNewOutput.toByteString();
                }
                e();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static class a extends AbstractParser<QualifiedNameTable> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            f87899f = qualifiedNameTable;
            qualifiedNameTable.k();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return f87899f;
        }

        private void k() {
            this.f87901c = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i11) {
            return this.f87901c.get(i11);
        }

        public int getQualifiedNameCount() {
            return this.f87901c.size();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87903e;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.f87901c.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f87901c.get(i12));
            }
            int size = iComputeMessageSize + this.f87900b.size();
            this.f87903e = size;
            return size;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87902d;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getQualifiedNameCount(); i11++) {
                if (!getQualifiedName(i11).isInitialized()) {
                    this.f87902d = (byte) 0;
                    return false;
                }
            }
            this.f87902d = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f87901c.size(); i11++) {
                codedOutputStream.writeMessage(1, this.f87901c.get(i11));
            }
            codedOutputStream.writeRawBytes(this.f87900b);
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return f87899f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f87902d = (byte) -1;
            this.f87903e = -1;
            this.f87900b = builder.getUnknownFields();
        }

        private QualifiedNameTable(boolean z11) {
            this.f87902d = (byte) -1;
            this.f87903e = -1;
            this.f87900b = ByteString.EMPTY;
        }

        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87902d = (byte) -1;
            this.f87903e = -1;
            k();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.f87901c = new ArrayList();
                                        z12 = true;
                                    }
                                    this.f87901c.add((QualifiedName) codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.f87901c = Collections.unmodifiableList(this.f87901c);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87900b = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (z12) {
                this.f87901c = Collections.unmodifiableList(this.f87901c);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87900b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final StringTable f87918f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f87919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LazyStringList f87920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f87921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87922e;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f87923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private LazyStringList f87924c = LazyStringArrayList.EMPTY;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f87923b & 1) != 1) {
                    this.f87924c = new LazyStringArrayList(this.f87924c);
                    this.f87923b |= 1;
                }
            }

            private void e() {
            }

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.f87923b & 1) == 1) {
                    this.f87924c = this.f87924c.getUnmodifiableView();
                    this.f87923b &= -2;
                }
                stringTable.f87920c = this.f87924c;
                return stringTable;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(stringTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.f87920c.isEmpty()) {
                    if (this.f87924c.isEmpty()) {
                        this.f87924c = stringTable.f87920c;
                        this.f87923b &= -2;
                    } else {
                        d();
                        this.f87924c.addAll(stringTable.f87920c);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.f87919b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable partialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        StringTable stringTable2 = (StringTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTable != null) {
                        mergeFrom(stringTable);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<StringTable> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTable stringTable = new StringTable(true);
            f87918f = stringTable;
            stringTable.k();
        }

        public static StringTable getDefaultInstance() {
            return f87918f;
        }

        private void k() {
            this.f87920c = LazyStringArrayList.EMPTY;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87922e;
            if (i11 != -1) {
                return i11;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i12 = 0; i12 < this.f87920c.size(); i12++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.f87920c.getByteString(i12));
            }
            int size = iComputeBytesSizeNoTag + getStringList().size() + this.f87919b.size();
            this.f87922e = size;
            return size;
        }

        public String getString(int i11) {
            return this.f87920c.get(i11);
        }

        public ProtocolStringList getStringList() {
            return this.f87920c;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87921d;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f87921d = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f87920c.size(); i11++) {
                codedOutputStream.writeBytes(1, this.f87920c.getByteString(i11));
            }
            codedOutputStream.writeRawBytes(this.f87919b);
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return f87918f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f87921d = (byte) -1;
            this.f87922e = -1;
            this.f87919b = builder.getUnknownFields();
        }

        private StringTable(boolean z11) {
            this.f87921d = (byte) -1;
            this.f87922e = -1;
            this.f87919b = ByteString.EMPTY;
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f87921d = (byte) -1;
            this.f87922e = -1;
            k();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    if (!z12) {
                                        this.f87920c = new LazyStringArrayList();
                                        z12 = true;
                                    }
                                    this.f87920c.add(bytes);
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.f87920c = this.f87920c.getUnmodifiableView();
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87919b = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (z12) {
                this.f87920c = this.f87920c.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87919b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final Type f87925u;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<Argument> f87928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f87929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Type f87931h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f87932i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f87933j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f87934k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f87935l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f87936m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Type f87937n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f87938o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Type f87939p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f87940q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f87941r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private byte f87942s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f87943t;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new a();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final Argument f87944i;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ByteString f87945b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f87946c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Projection f87947d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Type f87948e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f87949f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private byte f87950g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f87951h;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f87952b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Projection f87953c = Projection.INV;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private Type f87954d = Type.getDefaultInstance();

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private int f87955e;

                private Builder() {
                    d();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder c() {
                    return new Builder();
                }

                private void d() {
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i11 = this.f87952b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    argument.f87947d = this.f87953c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    argument.f87948e = this.f87954d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    argument.f87949f = this.f87955e;
                    argument.f87946c = i12;
                    return argument;
                }

                public Type getType() {
                    return this.f87954d;
                }

                public boolean hasType() {
                    return (this.f87952b & 2) == 2;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                public Builder mergeType(Type type) {
                    if ((this.f87952b & 2) != 2 || this.f87954d == Type.getDefaultInstance()) {
                        this.f87954d = type;
                    } else {
                        this.f87954d = Type.newBuilder(this.f87954d).mergeFrom(type).buildPartial();
                    }
                    this.f87952b |= 2;
                    return this;
                }

                public Builder setProjection(Projection projection) {
                    projection.getClass();
                    this.f87952b |= 1;
                    this.f87953c = projection;
                    return this;
                }

                public Builder setTypeId(int i11) {
                    this.f87952b |= 4;
                    this.f87955e = i11;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.a(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo499clone() {
                    return c().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f87945b));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            Argument argument2 = (Argument) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new a();
                private final int value;

                static class a implements Internal.EnumLiteMap<Projection> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Projection findValueByNumber(int i11) {
                        return Projection.valueOf(i11);
                    }
                }

                Projection(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i11) {
                    if (i11 == 0) {
                        return IN;
                    }
                    if (i11 == 1) {
                        return OUT;
                    }
                    if (i11 == 2) {
                        return INV;
                    }
                    if (i11 != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            static class a extends AbstractParser<Argument> {
                a() {
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument(true);
                f87944i = argument;
                argument.m();
            }

            public static Argument getDefaultInstance() {
                return f87944i;
            }

            private void m() {
                this.f87947d = Projection.INV;
                this.f87948e = Type.getDefaultInstance();
                this.f87949f = 0;
            }

            public static Builder newBuilder() {
                return Builder.c();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.f87947d;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.f87951h;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeEnumSize = (this.f87946c & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f87947d.getNumber()) : 0;
                if ((this.f87946c & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.f87948e);
                }
                if ((this.f87946c & 4) == 4) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.f87949f);
                }
                int size = iComputeEnumSize + this.f87945b.size();
                this.f87951h = size;
                return size;
            }

            public Type getType() {
                return this.f87948e;
            }

            public int getTypeId() {
                return this.f87949f;
            }

            public boolean hasProjection() {
                return (this.f87946c & 1) == 1;
            }

            public boolean hasType() {
                return (this.f87946c & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.f87946c & 4) == 4;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.f87950g;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.f87950g = (byte) 1;
                    return true;
                }
                this.f87950g = (byte) 0;
                return false;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f87946c & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.f87947d.getNumber());
                }
                if ((this.f87946c & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.f87948e);
                }
                if ((this.f87946c & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.f87949f);
                }
                codedOutputStream.writeRawBytes(this.f87945b);
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f87944i;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f87950g = (byte) -1;
                this.f87951h = -1;
                this.f87945b = builder.getUnknownFields();
            }

            private Argument(boolean z11) {
                this.f87950g = (byte) -1;
                this.f87951h = -1;
                this.f87945b = ByteString.EMPTY;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f87950g = (byte) -1;
                this.f87951h = -1;
                m();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        int i11 = codedInputStream.readEnum();
                                        Projection projectionValueOf = Projection.valueOf(i11);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.f87946c |= 1;
                                            this.f87947d = projectionValueOf;
                                        }
                                    } else if (tag == 18) {
                                        Builder builder = (this.f87946c & 2) == 2 ? this.f87948e.toBuilder() : null;
                                        Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.f87948e = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.f87948e = builder.buildPartial();
                                        }
                                        this.f87946c |= 2;
                                    } else if (tag != 24) {
                                        if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.f87946c |= 4;
                                        this.f87949f = codedInputStream.readInt32();
                                    }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            }
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87945b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f87945b = outputNewOutput.toByteString();
                }
                e();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87956d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f87958f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f87959g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f87961i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f87962j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f87963k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private int f87964l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f87965m;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private int f87967o;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private int f87969q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f87970r;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private List<Argument> f87957e = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Type f87960h = Type.getDefaultInstance();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private Type f87966n = Type.getDefaultInstance();

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private Type f87968p = Type.getDefaultInstance();

            private Builder() {
                j();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87956d & 1) != 1) {
                    this.f87957e = new ArrayList(this.f87957e);
                    this.f87956d |= 1;
                }
            }

            private void j() {
            }

            public Type buildPartial() {
                Type type = new Type(this);
                int i11 = this.f87956d;
                if ((i11 & 1) == 1) {
                    this.f87957e = Collections.unmodifiableList(this.f87957e);
                    this.f87956d &= -2;
                }
                type.f87928e = this.f87957e;
                int i12 = (i11 & 2) != 2 ? 0 : 1;
                type.f87929f = this.f87958f;
                if ((i11 & 4) == 4) {
                    i12 |= 2;
                }
                type.f87930g = this.f87959g;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                type.f87931h = this.f87960h;
                if ((i11 & 16) == 16) {
                    i12 |= 8;
                }
                type.f87932i = this.f87961i;
                if ((i11 & 32) == 32) {
                    i12 |= 16;
                }
                type.f87933j = this.f87962j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                type.f87934k = this.f87963k;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                type.f87935l = this.f87964l;
                if ((i11 & 256) == 256) {
                    i12 |= 128;
                }
                type.f87936m = this.f87965m;
                if ((i11 & 512) == 512) {
                    i12 |= 256;
                }
                type.f87937n = this.f87966n;
                if ((i11 & 1024) == 1024) {
                    i12 |= 512;
                }
                type.f87938o = this.f87967o;
                if ((i11 & 2048) == 2048) {
                    i12 |= 1024;
                }
                type.f87939p = this.f87968p;
                if ((i11 & 4096) == 4096) {
                    i12 |= 2048;
                }
                type.f87940q = this.f87969q;
                if ((i11 & PKIFailureInfo.certRevoked) == 8192) {
                    i12 |= 4096;
                }
                type.f87941r = this.f87970r;
                type.f87927d = i12;
                return type;
            }

            public Type getAbbreviatedType() {
                return this.f87968p;
            }

            public Argument getArgument(int i11) {
                return this.f87957e.get(i11);
            }

            public int getArgumentCount() {
                return this.f87957e.size();
            }

            public Type getFlexibleUpperBound() {
                return this.f87960h;
            }

            public Type getOuterType() {
                return this.f87966n;
            }

            public boolean hasAbbreviatedType() {
                return (this.f87956d & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.f87956d & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.f87956d & 512) == 512;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                    if (!getArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && e();
                }
                return false;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.f87956d & 2048) != 2048 || this.f87968p == Type.getDefaultInstance()) {
                    this.f87968p = type;
                } else {
                    this.f87968p = Type.newBuilder(this.f87968p).mergeFrom(type).buildPartial();
                }
                this.f87956d |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.f87956d & 8) != 8 || this.f87960h == Type.getDefaultInstance()) {
                    this.f87960h = type;
                } else {
                    this.f87960h = Type.newBuilder(this.f87960h).mergeFrom(type).buildPartial();
                }
                this.f87956d |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.f87956d & 512) != 512 || this.f87966n == Type.getDefaultInstance()) {
                    this.f87966n = type;
                } else {
                    this.f87966n = Type.newBuilder(this.f87966n).mergeFrom(type).buildPartial();
                }
                this.f87956d |= 512;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i11) {
                this.f87956d |= 4096;
                this.f87969q = i11;
                return this;
            }

            public Builder setClassName(int i11) {
                this.f87956d |= 32;
                this.f87962j = i11;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f87956d |= PKIFailureInfo.certRevoked;
                this.f87970r = i11;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i11) {
                this.f87956d |= 4;
                this.f87959g = i11;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i11) {
                this.f87956d |= 16;
                this.f87961i = i11;
                return this;
            }

            public Builder setNullable(boolean z11) {
                this.f87956d |= 2;
                this.f87958f = z11;
                return this;
            }

            public Builder setOuterTypeId(int i11) {
                this.f87956d |= 1024;
                this.f87967o = i11;
                return this;
            }

            public Builder setTypeAliasName(int i11) {
                this.f87956d |= 256;
                this.f87965m = i11;
                return this;
            }

            public Builder setTypeParameter(int i11) {
                this.f87956d |= 64;
                this.f87963k = i11;
                return this;
            }

            public Builder setTypeParameterName(int i11) {
                this.f87956d |= 128;
                this.f87964l = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(typeBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.f87928e.isEmpty()) {
                    if (this.f87957e.isEmpty()) {
                        this.f87957e = type.f87928e;
                        this.f87956d &= -2;
                    } else {
                        i();
                        this.f87957e.addAll(type.f87928e);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                f(type);
                setUnknownFields(getUnknownFields().concat(type.f87926c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type partialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        Type type2 = (Type) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            type = type2;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (type != null) {
                        mergeFrom(type);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<Type> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Type type = new Type(true);
            f87925u = type;
            type.D();
        }

        private void D() {
            this.f87928e = Collections.EMPTY_LIST;
            this.f87929f = false;
            this.f87930g = 0;
            this.f87931h = getDefaultInstance();
            this.f87932i = 0;
            this.f87933j = 0;
            this.f87934k = 0;
            this.f87935l = 0;
            this.f87936m = 0;
            this.f87937n = getDefaultInstance();
            this.f87938o = 0;
            this.f87939p = getDefaultInstance();
            this.f87940q = 0;
            this.f87941r = 0;
        }

        public static Type getDefaultInstance() {
            return f87925u;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public Type getAbbreviatedType() {
            return this.f87939p;
        }

        public int getAbbreviatedTypeId() {
            return this.f87940q;
        }

        public Argument getArgument(int i11) {
            return this.f87928e.get(i11);
        }

        public int getArgumentCount() {
            return this.f87928e.size();
        }

        public List<Argument> getArgumentList() {
            return this.f87928e;
        }

        public int getClassName() {
            return this.f87933j;
        }

        public int getFlags() {
            return this.f87941r;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.f87930g;
        }

        public Type getFlexibleUpperBound() {
            return this.f87931h;
        }

        public int getFlexibleUpperBoundId() {
            return this.f87932i;
        }

        public boolean getNullable() {
            return this.f87929f;
        }

        public Type getOuterType() {
            return this.f87937n;
        }

        public int getOuterTypeId() {
            return this.f87938o;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87943t;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87927d & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.f87941r) : 0;
            for (int i12 = 0; i12 < this.f87928e.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f87928e.get(i12));
            }
            if ((this.f87927d & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f87929f);
            }
            if ((this.f87927d & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f87930g);
            }
            if ((this.f87927d & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f87931h);
            }
            if ((this.f87927d & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.f87933j);
            }
            if ((this.f87927d & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f87934k);
            }
            if ((this.f87927d & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f87932i);
            }
            if ((this.f87927d & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f87935l);
            }
            if ((this.f87927d & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.f87937n);
            }
            if ((this.f87927d & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.f87938o);
            }
            if ((this.f87927d & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, this.f87936m);
            }
            if ((this.f87927d & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, this.f87939p);
            }
            if ((this.f87927d & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.f87940q);
            }
            int iJ = iComputeInt32Size + j() + this.f87926c.size();
            this.f87943t = iJ;
            return iJ;
        }

        public int getTypeAliasName() {
            return this.f87936m;
        }

        public int getTypeParameter() {
            return this.f87934k;
        }

        public int getTypeParameterName() {
            return this.f87935l;
        }

        public boolean hasAbbreviatedType() {
            return (this.f87927d & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.f87927d & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.f87927d & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.f87927d & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.f87927d & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.f87927d & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.f87927d & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.f87927d & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.f87927d & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.f87927d & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.f87927d & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.f87927d & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.f87927d & 64) == 64;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87942s;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                if (!getArgument(i11).isInitialized()) {
                    this.f87942s = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.f87942s = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.f87942s = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.f87942s = (byte) 0;
                return false;
            }
            if (i()) {
                this.f87942s = (byte) 1;
                return true;
            }
            this.f87942s = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87927d & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.f87941r);
            }
            for (int i11 = 0; i11 < this.f87928e.size(); i11++) {
                codedOutputStream.writeMessage(2, this.f87928e.get(i11));
            }
            if ((this.f87927d & 1) == 1) {
                codedOutputStream.writeBool(3, this.f87929f);
            }
            if ((this.f87927d & 2) == 2) {
                codedOutputStream.writeInt32(4, this.f87930g);
            }
            if ((this.f87927d & 4) == 4) {
                codedOutputStream.writeMessage(5, this.f87931h);
            }
            if ((this.f87927d & 16) == 16) {
                codedOutputStream.writeInt32(6, this.f87933j);
            }
            if ((this.f87927d & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f87934k);
            }
            if ((this.f87927d & 8) == 8) {
                codedOutputStream.writeInt32(8, this.f87932i);
            }
            if ((this.f87927d & 64) == 64) {
                codedOutputStream.writeInt32(9, this.f87935l);
            }
            if ((this.f87927d & 256) == 256) {
                codedOutputStream.writeMessage(10, this.f87937n);
            }
            if ((this.f87927d & 512) == 512) {
                codedOutputStream.writeInt32(11, this.f87938o);
            }
            if ((this.f87927d & 128) == 128) {
                codedOutputStream.writeInt32(12, this.f87936m);
            }
            if ((this.f87927d & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.f87939p);
            }
            if ((this.f87927d & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.f87940q);
            }
            extensionWriterK.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87926c);
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return f87925u;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87942s = (byte) -1;
            this.f87943t = -1;
            this.f87926c = extendableBuilder.getUnknownFields();
        }

        private Type(boolean z11) {
            this.f87942s = (byte) -1;
            this.f87943t = -1;
            this.f87926c = ByteString.EMPTY;
        }

        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Builder builder;
            this.f87942s = (byte) -1;
            this.f87943t = -1;
            D();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.f87927d |= 4096;
                                    this.f87941r = codedInputStream.readInt32();
                                    continue;
                                case 18:
                                    if (!z12) {
                                        this.f87928e = new ArrayList();
                                        z12 = true;
                                    }
                                    this.f87928e.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                    continue;
                                case 24:
                                    this.f87927d |= 1;
                                    this.f87929f = codedInputStream.readBool();
                                    continue;
                                case 32:
                                    this.f87927d |= 2;
                                    this.f87930g = codedInputStream.readInt32();
                                    continue;
                                case 42:
                                    builder = (this.f87927d & 4) == 4 ? this.f87931h.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f87931h = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f87931h = builder.buildPartial();
                                    }
                                    this.f87927d |= 4;
                                    continue;
                                case 48:
                                    this.f87927d |= 16;
                                    this.f87933j = codedInputStream.readInt32();
                                    continue;
                                case 56:
                                    this.f87927d |= 32;
                                    this.f87934k = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.f87927d |= 8;
                                    this.f87932i = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.f87927d |= 64;
                                    this.f87935l = codedInputStream.readInt32();
                                    continue;
                                case 82:
                                    builder = (this.f87927d & 256) == 256 ? this.f87937n.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f87937n = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.f87937n = builder.buildPartial();
                                    }
                                    this.f87927d |= 256;
                                    continue;
                                case 88:
                                    this.f87927d |= 512;
                                    this.f87938o = codedInputStream.readInt32();
                                    continue;
                                case 96:
                                    this.f87927d |= 128;
                                    this.f87936m = codedInputStream.readInt32();
                                    continue;
                                case 106:
                                    builder = (this.f87927d & 1024) == 1024 ? this.f87939p.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f87939p = type3;
                                    if (builder != null) {
                                        builder.mergeFrom(type3);
                                        this.f87939p = builder.buildPartial();
                                    }
                                    this.f87927d |= 1024;
                                    continue;
                                case 112:
                                    this.f87927d |= 2048;
                                    this.f87940q = codedInputStream.readInt32();
                                    continue;
                                default:
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.f87928e = Collections.unmodifiableList(this.f87928e);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87926c = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (z12) {
                this.f87928e = Collections.unmodifiableList(this.f87928e);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87926c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final TypeAlias f87971p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f87975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<TypeParameter> f87976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Type f87977h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f87978i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Type f87979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f87980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<Annotation> f87981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<Integer> f87982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private byte f87983n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f87984o;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f87985d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f87986e = 6;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f87987f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private List<TypeParameter> f87988g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Type f87989h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f87990i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private Type f87991j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f87992k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private List<Annotation> f87993l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<Integer> f87994m;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f87988g = list;
                this.f87989h = Type.getDefaultInstance();
                this.f87991j = Type.getDefaultInstance();
                this.f87993l = list;
                this.f87994m = list;
                l();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f87985d & 128) != 128) {
                    this.f87993l = new ArrayList(this.f87993l);
                    this.f87985d |= 128;
                }
            }

            private void j() {
                if ((this.f87985d & 4) != 4) {
                    this.f87988g = new ArrayList(this.f87988g);
                    this.f87985d |= 4;
                }
            }

            private void k() {
                if ((this.f87985d & 256) != 256) {
                    this.f87994m = new ArrayList(this.f87994m);
                    this.f87985d |= 256;
                }
            }

            private void l() {
            }

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i11 = this.f87985d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                typeAlias.f87974e = this.f87986e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                typeAlias.f87975f = this.f87987f;
                if ((this.f87985d & 4) == 4) {
                    this.f87988g = Collections.unmodifiableList(this.f87988g);
                    this.f87985d &= -5;
                }
                typeAlias.f87976g = this.f87988g;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                typeAlias.f87977h = this.f87989h;
                if ((i11 & 16) == 16) {
                    i12 |= 8;
                }
                typeAlias.f87978i = this.f87990i;
                if ((i11 & 32) == 32) {
                    i12 |= 16;
                }
                typeAlias.f87979j = this.f87991j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                typeAlias.f87980k = this.f87992k;
                if ((this.f87985d & 128) == 128) {
                    this.f87993l = Collections.unmodifiableList(this.f87993l);
                    this.f87985d &= -129;
                }
                typeAlias.f87981l = this.f87993l;
                if ((this.f87985d & 256) == 256) {
                    this.f87994m = Collections.unmodifiableList(this.f87994m);
                    this.f87985d &= -257;
                }
                typeAlias.f87982m = this.f87994m;
                typeAlias.f87973d = i12;
                return typeAlias;
            }

            public Annotation getAnnotation(int i11) {
                return this.f87993l.get(i11);
            }

            public int getAnnotationCount() {
                return this.f87993l.size();
            }

            public Type getExpandedType() {
                return this.f87991j;
            }

            public TypeParameter getTypeParameter(int i11) {
                return this.f87988g.get(i11);
            }

            public int getTypeParameterCount() {
                return this.f87988g.size();
            }

            public Type getUnderlyingType() {
                return this.f87989h;
            }

            public boolean hasExpandedType() {
                return (this.f87985d & 32) == 32;
            }

            public boolean hasName() {
                return (this.f87985d & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.f87985d & 8) == 8;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                    if (!getTypeParameter(i11).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < getAnnotationCount(); i12++) {
                    if (!getAnnotation(i12).isInitialized()) {
                        return false;
                    }
                }
                return e();
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.f87985d & 32) != 32 || this.f87991j == Type.getDefaultInstance()) {
                    this.f87991j = type;
                } else {
                    this.f87991j = Type.newBuilder(this.f87991j).mergeFrom(type).buildPartial();
                }
                this.f87985d |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.f87985d & 8) != 8 || this.f87989h == Type.getDefaultInstance()) {
                    this.f87989h = type;
                } else {
                    this.f87989h = Type.newBuilder(this.f87989h).mergeFrom(type).buildPartial();
                }
                this.f87985d |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i11) {
                this.f87985d |= 64;
                this.f87992k = i11;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f87985d |= 1;
                this.f87986e = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f87985d |= 2;
                this.f87987f = i11;
                return this;
            }

            public Builder setUnderlyingTypeId(int i11) {
                this.f87985d |= 16;
                this.f87990i = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(typeAliasBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.f87976g.isEmpty()) {
                    if (this.f87988g.isEmpty()) {
                        this.f87988g = typeAlias.f87976g;
                        this.f87985d &= -5;
                    } else {
                        j();
                        this.f87988g.addAll(typeAlias.f87976g);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.f87981l.isEmpty()) {
                    if (this.f87993l.isEmpty()) {
                        this.f87993l = typeAlias.f87981l;
                        this.f87985d &= -129;
                    } else {
                        i();
                        this.f87993l.addAll(typeAlias.f87981l);
                    }
                }
                if (!typeAlias.f87982m.isEmpty()) {
                    if (this.f87994m.isEmpty()) {
                        this.f87994m = typeAlias.f87982m;
                        this.f87985d &= -257;
                    } else {
                        k();
                        this.f87994m.addAll(typeAlias.f87982m);
                    }
                }
                f(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.f87972c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias partialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        TypeAlias typeAlias2 = (TypeAlias) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeAlias != null) {
                        mergeFrom(typeAlias);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<TypeAlias> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            f87971p = typeAlias;
            typeAlias.A();
        }

        private void A() {
            this.f87974e = 6;
            this.f87975f = 0;
            List list = Collections.EMPTY_LIST;
            this.f87976g = list;
            this.f87977h = Type.getDefaultInstance();
            this.f87978i = 0;
            this.f87979j = Type.getDefaultInstance();
            this.f87980k = 0;
            this.f87981l = list;
            this.f87982m = list;
        }

        public static TypeAlias getDefaultInstance() {
            return f87971p;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public Annotation getAnnotation(int i11) {
            return this.f87981l.get(i11);
        }

        public int getAnnotationCount() {
            return this.f87981l.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.f87981l;
        }

        public Type getExpandedType() {
            return this.f87979j;
        }

        public int getExpandedTypeId() {
            return this.f87980k;
        }

        public int getFlags() {
            return this.f87974e;
        }

        public int getName() {
            return this.f87975f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f87984o;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87973d & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87974e) : 0;
            if ((this.f87973d & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f87975f);
            }
            for (int i12 = 0; i12 < this.f87976g.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f87976g.get(i12));
            }
            if ((this.f87973d & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f87977h);
            }
            if ((this.f87973d & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f87978i);
            }
            if ((this.f87973d & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f87979j);
            }
            if ((this.f87973d & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f87980k);
            }
            for (int i13 = 0; i13 < this.f87981l.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, this.f87981l.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.f87982m.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f87982m.get(i14).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + j() + this.f87972c.size();
            this.f87984o = size;
            return size;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.f87976g.get(i11);
        }

        public int getTypeParameterCount() {
            return this.f87976g.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f87976g;
        }

        public Type getUnderlyingType() {
            return this.f87977h;
        }

        public int getUnderlyingTypeId() {
            return this.f87978i;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f87982m;
        }

        public boolean hasExpandedType() {
            return (this.f87973d & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.f87973d & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.f87973d & 1) == 1;
        }

        public boolean hasName() {
            return (this.f87973d & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.f87973d & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.f87973d & 8) == 8;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f87983n;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f87983n = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.f87983n = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.f87983n = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.f87983n = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getAnnotationCount(); i12++) {
                if (!getAnnotation(i12).isInitialized()) {
                    this.f87983n = (byte) 0;
                    return false;
                }
            }
            if (i()) {
                this.f87983n = (byte) 1;
                return true;
            }
            this.f87983n = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87973d & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87974e);
            }
            if ((this.f87973d & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f87975f);
            }
            for (int i11 = 0; i11 < this.f87976g.size(); i11++) {
                codedOutputStream.writeMessage(3, this.f87976g.get(i11));
            }
            if ((this.f87973d & 4) == 4) {
                codedOutputStream.writeMessage(4, this.f87977h);
            }
            if ((this.f87973d & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f87978i);
            }
            if ((this.f87973d & 16) == 16) {
                codedOutputStream.writeMessage(6, this.f87979j);
            }
            if ((this.f87973d & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f87980k);
            }
            for (int i12 = 0; i12 < this.f87981l.size(); i12++) {
                codedOutputStream.writeMessage(8, this.f87981l.get(i12));
            }
            for (int i13 = 0; i13 < this.f87982m.size(); i13++) {
                codedOutputStream.writeInt32(31, this.f87982m.get(i13).intValue());
            }
            extensionWriterK.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87972c);
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return f87971p;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f87983n = (byte) -1;
            this.f87984o = -1;
            this.f87972c = extendableBuilder.getUnknownFields();
        }

        private TypeAlias(boolean z11) {
            this.f87983n = (byte) -1;
            this.f87984o = -1;
            this.f87972c = ByteString.EMPTY;
        }

        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Type.Builder builder;
            this.f87983n = (byte) -1;
            this.f87984o = -1;
            A();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f87973d |= 1;
                                this.f87974e = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f87973d |= 2;
                                this.f87975f = codedInputStream.readInt32();
                                continue;
                            case 26:
                                if ((i11 & 4) != 4) {
                                    this.f87976g = new ArrayList();
                                    i11 |= 4;
                                }
                                this.f87976g.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 34:
                                builder = (this.f87973d & 4) == 4 ? this.f87977h.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87977h = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f87977h = builder.buildPartial();
                                }
                                this.f87973d |= 4;
                                continue;
                            case 40:
                                this.f87973d |= 8;
                                this.f87978i = codedInputStream.readInt32();
                                continue;
                            case 50:
                                builder = (this.f87973d & 16) == 16 ? this.f87979j.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f87979j = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.f87979j = builder.buildPartial();
                                }
                                this.f87973d |= 16;
                                continue;
                            case 56:
                                this.f87973d |= 32;
                                this.f87980k = codedInputStream.readInt32();
                                continue;
                            case 66:
                                if ((i11 & 128) != 128) {
                                    this.f87981l = new ArrayList();
                                    i11 |= 128;
                                }
                                this.f87981l.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                                if ((i11 & 256) != 256) {
                                    this.f87982m = new ArrayList();
                                    i11 |= 256;
                                }
                                this.f87982m.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i11 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f87982m = new ArrayList();
                                    i11 |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f87982m.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            default:
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((i11 & 4) == 4) {
                            this.f87976g = Collections.unmodifiableList(this.f87976g);
                        }
                        if ((i11 & 128) == 128) {
                            this.f87981l = Collections.unmodifiableList(this.f87981l);
                        }
                        if ((i11 & 256) == 256) {
                            this.f87982m = Collections.unmodifiableList(this.f87982m);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f87972c = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i11 & 4) == 4) {
                this.f87976g = Collections.unmodifiableList(this.f87976g);
            }
            if ((i11 & 128) == 128) {
                this.f87981l = Collections.unmodifiableList(this.f87981l);
            }
            if ((i11 & 256) == 256) {
                this.f87982m = Collections.unmodifiableList(this.f87982m);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87972c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final TypeParameter f87995n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f87996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f87997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f87999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f88000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Variance f88001h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<Type> f88002i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<Integer> f88003j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f88004k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte f88005l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f88006m;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88007d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f88008e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f88009f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f88010g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private Variance f88011h = Variance.INV;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<Type> f88012i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<Integer> f88013j;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f88012i = list;
                this.f88013j = list;
                k();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
                if ((this.f88007d & 32) != 32) {
                    this.f88013j = new ArrayList(this.f88013j);
                    this.f88007d |= 32;
                }
            }

            private void j() {
                if ((this.f88007d & 16) != 16) {
                    this.f88012i = new ArrayList(this.f88012i);
                    this.f88007d |= 16;
                }
            }

            private void k() {
            }

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i11 = this.f88007d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                typeParameter.f87998e = this.f88008e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                typeParameter.f87999f = this.f88009f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                typeParameter.f88000g = this.f88010g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                typeParameter.f88001h = this.f88011h;
                if ((this.f88007d & 16) == 16) {
                    this.f88012i = Collections.unmodifiableList(this.f88012i);
                    this.f88007d &= -17;
                }
                typeParameter.f88002i = this.f88012i;
                if ((this.f88007d & 32) == 32) {
                    this.f88013j = Collections.unmodifiableList(this.f88013j);
                    this.f88007d &= -33;
                }
                typeParameter.f88003j = this.f88013j;
                typeParameter.f87997d = i12;
                return typeParameter;
            }

            public Type getUpperBound(int i11) {
                return this.f88012i.get(i11);
            }

            public int getUpperBoundCount() {
                return this.f88012i.size();
            }

            public boolean hasId() {
                return (this.f88007d & 1) == 1;
            }

            public boolean hasName() {
                return (this.f88007d & 2) == 2;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i11 = 0; i11 < getUpperBoundCount(); i11++) {
                    if (!getUpperBound(i11).isInitialized()) {
                        return false;
                    }
                }
                return e();
            }

            public Builder setId(int i11) {
                this.f88007d |= 1;
                this.f88008e = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f88007d |= 2;
                this.f88009f = i11;
                return this;
            }

            public Builder setReified(boolean z11) {
                this.f88007d |= 4;
                this.f88010g = z11;
                return this;
            }

            public Builder setVariance(Variance variance) {
                variance.getClass();
                this.f88007d |= 8;
                this.f88011h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(typeParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.f88002i.isEmpty()) {
                    if (this.f88012i.isEmpty()) {
                        this.f88012i = typeParameter.f88002i;
                        this.f88007d &= -17;
                    } else {
                        j();
                        this.f88012i.addAll(typeParameter.f88002i);
                    }
                }
                if (!typeParameter.f88003j.isEmpty()) {
                    if (this.f88013j.isEmpty()) {
                        this.f88013j = typeParameter.f88003j;
                        this.f88007d &= -33;
                    } else {
                        i();
                        this.f88013j.addAll(typeParameter.f88003j);
                    }
                }
                f(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.f87996c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter partialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        TypeParameter typeParameter2 = (TypeParameter) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeParameter != null) {
                        mergeFrom(typeParameter);
                    }
                    throw th;
                }
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<Variance> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Variance findValueByNumber(int i11) {
                    return Variance.valueOf(i11);
                }
            }

            Variance(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i11) {
                if (i11 == 0) {
                    return IN;
                }
                if (i11 == 1) {
                    return OUT;
                }
                if (i11 != 2) {
                    return null;
                }
                return INV;
            }
        }

        static class a extends AbstractParser<TypeParameter> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            f87995n = typeParameter;
            typeParameter.w();
        }

        public static TypeParameter getDefaultInstance() {
            return f87995n;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        private void w() {
            this.f87998e = 0;
            this.f87999f = 0;
            this.f88000g = false;
            this.f88001h = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.f88002i = list;
            this.f88003j = list;
        }

        public int getId() {
            return this.f87998e;
        }

        public int getName() {
            return this.f87999f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.f88000g;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88006m;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f87997d & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f87998e) : 0;
            if ((this.f87997d & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f87999f);
            }
            if ((this.f87997d & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f88000g);
            }
            if ((this.f87997d & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.f88001h.getNumber());
            }
            for (int i12 = 0; i12 < this.f88002i.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f88002i.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.f88003j.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f88003j.get(i13).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f88004k = iComputeInt32SizeNoTag;
            int iJ = iComputeInt32SizeNoTag2 + j() + this.f87996c.size();
            this.f88006m = iJ;
            return iJ;
        }

        public Type getUpperBound(int i11) {
            return this.f88002i.get(i11);
        }

        public int getUpperBoundCount() {
            return this.f88002i.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.f88003j;
        }

        public List<Type> getUpperBoundList() {
            return this.f88002i;
        }

        public Variance getVariance() {
            return this.f88001h;
        }

        public boolean hasId() {
            return (this.f87997d & 1) == 1;
        }

        public boolean hasName() {
            return (this.f87997d & 2) == 2;
        }

        public boolean hasReified() {
            return (this.f87997d & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.f87997d & 8) == 8;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88005l;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasId()) {
                this.f88005l = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.f88005l = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getUpperBoundCount(); i11++) {
                if (!getUpperBound(i11).isInitialized()) {
                    this.f88005l = (byte) 0;
                    return false;
                }
            }
            if (i()) {
                this.f88005l = (byte) 1;
                return true;
            }
            this.f88005l = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f87997d & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f87998e);
            }
            if ((this.f87997d & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f87999f);
            }
            if ((this.f87997d & 4) == 4) {
                codedOutputStream.writeBool(3, this.f88000g);
            }
            if ((this.f87997d & 8) == 8) {
                codedOutputStream.writeEnum(4, this.f88001h.getNumber());
            }
            for (int i11 = 0; i11 < this.f88002i.size(); i11++) {
                codedOutputStream.writeMessage(5, this.f88002i.get(i11));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.f88004k);
            }
            for (int i12 = 0; i12 < this.f88003j.size(); i12++) {
                codedOutputStream.writeInt32NoTag(this.f88003j.get(i12).intValue());
            }
            extensionWriterK.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f87996c);
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return f87995n;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f88004k = -1;
            this.f88005l = (byte) -1;
            this.f88006m = -1;
            this.f87996c = extendableBuilder.getUnknownFields();
        }

        private TypeParameter(boolean z11) {
            this.f88004k = -1;
            this.f88005l = (byte) -1;
            this.f88006m = -1;
            this.f87996c = ByteString.EMPTY;
        }

        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88004k = -1;
            this.f88005l = (byte) -1;
            this.f88006m = -1;
            w();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f87997d |= 1;
                                this.f87998e = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f87997d |= 2;
                                this.f87999f = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.f87997d |= 4;
                                this.f88000g = codedInputStream.readBool();
                            } else if (tag == 32) {
                                int i12 = codedInputStream.readEnum();
                                Variance varianceValueOf = Variance.valueOf(i12);
                                if (varianceValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.f87997d |= 8;
                                    this.f88001h = varianceValueOf;
                                }
                            } else if (tag == 42) {
                                if ((i11 & 16) != 16) {
                                    this.f88002i = new ArrayList();
                                    i11 |= 16;
                                }
                                this.f88002i.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag == 48) {
                                if ((i11 & 32) != 32) {
                                    this.f88003j = new ArrayList();
                                    i11 |= 32;
                                }
                                this.f88003j.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 50) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i11 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f88003j = new ArrayList();
                                    i11 |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f88003j.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 16) == 16) {
                        this.f88002i = Collections.unmodifiableList(this.f88002i);
                    }
                    if ((i11 & 32) == 32) {
                        this.f88003j = Collections.unmodifiableList(this.f88003j);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f87996c = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if ((i11 & 16) == 16) {
                this.f88002i = Collections.unmodifiableList(this.f88002i);
            }
            if ((i11 & 32) == 32) {
                this.f88003j = Collections.unmodifiableList(this.f88003j);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f87996c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final TypeTable f88014h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Type> f88017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f88019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f88020g;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88021b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<Type> f88022c = Collections.EMPTY_LIST;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88023d = -1;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f88021b & 1) != 1) {
                    this.f88022c = new ArrayList(this.f88022c);
                    this.f88021b |= 1;
                }
            }

            private void e() {
            }

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i11 = this.f88021b;
                if ((i11 & 1) == 1) {
                    this.f88022c = Collections.unmodifiableList(this.f88022c);
                    this.f88021b &= -2;
                }
                typeTable.f88017d = this.f88022c;
                int i12 = (i11 & 2) != 2 ? 0 : 1;
                typeTable.f88018e = this.f88023d;
                typeTable.f88016c = i12;
                return typeTable;
            }

            public Type getType(int i11) {
                return this.f88022c.get(i11);
            }

            public int getTypeCount() {
                return this.f88022c.size();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < getTypeCount(); i11++) {
                    if (!getType(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setFirstNullable(int i11) {
                this.f88021b |= 2;
                this.f88023d = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(typeTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.f88017d.isEmpty()) {
                    if (this.f88022c.isEmpty()) {
                        this.f88022c = typeTable.f88017d;
                        this.f88021b &= -2;
                    } else {
                        d();
                        this.f88022c.addAll(typeTable.f88017d);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.f88015b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable partialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        TypeTable typeTable2 = (TypeTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeTable != null) {
                        mergeFrom(typeTable);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<TypeTable> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            f88014h = typeTable;
            typeTable.m();
        }

        public static TypeTable getDefaultInstance() {
            return f88014h;
        }

        private void m() {
            this.f88017d = Collections.EMPTY_LIST;
            this.f88018e = -1;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public int getFirstNullable() {
            return this.f88018e;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88020g;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = 0;
            for (int i12 = 0; i12 < this.f88017d.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.f88017d.get(i12));
            }
            if ((this.f88016c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f88018e);
            }
            int size = iComputeInt32Size + this.f88015b.size();
            this.f88020g = size;
            return size;
        }

        public Type getType(int i11) {
            return this.f88017d.get(i11);
        }

        public int getTypeCount() {
            return this.f88017d.size();
        }

        public List<Type> getTypeList() {
            return this.f88017d;
        }

        public boolean hasFirstNullable() {
            return (this.f88016c & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88019f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getTypeCount(); i11++) {
                if (!getType(i11).isInitialized()) {
                    this.f88019f = (byte) 0;
                    return false;
                }
            }
            this.f88019f = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f88017d.size(); i11++) {
                codedOutputStream.writeMessage(1, this.f88017d.get(i11));
            }
            if ((this.f88016c & 1) == 1) {
                codedOutputStream.writeInt32(2, this.f88018e);
            }
            codedOutputStream.writeRawBytes(this.f88015b);
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return f88014h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88019f = (byte) -1;
            this.f88020g = -1;
            this.f88015b = builder.getUnknownFields();
        }

        private TypeTable(boolean z11) {
            this.f88019f = (byte) -1;
            this.f88020g = -1;
            this.f88015b = ByteString.EMPTY;
        }

        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88019f = (byte) -1;
            this.f88020g = -1;
            m();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!z12) {
                                    this.f88017d = new ArrayList();
                                    z12 = true;
                                }
                                this.f88017d.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag != 16) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f88016c |= 1;
                                this.f88018e = codedInputStream.readInt32();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (z12) {
                            this.f88017d = Collections.unmodifiableList(this.f88017d);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f88015b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z12) {
                this.f88017d = Collections.unmodifiableList(this.f88017d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88015b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final ValueParameter f88024m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ByteString f88025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f88026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f88028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Type f88029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f88030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Type f88031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f88032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private byte f88033k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f88034l;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88035d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f88036e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f88037f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f88039h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f88041j;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Type f88038g = Type.getDefaultInstance();

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private Type f88040i = Type.getDefaultInstance();

            private Builder() {
                i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder h() {
                return new Builder();
            }

            private void i() {
            }

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i11 = this.f88035d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                valueParameter.f88027e = this.f88036e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                valueParameter.f88028f = this.f88037f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                valueParameter.f88029g = this.f88038g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                valueParameter.f88030h = this.f88039h;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                valueParameter.f88031i = this.f88040i;
                if ((i11 & 32) == 32) {
                    i12 |= 32;
                }
                valueParameter.f88032j = this.f88041j;
                valueParameter.f88026d = i12;
                return valueParameter;
            }

            public Type getType() {
                return this.f88038g;
            }

            public Type getVarargElementType() {
                return this.f88040i;
            }

            public boolean hasName() {
                return (this.f88035d & 2) == 2;
            }

            public boolean hasType() {
                return (this.f88035d & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.f88035d & 16) == 16;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    return (!hasVarargElementType() || getVarargElementType().isInitialized()) && e();
                }
                return false;
            }

            public Builder mergeType(Type type) {
                if ((this.f88035d & 4) != 4 || this.f88038g == Type.getDefaultInstance()) {
                    this.f88038g = type;
                } else {
                    this.f88038g = Type.newBuilder(this.f88038g).mergeFrom(type).buildPartial();
                }
                this.f88035d |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.f88035d & 16) != 16 || this.f88040i == Type.getDefaultInstance()) {
                    this.f88040i = type;
                } else {
                    this.f88040i = Type.newBuilder(this.f88040i).mergeFrom(type).buildPartial();
                }
                this.f88035d |= 16;
                return this;
            }

            public Builder setFlags(int i11) {
                this.f88035d |= 1;
                this.f88036e = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f88035d |= 2;
                this.f88037f = i11;
                return this;
            }

            public Builder setTypeId(int i11) {
                this.f88035d |= 8;
                this.f88039h = i11;
                return this;
            }

            public Builder setVarargElementTypeId(int i11) {
                this.f88035d |= 32;
                this.f88041j = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(valueParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                f(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.f88025c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return h().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter partialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        ValueParameter valueParameter2 = (ValueParameter) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (valueParameter != null) {
                        mergeFrom(valueParameter);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<ValueParameter> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            f88024m = valueParameter;
            valueParameter.u();
        }

        public static ValueParameter getDefaultInstance() {
            return f88024m;
        }

        public static Builder newBuilder() {
            return Builder.h();
        }

        private void u() {
            this.f88027e = 0;
            this.f88028f = 0;
            this.f88029g = Type.getDefaultInstance();
            this.f88030h = 0;
            this.f88031i = Type.getDefaultInstance();
            this.f88032j = 0;
        }

        public int getFlags() {
            return this.f88027e;
        }

        public int getName() {
            return this.f88028f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88034l;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f88026d & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f88027e) : 0;
            if ((this.f88026d & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f88028f);
            }
            if ((this.f88026d & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f88029g);
            }
            if ((this.f88026d & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f88031i);
            }
            if ((this.f88026d & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f88030h);
            }
            if ((this.f88026d & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.f88032j);
            }
            int iJ = iComputeInt32Size + j() + this.f88025c.size();
            this.f88034l = iJ;
            return iJ;
        }

        public Type getType() {
            return this.f88029g;
        }

        public int getTypeId() {
            return this.f88030h;
        }

        public Type getVarargElementType() {
            return this.f88031i;
        }

        public int getVarargElementTypeId() {
            return this.f88032j;
        }

        public boolean hasFlags() {
            return (this.f88026d & 1) == 1;
        }

        public boolean hasName() {
            return (this.f88026d & 2) == 2;
        }

        public boolean hasType() {
            return (this.f88026d & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.f88026d & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.f88026d & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.f88026d & 32) == 32;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88033k;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f88033k = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.f88033k = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.f88033k = (byte) 0;
                return false;
            }
            if (i()) {
                this.f88033k = (byte) 1;
                return true;
            }
            this.f88033k = (byte) 0;
            return false;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterK = k();
            if ((this.f88026d & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f88027e);
            }
            if ((this.f88026d & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f88028f);
            }
            if ((this.f88026d & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f88029g);
            }
            if ((this.f88026d & 16) == 16) {
                codedOutputStream.writeMessage(4, this.f88031i);
            }
            if ((this.f88026d & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f88030h);
            }
            if ((this.f88026d & 32) == 32) {
                codedOutputStream.writeInt32(6, this.f88032j);
            }
            extensionWriterK.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f88025c);
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return f88024m;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f88033k = (byte) -1;
            this.f88034l = -1;
            this.f88025c = extendableBuilder.getUnknownFields();
        }

        private ValueParameter(boolean z11) {
            this.f88033k = (byte) -1;
            this.f88034l = -1;
            this.f88025c = ByteString.EMPTY;
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Type.Builder builder;
            this.f88033k = (byte) -1;
            this.f88034l = -1;
            u();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f88026d |= 1;
                                this.f88027e = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (tag == 26) {
                                    builder = (this.f88026d & 4) == 4 ? this.f88029g.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f88029g = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f88029g = builder.buildPartial();
                                    }
                                    this.f88026d |= 4;
                                } else if (tag == 34) {
                                    builder = (this.f88026d & 16) == 16 ? this.f88031i.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f88031i = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.f88031i = builder.buildPartial();
                                    }
                                    this.f88026d |= 16;
                                } else if (tag == 40) {
                                    this.f88026d |= 8;
                                    this.f88030h = codedInputStream.readInt32();
                                } else if (tag != 48) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f88026d |= 32;
                                    this.f88032j = codedInputStream.readInt32();
                                }
                            } else {
                                this.f88026d |= 2;
                                this.f88028f = codedInputStream.readInt32();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f88025c = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88025c = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final VersionRequirement f88042l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f88045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Level f88047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f88048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f88049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private VersionKind f88050i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f88051j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f88052k;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f88054c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88055d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f88057f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f88058g;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Level f88056e = Level.ERROR;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private VersionKind f88059h = VersionKind.LANGUAGE_VERSION;

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
            }

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i11 = this.f88053b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                versionRequirement.f88045d = this.f88054c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                versionRequirement.f88046e = this.f88055d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                versionRequirement.f88047f = this.f88056e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                versionRequirement.f88048g = this.f88057f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                versionRequirement.f88049h = this.f88058g;
                if ((i11 & 32) == 32) {
                    i12 |= 32;
                }
                versionRequirement.f88050i = this.f88059h;
                versionRequirement.f88044c = i12;
                return versionRequirement;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setErrorCode(int i11) {
                this.f88053b |= 8;
                this.f88057f = i11;
                return this;
            }

            public Builder setLevel(Level level) {
                level.getClass();
                this.f88053b |= 4;
                this.f88056e = level;
                return this;
            }

            public Builder setMessage(int i11) {
                this.f88053b |= 16;
                this.f88058g = i11;
                return this;
            }

            public Builder setVersion(int i11) {
                this.f88053b |= 1;
                this.f88054c = i11;
                return this;
            }

            public Builder setVersionFull(int i11) {
                this.f88053b |= 2;
                this.f88055d = i11;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                versionKind.getClass();
                this.f88053b |= 32;
                this.f88059h = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(versionRequirementBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.f88043b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement partialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirement != null) {
                        mergeFrom(versionRequirement);
                    }
                    throw th;
                }
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<Level> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Level findValueByNumber(int i11) {
                    return Level.valueOf(i11);
                }
            }

            Level(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i11) {
                if (i11 == 0) {
                    return WARNING;
                }
                if (i11 == 1) {
                    return ERROR;
                }
                if (i11 != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new a();
            private final int value;

            static class a implements Internal.EnumLiteMap<VersionKind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public VersionKind findValueByNumber(int i11) {
                    return VersionKind.valueOf(i11);
                }
            }

            VersionKind(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i11) {
                if (i11 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i11 == 1) {
                    return COMPILER_VERSION;
                }
                if (i11 != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        static class a extends AbstractParser<VersionRequirement> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            f88042l = versionRequirement;
            versionRequirement.p();
        }

        public static VersionRequirement getDefaultInstance() {
            return f88042l;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        private void p() {
            this.f88045d = 0;
            this.f88046e = 0;
            this.f88047f = Level.ERROR;
            this.f88048g = 0;
            this.f88049h = 0;
            this.f88050i = VersionKind.LANGUAGE_VERSION;
        }

        public int getErrorCode() {
            return this.f88048g;
        }

        public Level getLevel() {
            return this.f88047f;
        }

        public int getMessage() {
            return this.f88049h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88052k;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f88044c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f88045d) : 0;
            if ((this.f88044c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f88046e);
            }
            if ((this.f88044c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f88047f.getNumber());
            }
            if ((this.f88044c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f88048g);
            }
            if ((this.f88044c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f88049h);
            }
            if ((this.f88044c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(6, this.f88050i.getNumber());
            }
            int size = iComputeInt32Size + this.f88043b.size();
            this.f88052k = size;
            return size;
        }

        public int getVersion() {
            return this.f88045d;
        }

        public int getVersionFull() {
            return this.f88046e;
        }

        public VersionKind getVersionKind() {
            return this.f88050i;
        }

        public boolean hasErrorCode() {
            return (this.f88044c & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.f88044c & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.f88044c & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.f88044c & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.f88044c & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.f88044c & 32) == 32;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88051j;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f88051j = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f88044c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f88045d);
            }
            if ((this.f88044c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f88046e);
            }
            if ((this.f88044c & 4) == 4) {
                codedOutputStream.writeEnum(3, this.f88047f.getNumber());
            }
            if ((this.f88044c & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f88048g);
            }
            if ((this.f88044c & 16) == 16) {
                codedOutputStream.writeInt32(5, this.f88049h);
            }
            if ((this.f88044c & 32) == 32) {
                codedOutputStream.writeEnum(6, this.f88050i.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f88043b);
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return f88042l;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88051j = (byte) -1;
            this.f88052k = -1;
            this.f88043b = builder.getUnknownFields();
        }

        private VersionRequirement(boolean z11) {
            this.f88051j = (byte) -1;
            this.f88052k = -1;
            this.f88043b = ByteString.EMPTY;
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88051j = (byte) -1;
            this.f88052k = -1;
            p();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f88044c |= 1;
                                this.f88045d = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f88044c |= 2;
                                this.f88046e = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i11 = codedInputStream.readEnum();
                                Level levelValueOf = Level.valueOf(i11);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f88044c |= 4;
                                    this.f88047f = levelValueOf;
                                }
                            } else if (tag == 32) {
                                this.f88044c |= 8;
                                this.f88048g = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.f88044c |= 16;
                                this.f88049h = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i12 = codedInputStream.readEnum();
                                VersionKind versionKindValueOf = VersionKind.valueOf(i12);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i12);
                                } else {
                                    this.f88044c |= 32;
                                    this.f88050i = versionKindValueOf;
                                }
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f88043b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88043b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final VersionRequirementTable f88060f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<VersionRequirement> f88062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f88063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88064e;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88065b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<VersionRequirement> f88066c = Collections.EMPTY_LIST;

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f88065b & 1) != 1) {
                    this.f88066c = new ArrayList(this.f88066c);
                    this.f88065b |= 1;
                }
            }

            private void e() {
            }

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f88065b & 1) == 1) {
                    this.f88066c = Collections.unmodifiableList(this.f88066c);
                    this.f88065b &= -2;
                }
                versionRequirementTable.f88062c = this.f88066c;
                return versionRequirementTable;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(versionRequirementTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.f88062c.isEmpty()) {
                    if (this.f88066c.isEmpty()) {
                        this.f88066c = versionRequirementTable.f88062c;
                        this.f88065b &= -2;
                    } else {
                        d();
                        this.f88066c.addAll(versionRequirementTable.f88062c);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.f88061b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable partialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirementTable != null) {
                        mergeFrom(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<VersionRequirementTable> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            f88060f = versionRequirementTable;
            versionRequirementTable.k();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return f88060f;
        }

        private void k() {
            this.f88062c = Collections.EMPTY_LIST;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.f88062c.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.f88062c;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88064e;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.f88062c.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f88062c.get(i12));
            }
            int size = iComputeMessageSize + this.f88061b.size();
            this.f88064e = size;
            return size;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88063d;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f88063d = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f88062c.size(); i11++) {
                codedOutputStream.writeMessage(1, this.f88062c.get(i11));
            }
            codedOutputStream.writeRawBytes(this.f88061b);
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return f88060f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88063d = (byte) -1;
            this.f88064e = -1;
            this.f88061b = builder.getUnknownFields();
        }

        private VersionRequirementTable(boolean z11) {
            this.f88063d = (byte) -1;
            this.f88064e = -1;
            this.f88061b = ByteString.EMPTY;
        }

        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88063d = (byte) -1;
            this.f88064e = -1;
            k();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.f88062c = new ArrayList();
                                        z12 = true;
                                    }
                                    this.f88062c.add((VersionRequirement) codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.f88062c = Collections.unmodifiableList(this.f88062c);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f88061b = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if (z12) {
                this.f88062c = Collections.unmodifiableList(this.f88062c);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88061b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new a();
        private final int value;

        static class a implements Internal.EnumLiteMap<Visibility> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Visibility findValueByNumber(int i11) {
                return Visibility.valueOf(i11);
            }
        }

        Visibility(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i11) {
            if (i11 == 0) {
                return INTERNAL;
            }
            if (i11 == 1) {
                return PRIVATE;
            }
            if (i11 == 2) {
                return PROTECTED;
            }
            if (i11 == 3) {
                return PUBLIC;
            }
            if (i11 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i11 != 5) {
                return null;
            }
            return LOCAL;
        }
    }
}
