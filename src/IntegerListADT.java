
    public class IntegerListADT

    {

        private int[] list = new int[10];

//	by default, an integer list is empty if ALL the elements are zero

//	an integer list is full if ALL the elements are non-zero





        private int bottom = -1;



        int get(int index)

        {



            int item = 0;

            // check if list is not empty

            if (!isEmpty())

            {

                item = list[index];

            }



            return item;

        }



        //	create method for inserting a value in the list

        void insert(int value)

        {

            if (!isFull())

            {

                for (int i = 0; i < list.length; i++)   //  traverse all the items of the list

                {

                    if (list[i] == 0)   //  check which of the list item is 0

                    {

                        list[i] = value;    //  insert the value at the current index

                        bottom++;   //  increase bottom index

                        break;  //  break out of the loop

                    }

                }

            }

        }



        int remove(int value)

        {

            int item = 0;

            if (!isEmpty()) //  check if the list is not empty

            {

                for (int i = 0; i < list.length; i++)

                {

                    // check if the value is in the list

                    if (list[i] == value)

                    {

                        item = list[i];

                        //  list[index] = 0;

                        // optional code

                        int j = 0;

                        for (j = i; j < list.length - 1; j++)

                        {

                            list[j] = list[j + 1];

                        }

                        list[j] = 0;

                        break;

                    }

                }

            }

            return item;

        }



        int removeAt(int index)

        {

            int item = 0;

            // check if the list is not empty

            if (!isEmpty())

            {

                item = list[index];

                int j = 0;

                for (j = index; j < list.length - 1; j++)

                {

                    list[j] = list[j + 1];

                }

                list[j] = 0;

            }

            return item;

        }



        void replace(int index, int value)

        {

            if (!isEmpty())

            {

                list[index] = value;

            }

        }



        int size()

        {

            int ctr = 0;



            for (int i = 0; i < list.length; i++)

            {

                if (list[i] != 0)

                {

                    ctr++;

                }

            }



            return ctr;

        }



        boolean isEmpty()

        {



            boolean response = false;



            if (bottom == -1)

            {

                response = true;

            }



            return response;

        }



        boolean isFull()

        {

            boolean response = false;



            if (bottom == list.length - 1 && list[list.length - 1] != 0)

            {

                response = false;

            }





            return response;

        }



    }

