package com.github.zxh.classpy.lua54.binarychunk;

import com.github.zxh.classpy.lua54.binarychunk.datatype.LuByte;
import com.github.zxh.classpy.lua54.binarychunk.part.Function;
import com.github.zxh.classpy.lua54.binarychunk.part.Header;

/**
 * Represent lua binary chunk file.
 * 
 * @see /lua/src/ldump.c#luaU_dump().
 */
public class BinaryChunkFile extends BinaryChunkPart {

    {
        add("header",        new Header());
        add("size_upvalues", new LuByte());
        add("main",        new Function());
    }

}
