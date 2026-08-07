package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int i11);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i11);

    ByteString getOneofsBytes(int i11);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
