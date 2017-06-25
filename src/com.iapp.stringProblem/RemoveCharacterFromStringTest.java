package com.iapp.stringProblem;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by katthy on 6/24/17.
 * Test the two methods of class: RemoveCharacterFromString
 */
public class RemoveCharacterFromStringTest{

    RemoveCharacterFromString actual;

    @BeforeClass
    public void setUp(){
        actual=new RemoveCharacterFromString();

    }

    @Test(dataProvider = "inputAndOutputData")
    public void testRemoveCharacterFromString(String str, Character c, String res) throws Exception {
        String act = actual.removeCharacterFromString(str, c);
        Assert.assertEquals(act, res);

    }

    @Test(dataProvider = "inputAndOutputData")
    public void testReplaceCharacterToEmptyOfString(String str, Character c, String res) throws Exception {
        String act = actual.replaceCharacterToEmptyOfString(str, c);
        Assert.assertEquals(act, res);
    }

    @DataProvider
    public static Object[][] inputAndOutputData() {
        return new Object[][] { /*one instance of character*/{ "abcde", 'a', "bcde" },
                /*multiple instances of character*/{ "cdefd", 'd', "cef" },
                /*no instance of character*/{"abd", 'c', "abd"},
                /*instance of special character*/{"ASDFAS#%@#$%sdfsdgsgsrg34523452---==", '%', "ASDFAS#@#$sdfsdgsgsrg34523452---=="},
                /*string is null*/{null, 'c', ""},
                /*string is empty*/{"", 'c', ""},
                /*character is null*/{"abc", null, "abc"},
                /*character is empty*/{"abc", ' ', "abc"}
        };

    }

}