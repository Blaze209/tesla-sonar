package com.google.protobuf;

/* JADX INFO: loaded from: classes6.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    UnknownFieldSchema() {
    }

    private final void mergeFrom(B b11, Reader reader, int i11) {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b11, reader, i11)) {
        }
    }

    abstract void addFixed32(B b11, int i11, int i12);

    abstract void addFixed64(B b11, int i11, long j11);

    abstract void addGroup(B b11, int i11, T t11);

    abstract void addLengthDelimited(B b11, int i11, ByteString byteString);

    abstract void addVarint(B b11, int i11, long j11);

    abstract B getBuilderFromMessage(Object obj);

    abstract T getFromMessage(Object obj);

    abstract int getSerializedSize(T t11);

    abstract int getSerializedSizeAsMessageSet(T t11);

    abstract void makeImmutable(Object obj);

    abstract T merge(T t11, T t12);

    final boolean mergeOneFieldFrom(B b11, Reader reader, int i11) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b11, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b11, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b11, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b11, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i12 = i11 + 1;
        if (i12 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i12);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b11, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    abstract B newBuilder();

    abstract void setBuilderToMessage(Object obj, B b11);

    public void setRecursionLimit(int i11) {
        recursionLimit = i11;
    }

    abstract void setToMessage(Object obj, T t11);

    abstract boolean shouldDiscardUnknownFields(Reader reader);

    abstract T toImmutable(B b11);

    abstract void writeAsMessageSetTo(T t11, Writer writer);

    abstract void writeTo(T t11, Writer writer);
}
