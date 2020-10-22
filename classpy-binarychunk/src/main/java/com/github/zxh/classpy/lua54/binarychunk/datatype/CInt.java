package com.github.zxh.classpy.lua54.binarychunk.datatype;

import com.github.zxh.classpy.lua54.binarychunk.BinaryChunkPart;
import com.github.zxh.classpy.lua54.binarychunk.BinaryChunkReader;

/**
 * c int.
 *
 * @see /lua/src/ldump.c#DumpInt()
 */
public class CInt extends BinaryChunkPart {

    private long value;

    public long getValue() {
        return value;
    }

    @Override
    protected void readContent(BinaryChunkReader reader) {
        value = reader.readCInt();
        setDesc(Long.toString(value));
    }

}
