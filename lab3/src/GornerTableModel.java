import javax.swing.table.AbstractTableModel;

public class GornerTableModel extends AbstractTableModel  {
    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;
    public GornerTableModel( Double from, Double to,Double step,Double [] coefficients)
    {
        this.coefficients=coefficients;
        this.from=from;
        this.to=to;
        this.step = step;
    }
    public Double getFrom()
    {
        return from;
    }
    public Double getTo()
    {
        return to;
    }
    public Double getStep()
    {
        return step;
    }
    @Override
    public int getRowCount() {return new Double (Math.ceil((to-from)/step)).intValue()+1;}

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int col) {
        double x = from + step * row;
        Double result = 0.0;

        for (int i = coefficients.length - 1; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
        boolean isExactValue;
        double fractionalPart = result - Math.floor(result);
        if(fractionalPart==0)
        {
            isExactValue=true;
        }
        else isExactValue=false;

        switch(col) {
            case 0:
                return x;
            case 1:
                return result;
            case 2:
                return isExactValue;
        }
        return 0;
    }






    @Override  public Class<?> getColumnClass(int col) {
        if (col == 2)
            return Boolean.class;
        else
            return Double.class;
    }

    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Значение X"; // Название 1-го столбца
            case 1:
                return "Значение многочлена"; // Название 2-го столбца
            case 2:
                return "Точное значение?";
        }
        return null;
    }
}



