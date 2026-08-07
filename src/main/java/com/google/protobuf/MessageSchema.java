package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i11, int i12, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z11, int[] iArr2, int i13, int i14, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i11;
        this.maxFieldNumber = i12;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z11;
        this.intArray = iArr2;
        this.checkInitializedCount = i13;
        this.repeatedFieldOffsetStart = i14;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t11, T t12, int i11) {
        return isFieldPresent(t11, i11) == isFieldPresent(t12, i11);
    }

    private static <T> boolean booleanAt(T t11, long j11) {
        return UnsafeUtil.getBoolean(t11, j11);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i11, int i12, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
        int i13 = registers.int1;
        if (i13 < 0 || i13 > i12 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = iDecodeVarint32 + i13;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i14) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i15 = bArr[iDecodeVarint32];
            if (i15 < 0) {
                iDecodeVarint33 = ArrayDecoders.decodeVarint32(i15, bArr, iDecodeVarint33, registers);
                i15 = registers.int1;
            }
            int i16 = iDecodeVarint33;
            int i17 = i15 >>> 3;
            int i18 = i15 & 7;
            if (i17 != 1) {
                if (i17 == 2 && i18 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i16, i12, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i15, bArr, i16, i12, registers);
                }
            } else if (i18 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i16, i12, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i15, bArr, i16, i12, registers);
            }
        }
        if (iDecodeVarint32 != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i14;
    }

    private int decodeMapEntryValue(byte[] bArr, int i11, int i12, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i11, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i11));
                return i11 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i11));
                return i11 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i11));
                return i11 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i11));
                return i11 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i11, i12, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i11, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t11, long j11) {
        return UnsafeUtil.getDouble(t11, j11);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i11, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i11);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i11)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i11)) == null) ? ub2 : (UB) filterUnknownEnumMap(i11, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i11, int i12, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i12, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t11, long j11) {
        return UnsafeUtil.getFloat(t11, j11);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i11) {
        return (Internal.EnumVerifier) this.objects[((i11 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i11) {
        return this.objects[(i11 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i11) {
        int i12 = (i11 / 3) * 2;
        Schema schema = (Schema) this.objects[i12];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i12 + 1]);
        this.objects[i12] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t11) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t11));
    }

    private static <T> int intAt(T t11, long j11) {
        return UnsafeUtil.getInt(t11, j11);
    }

    private static boolean isEnforceUtf8(int i11) {
        return (i11 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t11, int i11, int i12, int i13, int i14) {
        if (i12 == 1048575) {
            return isFieldPresent(t11, i11);
        }
        return (i13 & i14) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i11) {
        return (i11 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i11, int i12) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i11));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!messageFieldSchema.isInitialized(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t11, int i11, int i12) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t11, offset(i11)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t11, T t12, int i11) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11) & 1048575;
        return UnsafeUtil.getInt(t11, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t12, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t11, int i11, int i12) {
        return UnsafeUtil.getInt(t11, (long) (presenceMaskAndOffsetAt(i12) & 1048575)) == i11;
    }

    private static boolean isRequired(int i11) {
        return (i11 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t11, long j11) {
        return UnsafeUtil.getLong(t11, j11);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i11, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jOffset = offset(typeAndOffsetAt(i11));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t11, T t12, int i11) {
        if (isFieldPresent(t12, i11)) {
            long jOffset = offset(typeAndOffsetAt(i11));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t12, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i11) + " is present but null: " + t12);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i11);
            if (!isFieldPresent(t11, i11)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t11, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t11, jOffset, object);
                }
                setFieldPresent(t11, i11);
                return;
            }
            Object object2 = unsafe.getObject(t11, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t11, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t11, T t12, int i11) {
        int iNumberAt = numberAt(i11);
        if (isOneofPresent(t12, iNumberAt, i11)) {
            long jOffset = offset(typeAndOffsetAt(i11));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t12, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i11) + " is present but null: " + t12);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i11);
            if (!isOneofPresent(t11, iNumberAt, i11)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t11, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t11, jOffset, object);
                }
                setOneofPresent(t11, iNumberAt, i11);
                return;
            }
            Object object2 = unsafe.getObject(t11, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t11, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t11, T t12, int i11) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i11);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i11);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putDouble(t11, jOffset, UnsafeUtil.getDouble(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 1:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putFloat(t11, jOffset, UnsafeUtil.getFloat(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 2:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, jOffset, UnsafeUtil.getLong(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 3:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, jOffset, UnsafeUtil.getLong(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 4:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, jOffset, UnsafeUtil.getInt(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 5:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, jOffset, UnsafeUtil.getLong(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 6:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, jOffset, UnsafeUtil.getInt(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 7:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putBoolean(t11, jOffset, UnsafeUtil.getBoolean(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 8:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putObject(t11, jOffset, UnsafeUtil.getObject(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 9:
                mergeMessage(t11, t12, i11);
                break;
            case 10:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putObject(t11, jOffset, UnsafeUtil.getObject(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 11:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, jOffset, UnsafeUtil.getInt(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 12:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, jOffset, UnsafeUtil.getInt(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 13:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, jOffset, UnsafeUtil.getInt(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 14:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, jOffset, UnsafeUtil.getLong(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 15:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putInt(t11, jOffset, UnsafeUtil.getInt(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 16:
                if (isFieldPresent(t12, i11)) {
                    UnsafeUtil.putLong(t11, jOffset, UnsafeUtil.getLong(t12, jOffset));
                    setFieldPresent(t11, i11);
                }
                break;
            case 17:
                mergeMessage(t11, t12, i11);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t11, t12, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t11, t12, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t12, iNumberAt, i11)) {
                    UnsafeUtil.putObject(t11, jOffset, UnsafeUtil.getObject(t12, jOffset));
                    setOneofPresent(t11, iNumberAt, i11);
                }
                break;
            case 60:
                mergeOneofMessage(t11, t12, i11);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t12, iNumberAt, i11)) {
                    UnsafeUtil.putObject(t11, jOffset, UnsafeUtil.getObject(t12, jOffset));
                    setOneofPresent(t11, iNumberAt, i11);
                }
                break;
            case 68:
                mergeOneofMessage(t11, t12, i11);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t11, int i11) {
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        long jOffset = offset(typeAndOffsetAt(i11));
        if (!isFieldPresent(t11, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t11, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t11, int i11, int i12) {
        Schema messageFieldSchema = getMessageFieldSchema(i12);
        if (!isOneofPresent(t11, i11, i12)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t11, offset(typeAndOffsetAt(i12)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i11 = 0;
        int i12 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i11++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i12++;
            }
        }
        int[] iArr2 = i11 > 0 ? new int[i11] : null;
        int[] iArr3 = i12 > 0 ? new int[i12] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < fields.length) {
            FieldInfo fieldInfo2 = fields[i13];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i14, objArr);
            if (i15 < checkInitialized.length && checkInitialized[i15] == fieldNumber3) {
                checkInitialized[i15] = i14;
                i15++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i16] = i14;
                i16++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i17] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i17++;
                }
                i13++;
                i14 += 3;
            }
            i13++;
            i14 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i11;
        int iCharAt;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        char cCharAt;
        int i19;
        char cCharAt2;
        int i21;
        char cCharAt3;
        int i22;
        char cCharAt4;
        int i23;
        char cCharAt5;
        int i24;
        char cCharAt6;
        int i25;
        char cCharAt7;
        int i26;
        char cCharAt8;
        int i27;
        int i28;
        int i29;
        int i31;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i32;
        int i33;
        int iObjectFieldOffset3;
        int i34;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i35;
        int i36;
        int i37;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i38;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i39;
        char cCharAt10;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        int i43;
        char cCharAt13;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c11 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i11 = i44 + 1;
                if (stringInfo.charAt(i44) < 55296) {
                    break;
                }
                i44 = i11;
            }
        } else {
            i11 = 1;
        }
        int i45 = i11 + 1;
        int iCharAt2 = stringInfo.charAt(i11);
        if (iCharAt2 >= 55296) {
            int i46 = iCharAt2 & 8191;
            int i47 = 13;
            while (true) {
                i43 = i45 + 1;
                cCharAt13 = stringInfo.charAt(i45);
                if (cCharAt13 < 55296) {
                    break;
                }
                i46 |= (cCharAt13 & 8191) << i47;
                i47 += 13;
                i45 = i43;
            }
            iCharAt2 = i46 | (cCharAt13 << i47);
            i45 = i43;
        }
        if (iCharAt2 == 0) {
            i14 = 0;
            iCharAt = 0;
            i13 = 0;
            i17 = 0;
            i12 = 0;
            i16 = 0;
            iArr = EMPTY_INT_ARRAY;
            i15 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt3 = stringInfo.charAt(i45);
            if (iCharAt3 >= 55296) {
                int i49 = iCharAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i26 = i48 + 1;
                    cCharAt8 = stringInfo.charAt(i48);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt8 & 8191) << i51;
                    i51 += 13;
                    i48 = i26;
                }
                iCharAt3 = i49 | (cCharAt8 << i51);
                i48 = i26;
            }
            int i52 = i48 + 1;
            int iCharAt4 = stringInfo.charAt(i48);
            if (iCharAt4 >= 55296) {
                int i53 = iCharAt4 & 8191;
                int i54 = 13;
                while (true) {
                    i25 = i52 + 1;
                    cCharAt7 = stringInfo.charAt(i52);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i25;
                }
                iCharAt4 = i53 | (cCharAt7 << i54);
                i52 = i25;
            }
            int i55 = i52 + 1;
            int iCharAt5 = stringInfo.charAt(i52);
            if (iCharAt5 >= 55296) {
                int i56 = iCharAt5 & 8191;
                int i57 = 13;
                while (true) {
                    i24 = i55 + 1;
                    cCharAt6 = stringInfo.charAt(i55);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i24;
                }
                iCharAt5 = i56 | (cCharAt6 << i57);
                i55 = i24;
            }
            int i58 = i55 + 1;
            int iCharAt6 = stringInfo.charAt(i55);
            if (iCharAt6 >= 55296) {
                int i59 = iCharAt6 & 8191;
                int i61 = 13;
                while (true) {
                    i23 = i58 + 1;
                    cCharAt5 = stringInfo.charAt(i58);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt5 & 8191) << i61;
                    i61 += 13;
                    i58 = i23;
                }
                iCharAt6 = i59 | (cCharAt5 << i61);
                i58 = i23;
            }
            int i62 = i58 + 1;
            iCharAt = stringInfo.charAt(i58);
            if (iCharAt >= 55296) {
                int i63 = iCharAt & 8191;
                int i64 = 13;
                while (true) {
                    i22 = i62 + 1;
                    cCharAt4 = stringInfo.charAt(i62);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i22;
                }
                iCharAt = i63 | (cCharAt4 << i64);
                i62 = i22;
            }
            int i65 = i62 + 1;
            int iCharAt7 = stringInfo.charAt(i62);
            if (iCharAt7 >= 55296) {
                int i66 = iCharAt7 & 8191;
                int i67 = 13;
                while (true) {
                    i21 = i65 + 1;
                    cCharAt3 = stringInfo.charAt(i65);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i21;
                }
                iCharAt7 = i66 | (cCharAt3 << i67);
                i65 = i21;
            }
            int i68 = i65 + 1;
            int iCharAt8 = stringInfo.charAt(i65);
            if (iCharAt8 >= 55296) {
                int i69 = iCharAt8 & 8191;
                int i71 = 13;
                while (true) {
                    i19 = i68 + 1;
                    cCharAt2 = stringInfo.charAt(i68);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i71;
                    i71 += 13;
                    i68 = i19;
                }
                iCharAt8 = i69 | (cCharAt2 << i71);
                i68 = i19;
            }
            int i72 = i68 + 1;
            int iCharAt9 = stringInfo.charAt(i68);
            if (iCharAt9 >= 55296) {
                int i73 = iCharAt9 & 8191;
                int i74 = 13;
                while (true) {
                    i18 = i72 + 1;
                    cCharAt = stringInfo.charAt(i72);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i73 |= (cCharAt & 8191) << i74;
                    i74 += 13;
                    i72 = i18;
                }
                iCharAt9 = i73 | (cCharAt << i74);
                i72 = i18;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i12 = (iCharAt3 * 2) + iCharAt4;
            int i75 = iCharAt7;
            i13 = iCharAt5;
            i14 = i75;
            i15 = iCharAt3;
            iArr = iArr2;
            i16 = iCharAt9;
            i45 = i72;
            i17 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i76 = i16 + i14;
        int i77 = i76;
        int i78 = i16;
        int i79 = 0;
        int i81 = 0;
        while (i45 < length) {
            int i82 = i45 + 1;
            int iCharAt10 = stringInfo.charAt(i45);
            if (iCharAt10 >= c11) {
                int i83 = iCharAt10 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i42 = i84 + 1;
                    cCharAt12 = stringInfo.charAt(i84);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i83 |= (cCharAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i42;
                }
                iCharAt10 = i83 | (cCharAt12 << i85);
                i27 = i42;
            } else {
                i27 = i82;
            }
            int i86 = i27 + 1;
            int iCharAt11 = stringInfo.charAt(i27);
            if (iCharAt11 >= c11) {
                int i87 = iCharAt11 & 8191;
                int i88 = i86;
                int i89 = 13;
                while (true) {
                    i41 = i88 + 1;
                    cCharAt11 = stringInfo.charAt(i88);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i87 |= (cCharAt11 & 8191) << i89;
                    i89 += 13;
                    i88 = i41;
                }
                iCharAt11 = i87 | (cCharAt11 << i89);
                i28 = i41;
            } else {
                i28 = i86;
            }
            int i91 = iCharAt11 & 255;
            int i92 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i79] = i81;
                i79++;
            }
            int[] iArr4 = iArr3;
            if (i91 >= 51) {
                int i93 = i28 + 1;
                int iCharAt12 = stringInfo.charAt(i28);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i94 = iCharAt12 & 8191;
                    int i95 = 13;
                    while (true) {
                        i39 = i93 + 1;
                        cCharAt10 = stringInfo.charAt(i93);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i94 |= (cCharAt10 & 8191) << i95;
                        i95 += 13;
                        i93 = i39;
                        c12 = 55296;
                    }
                    iCharAt12 = i94 | (cCharAt10 << i95);
                    i93 = i39;
                }
                int i96 = i91 - 51;
                int i97 = i93;
                if (i96 == 9 || i96 == 17) {
                    i36 = i12 + 1;
                    objArr[((i81 / 3) * 2) + 1] = objects[i12];
                } else {
                    if (i96 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i36 = i12 + 1;
                        objArr[((i81 / 3) * 2) + 1] = objects[i12];
                    }
                    i37 = iCharAt12 * 2;
                    obj = objects[i37];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i37] = fieldReflectField2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i38 = i37 + 1;
                    obj2 = objects[i38];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i38] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i34 = iObjectFieldOffset4;
                    i33 = 0;
                    i29 = iCharAt10;
                    i45 = i97;
                }
                i12 = i36;
                i37 = iCharAt12 * 2;
                obj = objects[i37];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i37] = fieldReflectField2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i38 = i37 + 1;
                obj2 = objects[i38];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i38] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i34 = iObjectFieldOffset5;
                i33 = 0;
                i29 = iCharAt10;
                i45 = i97;
            } else {
                int i98 = i12 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i12]);
                if (i91 == 9 || i91 == 17) {
                    i29 = iCharAt10;
                    objArr[((i81 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i91 == 27 || i91 == 49) {
                        i29 = iCharAt10;
                        i35 = i12 + 2;
                        objArr[((i81 / 3) * 2) + 1] = objects[i98];
                    } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                        i29 = iCharAt10;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i35 = i12 + 2;
                            objArr[((i81 / 3) * 2) + 1] = objects[i98];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i91 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i32 = i28;
                            i33 = 0;
                        } else {
                            int i99 = i28 + 1;
                            int iCharAt13 = stringInfo.charAt(i28);
                            if (iCharAt13 >= 55296) {
                                int i100 = iCharAt13 & 8191;
                                int i101 = 13;
                                while (true) {
                                    i32 = i99 + 1;
                                    cCharAt9 = stringInfo.charAt(i99);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i100 |= (cCharAt9 & 8191) << i101;
                                    i101 += 13;
                                    i99 = i32;
                                }
                                iCharAt13 = i100 | (cCharAt9 << i101);
                            } else {
                                i32 = i99;
                            }
                            int i102 = (i15 * 2) + (iCharAt13 / 32);
                            Object obj3 = objects[i102];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i102] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i33 = iCharAt13 % 32;
                        }
                        int i103 = iObjectFieldOffset2;
                        if (i91 >= 18 && i91 <= 49) {
                            iArr[i77] = iObjectFieldOffset;
                            i77++;
                        }
                        iObjectFieldOffset3 = i103;
                        i34 = iObjectFieldOffset;
                        i12 = i31;
                        i45 = i32;
                    } else {
                        if (i91 == 50) {
                            int i104 = i78 + 1;
                            iArr[i78] = i81;
                            int i105 = (i81 / 3) * 2;
                            int i106 = i12 + 2;
                            objArr[i105] = objects[i98];
                            if ((iCharAt11 & 2048) != 0) {
                                i31 = i12 + 3;
                                objArr[i105 + 1] = objects[i106];
                                i29 = iCharAt10;
                                i78 = i104;
                            } else {
                                i31 = i106;
                                i78 = i104;
                                i29 = iCharAt10;
                            }
                        } else {
                            i29 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i32 = i28;
                            i33 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i32 = i28;
                            i33 = 0;
                        }
                        int i107 = iObjectFieldOffset2;
                        if (i91 >= 18) {
                            iArr[i77] = iObjectFieldOffset;
                            i77++;
                        }
                        iObjectFieldOffset3 = i107;
                        i34 = iObjectFieldOffset;
                        i12 = i31;
                        i45 = i32;
                    }
                    i31 = i35;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i32 = i28;
                        i33 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i32 = i28;
                        i33 = 0;
                    }
                    int i108 = iObjectFieldOffset2;
                    if (i91 >= 18) {
                        iArr[i77] = iObjectFieldOffset;
                        i77++;
                    }
                    iObjectFieldOffset3 = i108;
                    i34 = iObjectFieldOffset;
                    i12 = i31;
                    i45 = i32;
                }
                i31 = i98;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i32 = i28;
                    i33 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i32 = i28;
                    i33 = 0;
                }
                int i109 = iObjectFieldOffset2;
                if (i91 >= 18) {
                    iArr[i77] = iObjectFieldOffset;
                    i77++;
                }
                iObjectFieldOffset3 = i109;
                i34 = iObjectFieldOffset;
                i12 = i31;
                i45 = i32;
            }
            int i110 = i81 + 1;
            iArr4[i81] = i29;
            int i111 = i81 + 2;
            int i112 = iObjectFieldOffset3;
            iArr4[i110] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i91 << 20) | i34;
            i81 += 3;
            iArr4[i111] = (i33 << 20) | i112;
            length = i92;
            iArr3 = iArr4;
            stringInfo = stringInfo;
            c11 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i13, i17, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i16, i76, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i11) {
        return this.buffer[i11];
    }

    private static long offset(int i11) {
        return i11 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t11, long j11) {
        return ((Boolean) UnsafeUtil.getObject(t11, j11)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t11, long j11) {
        return ((Double) UnsafeUtil.getObject(t11, j11)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t11, long j11) {
        return ((Float) UnsafeUtil.getObject(t11, j11)).floatValue();
    }

    private static <T> int oneofIntAt(T t11, long j11) {
        return ((Integer) UnsafeUtil.getObject(t11, j11)).intValue();
    }

    private static <T> long oneofLongAt(T t11, long j11) {
        return ((Long) UnsafeUtil.getObject(t11, j11)).longValue();
    }

    private <K, V> int parseMapField(T t11, byte[] bArr, int i11, int i12, int i13, long j11, ArrayDecoders.Registers registers) {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i13);
        Object object = unsafe.getObject(t11, j11);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t11, j11, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i11, i12, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Unsafe unsafe = UNSAFE;
        long j12 = this.buffer[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t11, j11, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i11)));
                int i19 = i11 + 8;
                unsafe.putInt(t11, j12, i14);
                return i19;
            case 52:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t11, j11, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i11)));
                int i21 = i11 + 4;
                unsafe.putInt(t11, j12, i14);
                return i21;
            case 53:
            case 54:
                if (i15 != 0) {
                    return i11;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                unsafe.putObject(t11, j11, Long.valueOf(registers.long1));
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i15 != 0) {
                    return i11;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                unsafe.putObject(t11, j11, Integer.valueOf(registers.int1));
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t11, j11, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i11)));
                int i22 = i11 + 8;
                unsafe.putInt(t11, j12, i14);
                return i22;
            case 57:
            case 64:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t11, j11, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i11)));
                int i23 = i11 + 4;
                unsafe.putInt(t11, j12, i14);
                return i23;
            case 58:
                if (i15 != 0) {
                    return i11;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                unsafe.putObject(t11, j11, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint65;
            case 59:
                if (i15 != 2) {
                    return i11;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                int i24 = registers.int1;
                if (i24 == 0) {
                    unsafe.putObject(t11, j11, "");
                } else {
                    if ((i16 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i24)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t11, j11, new String(bArr, iDecodeVarint33, i24, Internal.UTF_8));
                    iDecodeVarint33 += i24;
                }
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint33;
            case 60:
                if (i15 != 2) {
                    return i11;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t11, i14, i18);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i18), bArr, i11, i12, registers);
                storeOneofMessageField(t11, i14, i18, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i15 != 2) {
                    return i11;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i11, registers);
                unsafe.putObject(t11, j11, registers.object1);
                unsafe.putInt(t11, j12, i14);
                return iDecodeBytes;
            case 63:
                if (i15 != 0) {
                    return i11;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                int i25 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i18);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i25)) {
                    getMutableUnknownFields(t11).storeField(i13, Long.valueOf(i25));
                    return iDecodeVarint34;
                }
                unsafe.putObject(t11, j11, Integer.valueOf(i25));
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint34;
            case 66:
                if (i15 != 0) {
                    return i11;
                }
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(bArr, i11, registers);
                unsafe.putObject(t11, j11, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint35;
            case 67:
                if (i15 != 0) {
                    return i11;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i11, registers);
                unsafe.putObject(t11, j11, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t11, j12, i14);
                return iDecodeVarint66;
            case 68:
                if (i15 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t11, i14, i18);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i18), bArr, i11, i12, (i13 & (-8)) | 4, registers);
                    storeOneofMessageField(t11, i14, i18, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t11, j12);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t11, j12, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i17) {
            case 18:
            case 35:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i11, protobufList, registers);
                }
                if (i15 == 1) {
                    return ArrayDecoders.decodeDoubleList(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 19:
            case 36:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i11, protobufList, registers);
                }
                if (i15 == 5) {
                    return ArrayDecoders.decodeFloatList(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeVarint64List(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeVarint32List(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i11, protobufList, registers);
                }
                if (i15 == 1) {
                    return ArrayDecoders.decodeFixed64List(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i11, protobufList, registers);
                }
                if (i15 == 5) {
                    return ArrayDecoders.decodeFixed32List(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 25:
            case 42:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeBoolList(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 26:
                if (i15 == 2) {
                    return (j11 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i13, bArr, i11, i12, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 27:
                if (i15 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i16), i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 28:
                if (i15 == 2) {
                    return ArrayDecoders.decodeBytesList(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 30:
            case 44:
                if (i15 != 2) {
                    if (i15 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i13, bArr, i11, i12, protobufList, registers);
                    }
                    return i11;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i11, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t11, i14, (List<Integer>) protobufList, getEnumFieldVerifier(i16), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeSInt32List(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 34:
            case 48:
                if (i15 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i11, protobufList, registers);
                }
                if (i15 == 0) {
                    return ArrayDecoders.decodeSInt64List(i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            case 49:
                if (i15 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i16), i13, bArr, i11, i12, protobufList, registers);
                }
                return i11;
            default:
                return i11;
        }
    }

    private int positionForFieldNumber(int i11) {
        if (i11 < this.minFieldNumber || i11 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i11, 0);
    }

    private int presenceMaskAndOffsetAt(int i11) {
        return this.buffer[i11 + 2];
    }

    private <E> void readGroupList(Object obj, long j11, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j11), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i11, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i11)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i11, Reader reader) {
        if (isEnforceUtf8(i11)) {
            UnsafeUtil.putObject(obj, offset(i11), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i11), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i11), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i11, Reader reader) {
        if (isEnforceUtf8(i11)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i11)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i11)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t11, int i11) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11);
        long j11 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j11 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t11, j11, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t11, j11));
    }

    private void setOneofPresent(T t11, int i11, int i12) {
        UnsafeUtil.putInt(t11, presenceMaskAndOffsetAt(i12) & 1048575, i11);
    }

    private int slowPositionForFieldNumber(int i11, int i12) {
        int length = (this.buffer.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int iNumberAt = numberAt(i14);
            if (i11 == iNumberAt) {
                return i14;
            }
            if (i11 < iNumberAt) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i11, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i12;
        Class<?> messageFieldClass;
        int i13;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i11] = fieldInfo.getFieldNumber();
            int i14 = i11 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i12 = 536870912;
            } else {
                i12 = 0;
            }
            iArr[i14] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i12 | (iId << 20) | iObjectFieldOffset;
            iArr[i11 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i11 / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i11 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i13 = (i11 / 3) * 2;
            objArr[i13] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i13 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i13 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + 51;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i11] = fieldInfo.getFieldNumber();
        int i15 = i11 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i12 = 536870912;
        } else {
            i12 = 0;
        }
        iArr[i15] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i12 | (iId << 20) | iObjectFieldOffset;
        iArr[i11 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i11 / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[((i11 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i13 = (i11 / 3) * 2;
        objArr[i13] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i13 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i13 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private void storeMessageField(T t11, int i11, Object obj) {
        UNSAFE.putObject(t11, offset(typeAndOffsetAt(i11)), obj);
        setFieldPresent(t11, i11);
    }

    private void storeOneofMessageField(T t11, int i11, int i12, Object obj) {
        UNSAFE.putObject(t11, offset(typeAndOffsetAt(i12)), obj);
        setOneofPresent(t11, i11, i12);
    }

    private static int type(int i11) {
        return (i11 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i11) {
        return this.buffer[i11 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t11, Writer writer) {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<T> extensions = messageSchema.extensionSchema.getExtensions(t11);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = messageSchema.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i15);
            int iNumberAt = messageSchema.numberAt(i15);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i17 = messageSchema.buffer[i15 + 2];
                z11 = true;
                int i18 = i17 & 1048575;
                if (i18 != i14) {
                    i16 = i18 == 1048575 ? 0 : unsafe.getInt(t11, i18);
                    i14 = i18;
                }
                i11 = i14;
                i12 = i16;
                i13 = 1 << (i17 >>> 20);
            } else {
                z11 = true;
                i11 = i14;
                i12 = i16;
                i13 = 0;
            }
            while (entry != null && messageSchema.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                messageSchema.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeDouble(iNumberAt, doubleAt(t11, jOffset));
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeFloat(iNumberAt, floatAt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeBool(iNumberAt, booleanAt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t11, jOffset), writer);
                    }
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t11, jOffset), messageSchema.getMessageFieldSchema(i15));
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t11, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t11, i15, i11, i12, i13)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t11, jOffset), messageSchema.getMessageFieldSchema(i15));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, messageSchema.getMessageFieldSchema(i15));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer);
                    break;
                case 29:
                    z12 = false;
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 30:
                    z12 = false;
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 31:
                    z12 = false;
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 32:
                    z12 = false;
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 33:
                    z12 = false;
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 34:
                    z12 = false;
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, z11);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(messageSchema.numberAt(i15), (List) unsafe.getObject(t11, jOffset), writer, messageSchema.getMessageFieldSchema(i15));
                    break;
                case 50:
                    messageSchema.writeMapHelper(writer, iNumberAt, unsafe.getObject(t11, jOffset), i15);
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t11, jOffset));
                    }
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t11, jOffset));
                    }
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t11, jOffset));
                    }
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t11, jOffset));
                    }
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t11, jOffset));
                    }
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t11, jOffset));
                    }
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t11, jOffset));
                    }
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t11, jOffset));
                    }
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t11, jOffset), writer);
                    }
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t11, jOffset), messageSchema.getMessageFieldSchema(i15));
                    }
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t11, jOffset));
                    }
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t11, jOffset));
                    }
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t11, jOffset));
                    }
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t11, jOffset));
                    }
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t11, jOffset));
                    }
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t11, jOffset));
                    }
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t11, jOffset));
                    }
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t11, iNumberAt, i15)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t11, jOffset), messageSchema.getMessageFieldSchema(i15));
                    }
                    break;
                default:
                    break;
            }
            i15 += 3;
            i16 = i12;
            i14 = i11;
            entry = entry;
        }
        while (entry != null) {
            messageSchema.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t11, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t11, Writer writer) {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t11, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t11);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t11, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t11, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t11, length)) {
                        writer.writeInt64(iNumberAt, longAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t11, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t11, length)) {
                        writer.writeInt32(iNumberAt, intAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t11, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t11, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t11, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t11, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t11, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t11, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t11, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t11, length)) {
                        writer.writeEnum(iNumberAt, intAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t11, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t11, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t11, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t11, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t11, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t11, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t11, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t11, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i11, Object obj, int i12) {
        if (obj != null) {
            writer.writeMap(i11, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i12)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i11, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i11, (String) obj);
        } else {
            writer.writeBytes(i11, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t11, Writer writer) {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t11), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t11, T t12) {
        int length = this.buffer.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!equals(t11, t12, i11)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t11).equals(this.unknownFieldSchema.getFromMessage(t12))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t11).equals(this.extensionSchema.getExtensions(t12));
        }
        return true;
    }

    int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 com.google.protobuf.MessageSchema<T>) = 
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v24 com.google.protobuf.MessageSchema<T>)
      (r0v30 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t11) {
        int i11;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t12 = t11;
        Unsafe unsafe = UNSAFE;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < messageSchema.buffer.length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i13);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = messageSchema.numberAt(i13);
            int i17 = messageSchema.buffer[i13 + 2];
            int i18 = i17 & i12;
            if (iType <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(t12, i18);
                    i16 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            int i19 = i15;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i18 = 0;
            }
            switch (iType) {
                case 0:
                    if (!messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, BitmapDescriptorFactory.HUE_RED);
                        i15 = i19 + iComputeFloatSize;
                        messageSchema = this;
                        t12 = t11;
                    }
                    messageSchema = this;
                    t12 = t11;
                    i15 = i19;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i15 = i19 + iComputeFloatSize;
                        messageSchema = this;
                        t12 = t11;
                    }
                    messageSchema = this;
                    t12 = t11;
                    i15 = i19;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i15 = i19 + iComputeFloatSize;
                        messageSchema = this;
                        t12 = t11;
                    }
                    messageSchema = this;
                    t12 = t11;
                    i15 = i19;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i15 = i19 + iComputeFloatSize;
                        messageSchema = this;
                        t12 = t11;
                    }
                    messageSchema = this;
                    t12 = t11;
                    i15 = i19;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        Object object = unsafe.getObject(t12, jOffset);
                        iComputeInt64Size = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 9:
                    if (!messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t12, jOffset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i15 = i19 + iComputeFloatSize;
                        messageSchema = this;
                        t12 = t11;
                    }
                    messageSchema = this;
                    t12 = t11;
                    i15 = i19;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i15 = i19 + iComputeFloatSize;
                        messageSchema = this;
                        t12 = t11;
                    }
                    messageSchema = this;
                    t12 = t11;
                    i15 = i19;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t12, jOffset));
                        i15 = i19 + iComputeInt64Size;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    i15 = i19;
                    break;
                case 17:
                    if (!messageSchema.isFieldPresent(t12, i13, i16, i14, i11)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t12, jOffset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t12, jOffset));
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t12, jOffset), messageSchema.getMessageFieldSchema(i13));
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t12, jOffset));
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t12, jOffset), false);
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t12, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i15 = i19;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t12, i18, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i15 = i19 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 49:
                    iComputeDoubleSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t12, jOffset), messageSchema.getMessageFieldSchema(i13));
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = messageSchema.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t12, jOffset), messageSchema.getMapFieldDefaultEntry(i13));
                    i15 = i19 + iComputeDoubleSize;
                    break;
                case 51:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, BitmapDescriptorFactory.HUE_RED);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        Object object2 = unsafe.getObject(t12, jOffset);
                        iComputeDoubleSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 60:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t12, jOffset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t12, jOffset));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (!messageSchema.isOneofPresent(t12, iNumberAt, i13)) {
                        i15 = i19;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t12, jOffset), messageSchema.getMessageFieldSchema(i13));
                        i15 = i19 + iComputeDoubleSize;
                    }
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int unknownFieldsSerializedSize = i15 + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t12);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t12).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t11) {
        int i11;
        int iHashLong;
        int length = this.buffer.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iNumberAt = numberAt(i13);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t11, jOffset)));
                    i12 = i11 + iHashLong;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 2:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 3:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getInt(t11, jOffset);
                    i12 = i11 + iHashLong;
                    break;
                case 5:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getInt(t11, jOffset);
                    i12 = i11 + iHashLong;
                    break;
                case 7:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t11, jOffset)).hashCode();
                    i12 = i11 + iHashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t11, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t11, jOffset).hashCode();
                    i12 = i11 + iHashLong;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getInt(t11, jOffset);
                    i12 = i11 + iHashLong;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getInt(t11, jOffset);
                    i12 = i11 + iHashLong;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getInt(t11, jOffset);
                    i12 = i11 + iHashLong;
                    break;
                case 14:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getInt(t11, jOffset);
                    i12 = i11 + iHashLong;
                    break;
                case 16:
                    i11 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t11, jOffset));
                    i12 = i11 + iHashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t11, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t11, jOffset).hashCode();
                    i12 = i11 + iHashLong;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t11, jOffset).hashCode();
                    i12 = i11 + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t11, jOffset)));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = oneofIntAt(t11, jOffset);
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = oneofIntAt(t11, jOffset);
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t11, jOffset)).hashCode();
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t11, jOffset).hashCode();
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t11, jOffset).hashCode();
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = oneofIntAt(t11, jOffset);
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = oneofIntAt(t11, jOffset);
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = oneofIntAt(t11, jOffset);
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = oneofIntAt(t11, jOffset);
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t11, jOffset));
                        i12 = i11 + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t11, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t11, jOffset).hashCode();
                        i12 = i11 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i12 * 53) + this.unknownFieldSchema.getFromMessage(t11).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t11).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t11) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.checkInitializedCount) {
            int i16 = this.intArray[i14];
            int iNumberAt = numberAt(i16);
            int iTypeAndOffsetAt = typeAndOffsetAt(i16);
            int i17 = this.buffer[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i13) {
                if (i18 != 1048575) {
                    i15 = UNSAFE.getInt(t11, i18);
                }
                i12 = i15;
                i11 = i18;
            } else {
                i11 = i13;
                i12 = i15;
            }
            T t12 = t11;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t12, i16, i11, i12, i19)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t12, i16, i11, i12, i19) && !isInitialized(t12, iTypeAndOffsetAt, getMessageFieldSchema(i16))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t12, iTypeAndOffsetAt, i16)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t12, iNumberAt, i16) && !isInitialized(t12, iTypeAndOffsetAt, getMessageFieldSchema(i16))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t12, iTypeAndOffsetAt, i16)) {
                    return false;
                }
            } else if (!isListInitialized(t12, iTypeAndOffsetAt, i16)) {
                return false;
            }
            i14++;
            t11 = t12;
            i13 = i11;
            i15 = i12;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t11).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t11) {
        if (isMutable(t11)) {
            if (t11 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t11;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i11 = 0; i11 < length; i11 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i11);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t11, i11)) {
                                    getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(t11, jOffset));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t11, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t11, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t11, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(t11, numberAt(i11), i11)) {
                        getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(t11, jOffset));
                    }
                } else if (isFieldPresent(t11, i11)) {
                    getMessageFieldSchema(i11).makeImmutable(UNSAFE.getObject(t11, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t11);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t11);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t11, T t12) {
        checkMutable(t11);
        t12.getClass();
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            mergeSingleField(t11, t12, i11);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t11, t12);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t11, t12);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @com.google.protobuf.CanIgnoreReturnValue
    int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t11, Writer writer) {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t11, writer);
        } else {
            writeFieldsInAscendingOrder(t11, writer);
        }
    }

    private boolean isFieldPresent(T t11, int i11) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i11);
        long j11 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j11 != 1048575) {
            return (UnsafeUtil.getInt(t11, j11) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i11);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t11, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t11, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t11, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t11, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t11, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t11, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t11, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t11, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t11, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                }
                break;
            case 9:
                return UnsafeUtil.getObject(t11, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t11, jOffset));
                break;
            case 11:
                return UnsafeUtil.getInt(t11, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t11, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t11, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t11, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t11, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t11, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t11, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private int positionForFieldNumber(int i11, int i12) {
        if (i11 < this.minFieldNumber || i11 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i11, i12);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t11, Reader reader, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        checkMutable(t11);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t11, reader, extensionRegistryLite);
    }

    private boolean equals(T t11, T t12, int i11) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i11);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t11, t12, i11) && Double.doubleToLongBits(UnsafeUtil.getDouble(t11, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t12, jOffset));
            case 1:
                return arePresentForEquals(t11, t12, i11) && Float.floatToIntBits(UnsafeUtil.getFloat(t11, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t12, jOffset));
            case 2:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, jOffset) == UnsafeUtil.getLong(t12, jOffset);
            case 3:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, jOffset) == UnsafeUtil.getLong(t12, jOffset);
            case 4:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, jOffset) == UnsafeUtil.getInt(t12, jOffset);
            case 5:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, jOffset) == UnsafeUtil.getLong(t12, jOffset);
            case 6:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, jOffset) == UnsafeUtil.getInt(t12, jOffset);
            case 7:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getBoolean(t11, jOffset) == UnsafeUtil.getBoolean(t12, jOffset);
            case 8:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            case 9:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            case 10:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            case 11:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, jOffset) == UnsafeUtil.getInt(t12, jOffset);
            case 12:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, jOffset) == UnsafeUtil.getInt(t12, jOffset);
            case 13:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, jOffset) == UnsafeUtil.getInt(t12, jOffset);
            case 14:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, jOffset) == UnsafeUtil.getLong(t12, jOffset);
            case 15:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getInt(t11, jOffset) == UnsafeUtil.getInt(t12, jOffset);
            case 16:
                return arePresentForEquals(t11, t12, i11) && UnsafeUtil.getLong(t11, jOffset) == UnsafeUtil.getLong(t12, jOffset);
            case 17:
                return arePresentForEquals(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t11, t12, i11) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t11, jOffset), UnsafeUtil.getObject(t12, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t11, byte[] bArr, int i11, int i12, ArrayDecoders.Registers registers) {
        parseMessage(t11, bArr, i11, i12, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i11, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i11)));
    }
}
