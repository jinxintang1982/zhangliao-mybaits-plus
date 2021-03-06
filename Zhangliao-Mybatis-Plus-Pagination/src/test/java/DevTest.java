import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sanguo.zhangliao.mybatis.plus.MegviiApplication;
import sanguo.zhangliao.mybatis.plus.domain.db.service.ITStationService;
import sanguo.zhangliao.mybatis.plus.domain.service.IPaginationService;


/**
 * @description:
 * @author: zhangchangzhi
 * @create: 2021-06-14 23:35
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MegviiApplication.class)
public class DevTest {
    @Autowired
    IPaginationService iPaginationService;
    @Autowired
    ITStationService itStationService;
    @Test
    public void test(){
        itStationService.listPage(null,5,3);
        System.out.println("---------------------------");
        itStationService.listPageNoSearch(null,5,3);
        System.out.println("---------------------------");
        itStationService.listPageSetTotal(null,5,3);
        System.out.println("---------------------------");
        itStationService.listPageSetTotalNoSearch(null,5,3);
    }
}
