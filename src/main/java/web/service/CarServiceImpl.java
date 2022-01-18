package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList= new ArrayList<>();

            carList.add(new Car("", "", 0));
            carList.add(new Car("", "", 0));
            carList.add(new Car("", "", 0));
            carList.add(new Car("", "", 0));
            carList.add(new Car("", "", 0));


        return count == null || count > carList.size() ? carList : carList.subList(0,count);
    }
}