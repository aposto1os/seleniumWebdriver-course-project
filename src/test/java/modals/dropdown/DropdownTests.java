package modals.dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        String option = "Option 1";
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectOption(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1);
        Assert.assertTrue(selectedOptions.contains(option));
    }
}
